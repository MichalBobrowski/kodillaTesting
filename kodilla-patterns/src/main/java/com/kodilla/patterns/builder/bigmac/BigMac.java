package com.kodilla.patterns.builder.bigmac;

import java.util.ArrayList;
import java.util.List;

public class BigMac {
    private Roll roll;
    private int burgers;
    private Sauce sauce;
    private List<String> ingredients;

    private BigMac(Roll roll, int burgers, Sauce sauce, List<String> ingredients) {
        this.roll = roll;
        this.burgers = burgers;
        this.sauce = sauce;
        this.ingredients = ingredients;
    }

    public Roll getRoll() {
        return roll;
    }

    public int getBurgers() {
        return burgers;
    }

    public Sauce getSauce() {
        return sauce;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    public static class BigMacBuilder{
        private Roll roll;
        private int burgers;
        private Sauce sauce;
        private List<String> ingredients = new ArrayList<>();

        public BigMacBuilder roll(Roll roll) {
            this.roll = roll;
            return this;
        }

        public BigMacBuilder burgers(int burgers) {
            this.burgers = burgers;
            return this;
        }

        public BigMacBuilder sauce(Sauce sauce) {
            this.sauce = sauce;
            return this;
        }

        public BigMacBuilder ingredients(String ingredient) {
            this.ingredients.add(ingredient);
            return this;
        }

        public BigMac build(){
            if(burgers < 0 || burgers > 10 )
                throw new IllegalStateException("Ujemna lub zbyt wielka ilość kotletów");

            List<String> allowedIngredients = BigMacBuilder.lisOfIngredients();
            for (String ingredient : ingredients ){
                if(! allowedIngredients.contains(ingredient))
                    throw new IllegalStateException("Niedozwolony składnik");
            }

            return new BigMac(roll, burgers, sauce, ingredients );
        };

        public static List<String> lisOfIngredients(){
            List<String> ingredients = new ArrayList<>();
            ingredients.add("sałata");
            ingredients.add("bekon");
            ingredients.add("cebula");
            ingredients.add("ogórek");
            ingredients.add("papryczki");
            ingredients.add("pieczarki");
            ingredients.add("krewetki");
            ingredients.add("ser");
            return ingredients;
        }

    }
}
