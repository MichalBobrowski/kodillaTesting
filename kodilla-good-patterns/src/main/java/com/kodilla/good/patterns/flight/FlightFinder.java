package com.kodilla.good.patterns.flight;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FlightFinder {


    public List<String> searchFlight (FlightBase flightBase ,String departureAirport, String arrivalAirport) {

        List<String> flightFromList = flightBase.getFlightBase().stream()
                .filter( o -> o.getDepartureAirport().equals(departureAirport))
                .map(f -> f.getArrivalAirport())
                .collect(Collectors.toList());

        List<String> flightToList = flightBase.getFlightBase().stream()
                .filter(o -> o.getArrivalAirport().equals(arrivalAirport))
                .map(f -> f.getDepartureAirport())
                .collect(Collectors.toList());

        return FlightFinder.commonAirportes(flightToList, flightFromList);
    }

    public List<String> searchFlightFrom (FlightBase flightBase, String departureAirport){
        List flightFromList = flightBase.getFlightBase().stream()
                .filter( o -> o.getDepartureAirport().equals(departureAirport))
                .map(f -> f.getArrivalAirport())
                .collect(Collectors.toList());
        return flightFromList;
    }

    public List<String> searchFlightTo (FlightBase flightBase, String arrivalAirport){

        List flightToList = flightBase.getFlightBase().stream()
                .filter(o -> o.getArrivalAirport().equals(arrivalAirport))
                .map(f -> f.getDepartureAirport())
                .collect(Collectors.toList());
        return flightToList;
    }


    public static List<String> commonAirportes(List<String> flightToList , List<String> flightFromList){
        List<String> commonAirportes = new ArrayList<>();
        for ( String commonAirport : flightFromList ) {
            if(flightToList.contains(commonAirport))
                commonAirportes.add(commonAirport);
        }
        return commonAirportes;
    }

}
