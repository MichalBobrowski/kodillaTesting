package com.kodilla.stream.world;

import java.math.BigDecimal;

public class Country {
    private BigDecimal poepleQuantity;

    public Country(BigDecimal poepleQuantity) {
        this.poepleQuantity = poepleQuantity;
    }

    public BigDecimal getPoepleQuantity() {
        return poepleQuantity;
    }
}
