package com.kodilla.good.patterns.flight;

public class FlightMain {

    public static void main(String args[]) {

        FlightBase flightBase = FlightBase.createFlightBase();
        FlightFinder flightFinder = new FlightFinder();

        flightFinder.searchFlightFrom(flightBase, "Madryt");
        flightFinder.searchFlightTo(flightBase, "Warszawa");
        flightFinder.searchFlight(flightBase, "Warszawa", "Madryt");
        flightFinder.searchFlight(flightBase, "Warszawa", "Barcelona");
    }



}
