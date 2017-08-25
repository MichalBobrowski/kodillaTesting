package com.kodilla.exception.challenge;

import javax.xml.bind.SchemaOutputResolver;

public class FirstChallenge {

    public double divide(double a, double b) throws ArithmeticException {
        if(b == 0){
            throw new ArithmeticException();
        }
        return a / b;
    }

    /**
     * This main can throw an ArithmeticException!!!
     * @param args
     */
    public static void main(String[] args) {

        FirstChallenge firstChallenge = new FirstChallenge();

        try {
            double result = firstChallenge.divide(3, 0);
            System.out.println(result);
        } catch(ArithmeticException e) {
            System.out.println("Szanowny Panie, uprzejmie informuję, że nie wolno dzielić przez 0");
        }
        finally {
            System.out.println("Wykonano próbę dzielenia");
        }



    }
}


