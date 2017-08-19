package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoeamBeautifier;
import com.kodilla.stream.iterate.NumbersGenerator;
import com.kodilla.stream.lambda.*;
import com.kodilla.stream.reference.FunctionalCalculator;

public class StreamMain {
    public static void main(String[] args) {
        /*ExpressionExecutor expressionExecutor = new ExpressionExecutor();

        PoeamBeautifier poeamBeautifier = new PoeamBeautifier();

        poeamBeautifier.beautify("Zdanie do upiększenia", (text -> "ABC " + text + " ABC"));
        poeamBeautifier.beautify("Zdanie do upiększenia", (text -> text.toUpperCase()));
        poeamBeautifier.beautify("Zdanie do upiększenia", (text -> text.replace(" ", "KUM")));
        poeamBeautifier.beautify("Zdanie do upiększenia", (text -> text.replaceAll("Zdanie", "Wyrażenie")));
        */
        System.out.println("Using Stream to generate even numbers from 1 to 20");
        NumbersGenerator.generateEven(20);

    }
}
