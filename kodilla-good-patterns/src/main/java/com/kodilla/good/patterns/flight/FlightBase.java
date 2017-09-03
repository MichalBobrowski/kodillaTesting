package com.kodilla.good.patterns.flight;


import java.util.HashSet;
import java.util.Set;

public class FlightBase {

    Set<FlightRelation> flightBase = new HashSet<>();


    public FlightBase(Set<FlightRelation> flightBase) {
        this.flightBase = flightBase;
    }

    public Set<FlightRelation> getFlightBase() {
        return flightBase;
    }

    public void setFlightBase(Set<FlightRelation> flightBase) {
        this.flightBase = flightBase;
    }

    public static FlightBase createFlightBase(){
        Set<FlightRelation> flightSet = new HashSet<>();
        FlightRelation f1 = new FlightRelation("Warszawa", "Berlin");
        FlightRelation f2 = new FlightRelation("Warszawa", "Londyn");
        FlightRelation f3 = new FlightRelation("Warszawa", "Moskwa");
        FlightRelation f4 = new FlightRelation("Warszawa", "Antananarywa");

        FlightRelation f10 = new FlightRelation( "Berlin" ,"Warszawa");
        FlightRelation f20 = new FlightRelation("Londyn", "Warszawa" );
        FlightRelation f30 = new FlightRelation( "Moskwa", "Warszawa" );
        FlightRelation f40 = new FlightRelation("Antananarywa", "Warszawa");

        FlightRelation f5 = new FlightRelation("Berlin", "Londyn");
        FlightRelation f6 = new FlightRelation("Berlin", "Moskwa");
        FlightRelation f7 = new FlightRelation("Berlin", "Madryt");

        FlightRelation f50 = new FlightRelation("Londyn", "Berlin");
        FlightRelation f60 = new FlightRelation("Moskwa", "Berlin");
        FlightRelation f70 = new FlightRelation("Madryt", "Berlin");

       FlightRelation f8 = new FlightRelation("Madryt", "Brasil");
       FlightRelation f80 = new FlightRelation("Brasil", "Madryt");


        flightSet.add(f1);
        flightSet.add(f2);
        flightSet.add(f3);
        flightSet.add(f4);
        flightSet.add(f5);
        flightSet.add(f6);
        flightSet.add(f7);
        flightSet.add(f8);
        flightSet.add(f10);
        flightSet.add(f20);
        flightSet.add(f30);
        flightSet.add(f40);
        flightSet.add(f50);
        flightSet.add(f60);
        flightSet.add(f70);
        flightSet.add(f80);

        FlightBase flightBase = new FlightBase(flightSet);
        return flightBase;
    }
}
