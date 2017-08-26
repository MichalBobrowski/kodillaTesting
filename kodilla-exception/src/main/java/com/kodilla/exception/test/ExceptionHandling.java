package com.kodilla.exception.test;

public class ExceptionHandling {

    public static void main(String args[]){
        SecondChallenge secondChallenge = new SecondChallenge();

        try{
            secondChallenge.probablyIWillThrowException(4.0 , 1.9);
        }catch(Exception e){
            System.out.println("Wyłapano wyjątek");
        }
        finally {
            System.out.println("Uruchomiono metodę probablyWillThrowException");
        }
    }


}
