package com.Mirea3.Work1;

import java.util.Scanner;

public class Market {
    private int numberOfObjects = 100;
    public static final double priceUsd = 10;
    public static final double priceEur = 9;
    public static final double priceRubles = 600;

    public Market(){};

    public void buyObject(){
        var in = new Scanner(System.in);
        boolean exit = false;
        do {
            System.out.println("Choose currency - 1 - in usd, 2 - in eur, 3 - in rubles ");
            switch (in.nextInt()){
                case 1:
                    System.out.println("Price - " + priceUsd);
                    System.out.println("Purchase completed!");
                    exit = true;
                    break;

                case 2:
                    System.out.println("Price - " + priceEur);
                    System.out.println("Purchase completed!");
                    exit = true;
                    break;

                case 3:
                    System.out.println("Price - " + priceRubles);
                    System.out.println("Purchase completed!");
                    exit = true;
                    break;

                default:
                    System.out.println("Read carefully! ");

            }
        }while(!exit);
    }
}
