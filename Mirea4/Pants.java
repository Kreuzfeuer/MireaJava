package com.Mirea4;

public class Pants extends Clothes implements MenClothing, WomenClothing{
    public Pants(EuroSize sizeOf, double price, String color){
        super(sizeOf, price,color);
    }
    @Override
    public void dressMan() {
        System.out.println("Dress man - " + this.getClass() + " " + this);
    }

    @Override
    public void dressWomen() {
        System.out.println("Dress Women - " + this.getClass() + " " + this);
    }

}
