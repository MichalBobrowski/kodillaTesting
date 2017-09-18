package com.kodilla.patterns.builder.bigmac;

public class Sauce {
    private String sauceType;

    public final static String DEFAULT = "Default";
    public final static String THOUSANDISLAND = "ThousandIsland";
    public final static String BBQ = "BBQ";

    public Sauce(String sauceType) {
        if (sauceType == DEFAULT || sauceType == THOUSANDISLAND || sauceType == BBQ)
            this.sauceType = sauceType;
        else throw new IllegalStateException("Sauce type shuold be Default, ThousandIsland or BBQ ");
    }

    public String getSauceType() {
        return sauceType;
    }
}
