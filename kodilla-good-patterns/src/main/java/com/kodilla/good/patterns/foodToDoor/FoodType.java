package com.kodilla.good.patterns.foodToDoor;

import java.time.LocalDate;

public class FoodType {

    String foodName;
    double averagePrice;
    int averageShelfLife;

    public FoodType(String foodName, double averagePrice, int averageShelfLife) {
        this.foodName = foodName;
        this.averagePrice = averagePrice;
        this.averageShelfLife = averageShelfLife;
    }

    public String getFoodName() {
        return foodName;
    }

    public double getAveragePrice() {
        return averagePrice;
    }

    public int getAverageShelfLife() {
        return averageShelfLife;
    }
}
