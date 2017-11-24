package com.kodilla.patterns2.fascade;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

import static java.awt.SystemColor.info;


@Component
@EnableAspectJAutoProxy
public class OrderFacade {
    @Autowired
    private ShopService shopService;
    private static final Logger LOGGER = LoggerFactory.getLogger(OrderFacade.class);

    public void processOrder(final OrderDto order, final Long userId) throws OrderProccesingException {
        boolean wasError = false;
        long orderId = shopService.openOrder(userId);
        LOGGER.info("Registering new Order, ID: " + orderId);
        if (orderId < 0) {
            LOGGER.error(OrderProccesingException.ERR_NOT_AUTHORIZED);
            wasError = true;
            throw new OrderProccesingException(OrderProccesingException.ERR_NOT_AUTHORIZED);
        }
        try {
            for (ItemDto orderItem : order.getItems()) {
                LOGGER.info("Adding item " + orderItem.getProductId() + ", " + orderItem.getQuantity() + " pos");
                shopService.addItem(orderId, orderItem.getProductId(), orderItem.getQuantity());
            }
            BigDecimal value = shopService.calculateValue(orderId);
            LOGGER.info("Order value is: " + value);
            if (!shopService.doPayment(orderId)) {
                LOGGER.error(OrderProccesingException.ERR_PAYMENT_REJECTED);
                wasError = true;
                throw new OrderProccesingException(OrderProccesingException.ERR_PAYMENT_REJECTED);
            }
            LOGGER.info("Payment for order was done");
            if (!shopService.verifyOrder(orderId)) {
                LOGGER.error(OrderProccesingException.ERR_NOT_AUTHORIZED);
                wasError = true;
                throw new OrderProccesingException(OrderProccesingException.ERR_VERIFICATION_ERROR);
            }
            LOGGER.info("Order is ready to submit");
            if (!shopService.submitOrder(orderId)) {
                LOGGER.error(OrderProccesingException.ERR_SUBMITTING_ERROR);
                wasError = true;
                throw new OrderProccesingException(OrderProccesingException.ERR_SUBMITTING_ERROR);
            }
            LOGGER.info("Order " + orderId + " submitted");
        } finally {
            if (wasError == true) {
                LOGGER.info("Cacneling order " + orderId);
                shopService.cancelOrder(orderId);
            }
        }
    }
}