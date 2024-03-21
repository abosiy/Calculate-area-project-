package com.bosiy;

public class Rectangle extends Shape {

    private final double sideA;
    private final double sideB;

    public Rectangle(double sideA, double sideB){
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public String area() {
        return ("Rectangle area: " + (sideA * sideB));
    }
}
