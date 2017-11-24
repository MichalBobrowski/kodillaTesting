package com.kodilla.patterns2.facade;

import com.kodilla.patterns2.fascade.ItemDto;
import com.kodilla.patterns2.fascade.OrderDto;
import com.kodilla.patterns2.fascade.OrderFacade;
import com.kodilla.patterns2.fascade.OrderProccesingException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class FacadeTestSuite {

    @Autowired
    private OrderFacade orderFacade;

    @Test
    public void testShopFacade(){
        OrderDto order = new OrderDto();
        order.addItem(new ItemDto(10L,2));
        order.addItem(new ItemDto(116L,3));
        order.addItem(new ItemDto(8L,6));
        order.addItem(new ItemDto(16L,2));

        try{
            orderFacade.processOrder(order, 1L);

        }catch(OrderProccesingException e){
        }
    }
}
