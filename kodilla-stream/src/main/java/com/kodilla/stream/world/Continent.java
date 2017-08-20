package com.kodilla.stream.world;

import java.util.List;


public class Continent {

    private List<Country> countriesCollection;

    public Continent(List<Country> countriesCollection) {
        this.countriesCollection = countriesCollection;
    }

    public List<Country> getCountriesCollection() {
        return countriesCollection;
    }

    public void addCountry(Country country) {
        List<Country> countriesCollection2 = countriesCollection;
        countriesCollection2.add(country);
        this.countriesCollection = countriesCollection2;
    }
}
