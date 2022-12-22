package com.Mirea4;

public class AtelierTest {
    public static void main(String[] args) {
        Clothes[] ar = new Clothes[4];
        ar[0] = new TShirt(EuroSize.S,15,"blue");
        ar[1] = new Pants(EuroSize.XS, 35.4,"black");
        ar[2] = new Skirt(EuroSize.L,31,"white");
        ar[3] = new Tie(EuroSize.XXS,100,"black");
        Atelier.dressWomen(ar);
        Atelier.dressMan(ar);
    }
}
