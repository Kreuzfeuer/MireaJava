package com.Mirea41.work1;

public class Circle extends Shape {
    private double r;
    private double x;

    public Circle(String name, double r, double x) {
        super(name);
        this.r = r;
        this.x = x;
    }

    @Override
    public double getArea() {
        return Math.PI * r * r;
    }

    @Override
    public double getPerimetr() {
        return r*2*Math.PI;
    }

    @Override
    public String getType() {
        return super.getType();
    }
}
