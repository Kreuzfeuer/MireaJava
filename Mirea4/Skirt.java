package com.Mirea4;

public class Skirt extends Clothes implements WomenClothing{
    public Skirt(EuroSize sizeOf, double price, String color){
        super(sizeOf, price,color);
    }

    @Override
    public void dressWomen() {
        System.out.println("Dress Women - " + this.getClass() + " " + this);
    }

}
