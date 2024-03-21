package com.bosiy;

public class Triangle extends Shape {

    private final double sideA;
    private final double sideH;
    public Triangle(double sideA, double sideH) {
        this.sideA = sideA;
        this.sideH = sideH;
    }
   @Override
    public String area() {
        return("Triangle area: " + (sideA * sideH / 2));
    }
}
