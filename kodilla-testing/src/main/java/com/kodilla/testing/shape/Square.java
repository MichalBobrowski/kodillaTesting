package com.kodilla.testing.shape;

public class Square implements Shape {

    private double sideLength;

    public Square(double sideLength) {
        this.sideLength = sideLength;
    }

    public double getSideLength() {
        return sideLength;
    }

    @Override
    public String getShapeName() {
        return "square";
    }

    @Override
    public double getField() {
        return sideLength*sideLength;
    }
}
