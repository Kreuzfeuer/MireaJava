package com.Mirea4.work3;

public class Shop {
    private static Product[] water = {new Product("Baikal", 50), new Product("Water", 35)};
    private static Product[] food = {new Product("Butter",130),new Product("Bread",50),
    new Product("Cheese", 160)};

    public static void getWaters(){
        for (var e: water) {
            System.out.print(e + "/t");
        }
        System.out.println();
    }

    public static void getFood(){
        for (var e: food) {
            System.out.print(e + "\t");
        }
        System.out.println();
    }
    public static Product getProduct(String name){
        for (var e: food) {
            if (name.equals(e.getName()))
                return e;
        }
        for (var e: water) {
            if (name.equals(e.getName()))
                return e;
        }
        return null;
    }

}
