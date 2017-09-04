package com.kodilla.good.patterns.challenges.orderservice;

public class RentalDto {

    String user;
    boolean orderDone;

    public RentalDto(String user, boolean orderDone) {
        this.user = user;
        this.orderDone = orderDone;
    }
}
