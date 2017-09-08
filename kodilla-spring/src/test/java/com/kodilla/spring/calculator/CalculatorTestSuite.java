package com.kodilla.spring.calculator;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CalculatorTestSuite {

    @Test
    public void addTest(){
        //given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.calculator");
        Calculator calculator = context.getBean(Calculator.class);

        //when
        calculator.add(10.0, 5.0);

        //then

    }

    @Test
    public void subTest(){
        //given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.calculator");
        Calculator calculator = context.getBean(Calculator.class);

        //when
        calculator.sub(10.0, 5.0);

        //then

    }

    @Test
    public void mulTest(){
        //given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.calculator");
        Calculator calculator = context.getBean(Calculator.class);

        //when
        calculator.mul(10.0, 5.0);

        //then

    }

    @Test
    public void divTest(){
        //given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.calculator");
        Calculator calculator = context.getBean(Calculator.class);

        //when
        calculator.div(10.0, 5.0);

        //then
    }
}
