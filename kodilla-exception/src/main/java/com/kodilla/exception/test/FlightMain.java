package com.kodilla.exception.test;

public class FlightMain {
    public static void main(String args[]) throws RouteNotFoundException {

        Flight flight = new Flight("Moskwa", "Bandar Seri Begawan");
        Flight flightWrong = new Flight("Konstantynopol", "Mexico");
        Flight flightException = new Flight("Konstantynopol", "Bobrowniki");

        FlightFinder flightFinder = new FlightFinder();

        System.out.println(flightFinder.findFlight(flight));
        System.out.println(flightFinder.findFlight(flightWrong));
        System.out.println(flightFinder.findFlight(flightException));
    }
}

