package com.kodilla.good.patterns.flight;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FlightFinder {


    public void searchFlight (FlightBase flightBase ,String departureAirport, String arrivalAirport) {

        List flightFromList = flightBase.getFlightBase().stream()
                .filter( o -> o.getDepartureAirport().equals(departureAirport))
                .map(f -> f.getArrivalAirport())
                .collect(Collectors.toList());

        List flightToList = flightBase.getFlightBase().stream()
                .filter(o -> o.getArrivalAirport().equals(arrivalAirport))
                .map(f -> f.getDepartureAirport())
                .collect(Collectors.toList());

        System.out.println(FlightFinder.commonAirportes(flightToList, flightFromList));
    }
    public void searchFlightFrom (FlightBase flightBase, String departureAirport){
        List flightFromList = flightBase.getFlightBase().stream()
                .filter( o -> o.getDepartureAirport().equals(departureAirport))
                .map(f -> f.getArrivalAirport())
                .collect(Collectors.toList());
        if (!flightFromList.isEmpty()){
            System.out.println("Lotnika na które można polecieć z lotniska " + departureAirport + ":");
            flightFromList.stream().forEach(System.out::println);
        }

    }

    public void searchFlightTo (FlightBase flightBase, String arrivalAirport){

        List flightToList = flightBase.getFlightBase().stream()
                .filter(o -> o.getArrivalAirport().equals(arrivalAirport))
                .map(f -> f.getDepartureAirport())
                .collect(Collectors.toList());
        if (!flightToList.isEmpty()){
            System.out.println("Do lotniska  " + arrivalAirport + " można polecieć z lotnisk:");
            flightToList.stream().forEach(System.out::println);
        }
    }


    public static String commonAirportes(List<String> flightToList , List<String> flightFromList){
        for ( String commonAirport : flightFromList ) {
            if(flightToList.contains(commonAirport))
                return "Żeby zrealizować lot między zadanymi lotniskami wymagana jest przesiadka w " + commonAirport;
        }
        return "Nie da się przelecieć między tymi miastami";
    }

}
