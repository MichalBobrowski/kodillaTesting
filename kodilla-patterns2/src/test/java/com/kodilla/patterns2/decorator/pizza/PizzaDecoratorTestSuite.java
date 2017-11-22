package com.kodilla.patterns2.decorator.pizza;


import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;


public class PizzaDecoratorTestSuite {

    @Test
    public void PizzaDecoratorTest() {
        //given
        Pizza thePizza = new BasicPizza();
        thePizza = new PiePizzaDecorator(thePizza);
        thePizza = new ChickenMeatPizzaDecorator(thePizza);
        thePizza = new GrilledVegetablesPizzaDecorator(thePizza);

        System.out.println(thePizza.getPrice());
        System.out.println(thePizza.getIngredients());

        Assert.assertEquals(new BigDecimal(28), thePizza.getPrice());
        Assert.assertEquals("Podstawa z sosem pomidorowym (grube ciasto)  mięso z kurczaka z grilowanymi warzywami ", thePizza.getIngredients());
    }
}