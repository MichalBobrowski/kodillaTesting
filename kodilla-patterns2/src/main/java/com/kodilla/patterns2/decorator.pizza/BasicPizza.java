package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class BasicPizza implements Pizza{

    @Override
    public BigDecimal getPrice() {
        return new BigDecimal((15.0));
    }

    @Override
    public String getIngredients() {
        return "Podstawa z sosem pomidorowym ";
    }
}
