package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class World {
    private List<Continent> continentsCollection;

    public World(List<Continent> continentsCollection) {
        this.continentsCollection = continentsCollection;
    }

    public List<Continent> getContinentsCollection() {
        return continentsCollection;
    }

    public void addContinent (Continent continent){
        List<Continent> resultList = continentsCollection;
        resultList.add(continent);
        this.continentsCollection = resultList;
    }

    public BigDecimal getPeopleQuantity(){
        BigDecimal totalPeople = this.getContinentsCollection().stream()
                .flatMap(continent -> continent.getCountriesCollection().stream())
                .map(country -> country.getPoepleQuantity())
                .reduce(BigDecimal.ZERO, (sum, cureent) -> sum = sum.add(cureent));

        return  totalPeople;
    }
}
