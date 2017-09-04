package com.kodilla.good.patterns.flight;

import java.util.ArrayList;
import java.util.List;

public class FlightMain {

    public static void main(String args[]) {

        FlightBase flightBase = FlightBase.createFlightBase();
        FlightFinder flightFinder = new FlightFinder();
        List<String> operationalList = new ArrayList<>();

        operationalList = flightFinder.searchFlightFrom(flightBase, "Madryt");
            if (!operationalList.isEmpty()){
                System.out.println("Z danego lotniska można dolecieć do lotnisk:");
                operationalList.forEach(System.out::println);
            }
            else{
                System.out.println("Z danego lotniska nie ma odlotów");
            }

        operationalList =  flightFinder.searchFlightTo(flightBase, "Warszawa");
            if (!operationalList.isEmpty()){
                System.out.println("Do danego lotniska można dolecieć z lotnisk:");
                operationalList.forEach(System.out::println);
            }
            else{
                System.out.println("Do danego lotniska nie ma odlotów");
            }

        operationalList = flightFinder.searchFlight(flightBase, "Warszawa", "Madryt");
            if(!operationalList.isEmpty()){
                System.out.println("Wymagana przesiadka na jednym z lotnisk:");
                operationalList.forEach(System.out::println);
            }
            else{
                System.out.println("Nie da się przelecieć między danymi lotniskami");
            }


        operationalList = flightFinder.searchFlight(flightBase, "Warszawa", "Barcelona");
            if(!operationalList.isEmpty()){
                System.out.println("Wymagana przesiadka na jednym z lotnisk:");
                operationalList.forEach(System.out::println);
            }
            else{
                System.out.println("Nie da się przelecieć między danymi lotniskami");
            }
    }



}
