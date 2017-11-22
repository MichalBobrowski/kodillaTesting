package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class PiePizzaDecorator extends AbstractPizaaDecorator {

    public PiePizzaDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public BigDecimal getPrice() {
        return super.getPrice().add(new BigDecimal(4));
    }

    @Override
    public String getIngredients() {
        return super.getIngredients() + "(grube ciasto) ";
    }
}
