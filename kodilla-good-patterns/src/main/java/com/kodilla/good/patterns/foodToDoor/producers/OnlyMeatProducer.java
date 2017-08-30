package com.kodilla.good.patterns.foodToDoor.producers;

import com.kodilla.good.patterns.foodToDoor.FoodProducer;
import com.kodilla.good.patterns.foodToDoor.FoodType;

import java.util.List;

public class OnlyMeatProducer extends FoodProducer {

    public OnlyMeatProducer(String nameOfProducer, int nip, List<FoodType> listOfProvidedFoodType) {
        super(nameOfProducer, nip, listOfProvidedFoodType);
    }

    public void process() {
        System.out.println("Mięso wysyłamy zawsze i wszędzie");
    }


}
