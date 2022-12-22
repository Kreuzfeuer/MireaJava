package com.Mirea41.work8;

public class Circle extends Shape {
    private double radius;

    public Circle() {
        super("Black", false);
    }

    public Circle(double radius) {
        super("Black", false);
        this.radius = radius;
    }

    public Circle(String color, boolean field, double radius) {
        super(color, field);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }


    @Override
    public double getPerimetr() {
        return radius*2*Math.PI;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                ", field=" + field +
                '}';
    }
}

