package com.Mirea41.work9;

public class Chair extends Furniture{
    private int legs;

    public Chair(String color, double price, int legs) {
        super(color, price);
        this.legs = legs;
    }

    public int getLegs() {
        return legs;
    }

    @Override
    public String toString() {
        return "Chair{" +
                "legs=" + legs +'\'' +
                ", color='" + this.getColor() + '\'' +
                ", price=" + this.getColor() +
                '}';
    }
}
