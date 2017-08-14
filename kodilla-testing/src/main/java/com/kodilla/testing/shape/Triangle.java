package com.kodilla.testing.shape;

public class Triangle implements Shape {

    private double base;
    private double heigth;

    public Triangle(double base, double heigth) {
        this.base = base;
        this.heigth = heigth;
    }

    public double getBase() {
        return base;
    }

    public double getHeigth() {
        return heigth;
    }

    @Override
    public String getShapeName() {
        return "triangle";
    }

    @Override
    public double getField() {
        return base*heigth/2;
    }
}
