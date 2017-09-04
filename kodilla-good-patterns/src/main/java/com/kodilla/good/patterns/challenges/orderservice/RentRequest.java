package com.kodilla.good.patterns.challenges.orderservice;

public class RentRequest {

    private String user;
    private String from;
    private String to;

    public RentRequest(String user, String from, String to) {
        this.user = user;
        this.from = from;
        this.to = to;
    }

    public String getUser() {
        return user;
    }

    public String getFrom() {
        return from;
    }

    public String getTo() {
        return to;
    }
}
