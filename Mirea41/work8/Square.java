package com.Mirea41.work8;

public class Square extends Rectangle{
    private double side;

    public Square() {
    }

    public Square(String color, boolean field, double side) {
        super(color, field, side, side);
        this.side = side;
    }

    public Square(double side) {
        super(side, side);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public void setWidth(double side) {
        super.setWidth(side);
        super.setLength(side);
    }

    @Override
    public void setLength(double side) {
        super.setWidth(side);
        super.setLength(side);
    }

    @Override
    public String toString() {
        return "Square{" +
                "color='" + color + '\'' +
                ", field=" + field +
                ", side=" + side +
                '}';
    }
}
