package com.kodilla.good.patterns.foodToDoor.producers;

import com.kodilla.good.patterns.foodToDoor.FoodProducer;
import com.kodilla.good.patterns.foodToDoor.FoodType;

import java.util.List;

public class FatFoodForFatFemaleShop extends FoodProducer {

    public FatFoodForFatFemaleShop(String nameOfProducer, int nip, List<FoodType> listOfProvidedFoodType) {
        super(nameOfProducer, nip, listOfProvidedFoodType);
    }

    public void process(){
        System.out.println("Do zamówienia zostanie doliczony koszt przesyłki w wysokości 50 zł");
    }
}
