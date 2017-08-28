package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightFinder {

    public String findFlight (Flight flight) throws RouteNotFoundException {

        Map<String, Boolean> flightMap = flightMapCreator();
        String result = new String();

        try {
            for (Map.Entry<String, Boolean> entry : flightMap.entrySet()) {
                if (flight.getArrivalAirport().equals(entry.getKey())) {
                    if (entry.getValue()) result = "Na lotniko można dolecieć";
                    else result = "Na lotnikso nie można dolecieć";
                }
            }
            if(result.isEmpty()) throw new RouteNotFoundException();
        }catch (RouteNotFoundException e){
            System.out.println("Szukanego lotniska nie ma w rozkładzie lotów");
        }
        return result;
    }


    public HashMap<String, Boolean> flightMapCreator (){
        HashMap<String, Boolean> flightMap = new HashMap<>();

        flightMap.put("Warszawa", Boolean.TRUE);
        flightMap.put("Mexico", Boolean.FALSE);
        flightMap.put("Tokio", Boolean.FALSE);
        flightMap.put("Antananarywa", Boolean.TRUE);
        flightMap.put("Santiago", Boolean.FALSE);
        flightMap.put("Bandar Seri Begawan", Boolean.TRUE);
        flightMap.put("Sri Dźajawardanapura Kotte", Boolean.TRUE);

        return flightMap;
    }

}
