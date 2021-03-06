package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class GrilledVegetablesPizzaDecorator extends AbstractPizaaDecorator {

    public GrilledVegetablesPizzaDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public BigDecimal getPrice() {
        return super.getPrice().add(new BigDecimal(4));
    }

    @Override
    public String getIngredients() {
        return super.getIngredients() + "z grilowanymi warzywami ";
    }
}
