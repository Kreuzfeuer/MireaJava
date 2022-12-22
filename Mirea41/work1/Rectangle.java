package com.Mirea41.work1;

public class Rectangle extends Shape {
    private double a;
    private double b;

    public Rectangle(String name, double a, double b) {
        super(name);
        this.a = a;
        this.b = b;
    }

    @Override
    public String getType() {
        return super.getType();
    }

    @Override
    public double getArea() {
        return a*b;
    }

    @Override
    public double getPerimetr() {
        return a*2 + b*2;
    }
}
