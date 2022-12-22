package com.Mirea4;

public class Tie extends Clothes implements MenClothing{
    public Tie(EuroSize sizeOf, double price, String color){
        super(sizeOf, price,color);
    }
    @Override
    public void dressMan() {
        System.out.println("Dress man - " + this.getClass() + " " + this);
    }



}
