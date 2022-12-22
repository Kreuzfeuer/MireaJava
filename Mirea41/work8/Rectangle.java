package com.Mirea41.work8;

public class Rectangle extends Shape{
    private double width;
    private double length;

    public Rectangle() {
    }

    public Rectangle(String color, boolean field, double width, double length) {
        super(color, field);
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    @Override
    public double getArea() {
        return width*length;
    }

    @Override
    public double getPerimetr() {
        return width * 2 + length * 2;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", length=" + length +
                ", color='" + color + '\'' +
                ", field=" + field +
                '}';
    }
}
