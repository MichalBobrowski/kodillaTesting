package com.kodilla.good.patterns.foodToDoor;

import java.util.List;

public class FoodProducer {

    private String nameOfProducer;
    private int nip;
    private List<FoodType> listOfProvidedFoodType;

    public FoodProducer(String nameOfProducer, int nip, List<FoodType> listOfProvidedFoodType) {
        this.nameOfProducer = nameOfProducer;
        this.nip = nip;
        this.listOfProvidedFoodType = listOfProvidedFoodType;
    }


    public void process() {

    }

    public String getNameOfProducer() {
        return nameOfProducer;
    }

    public int getNip() {
        return nip;
    }

    public List<FoodType> getListOfProvidedFoodType() {
        return listOfProvidedFoodType;
    }
}
