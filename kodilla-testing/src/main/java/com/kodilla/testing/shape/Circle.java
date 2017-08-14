package com.kodilla.testing.shape;

public class Circle implements Shape {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public String getShapeName() {
        return "circle";
    }

    @Override
    public double getField() {
        return radius*radius*3.14;
    }
}
