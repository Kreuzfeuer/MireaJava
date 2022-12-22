package com.Mirea41.work8;

public abstract class Shape {
    protected String color;
    protected boolean field;

    public Shape() {}

    public Shape(String color, boolean field) {
        this.color = color;
        this.field = field;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isField() {
        return field;
    }

    public void setField(boolean field) {
        this.field = field;
    }

    public abstract double getArea();

    public abstract double getPerimetr();

    @Override
    public String toString() {
        return "Shape{" +
                "color='" + color + '\'' +
                ", field=" + field +
                '}';
    }
}
