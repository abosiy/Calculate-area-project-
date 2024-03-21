package com.bosiy;

public class Circle extends Shape {
    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

   @Override
    public String area() {
        return "Circle area: " + Math.PI * (this.radius * this.radius);
    }
}
