package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {

    public static void main(String[] args) {

        Calculator calculator1 = new Calculator();
        int a = 10, b = 5;

        if(calculator1.add(a , b) == a + b ){
            System.out.println("Test ok");
        }
        else{
            System.out.println("Error");
        }

        if(calculator1.subtract(a , b) == a - b ){
            System.out.println("Test ok");
        }
        else{
            System.out.println("Error");
        }

    }

}