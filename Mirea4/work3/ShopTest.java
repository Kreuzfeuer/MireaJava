package com.Mirea4.work3;

import java.util.Scanner;

public class ShopTest {
    public static void main(String[] args) {
        System.out.println("Enter the login and password: ");
        var in = new Scanner(System.in);
        var bueyr = new Buyer(in.next(), in.next());
        System.out.println("Select the catalog you want to view");
        System.out.println("Enter the number 1 - for waters, 2 - for foods");
        switch (in.nextInt())
        {
            case 1:
                Shop.getWaters();
                System.out.println("Select the product: Baikal, Water ");
                var prod = Shop.getProduct(in.next());
                bueyr.addToCart(prod);
                System.out.println("Adding to cart successfully!");
                break;
            case 2:
                Shop.getFood();
                System.out.println("Select the product: Butter, Bread, Cheese ");
                var prod1 = Shop.getProduct(in.next());
                bueyr.addToCart(prod1);
                System.out.println("Adding to cart successfully!");
                break;
        }
        bueyr.buyCart();
    }
}
