package com.kodilla.good.patterns.foodToDoor;

import com.kodilla.good.patterns.foodToDoor.producers.OnlyMeatProducer;

import java.util.ArrayList;
import java.util.List;

public class FoodToDoorMain {

    public static void main(String args[]) {
        FoodType foodType1 = new FoodType("Steak", 22.20, 4);
        FoodType foodType2 = new FoodType("Tomato", 1.00, 2);
        List<FoodType> providedFood = new ArrayList<>();
        providedFood.add(foodType1);
        OnlyMeatProducer onlyMeatProducer = new OnlyMeatProducer("Only Meat Producer", 12345678, providedFood);


        OrderMaker.makeOrder(onlyMeatProducer, foodType1, 40 );
        OrderMaker.makeOrder(onlyMeatProducer, foodType1, 3 );
        OrderMaker.makeOrder(onlyMeatProducer, foodType2, 3 );

    }
}
