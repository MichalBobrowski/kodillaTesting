package com.kodilla.good.patterns.foodToDoor;

import com.kodilla.good.patterns.foodToDoor.producers.OnlyMeatProducer;

public class OrderMaker {

    public static void makeOrder(FoodProducer foodProducer, FoodType foodType, int quantity  ) {

        if( correctionOrderChecker(foodProducer, foodType, quantity)){
                foodProducer.process();
                System.out.println("Zamówienie od producenta: " + foodProducer.getNameOfProducer()
                        + "\n na jedzenie typu: " + foodType.getFoodName() + "\n opiewające na kwotę: " +
                        foodType.getAveragePrice() * quantity + " zostało złożne");

        }
    }

    public static boolean correctionOrderChecker(FoodProducer foodProducer, FoodType foodType, int quantity){
        if(quantity <= 0){
            System.out.println("Błąd składania zamówienia: Ujemna ilość towaru");
            return false;
        }
        if(!foodProducer.getListOfProvidedFoodType().contains(foodType)){
            System.out.println("Błąd składania zamówienia: producent nie dysponuje danym rodzajem towaru");
            return false;
        }
        if(foodType.getAveragePrice() * quantity < 200){
            System.out.println("Nie można złożyć zamówienia. Za mała kwota");
            return false;
        }

        return true;
    }

}
