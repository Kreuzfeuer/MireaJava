package com.Mirea4;

public abstract class Clothes {
    protected EuroSize sizeOf;
    protected double price;
    protected String color;

    public Clothes(EuroSize sizeOf, double price, String color) {
        this.sizeOf = sizeOf;
        this.price = price;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Clothes{" +
                "sizeOf=" + sizeOf +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}
