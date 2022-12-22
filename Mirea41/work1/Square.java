package com.Mirea41.work1;

public class Square extends Shape{
    private double a;

    public Square(String name, double a) {
        super(name);
        this.a = a;
    }

    @Override
    public double getArea() {
        return a*a;
    }

    @Override
    public double getPerimetr() {
        return a + a;
    }

    @Override
    public String getType() {
        return super.getType();
    }
}
