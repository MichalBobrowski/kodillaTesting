package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class ChickenMeatPizzaDecorator extends  AbstractPizaaDecorator {
    public ChickenMeatPizzaDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public BigDecimal getPrice() {
        return super.getPrice().add(new BigDecimal(5));
    }

    @Override
    public String getIngredients() {
        return super.getIngredients() + " mięso z kurczaka ";
    }
}
