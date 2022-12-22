package com.Mirea41.work9;

import java.util.Scanner;

public class TestChopf {
    public static void main(String[] args) {
        var shop = new FurnitureShop();
        shop.showProducts();
        System.out.println("Enter the serial number of chair :");
        var in = new Scanner(System.in);
        in.next();
        System.out.println("Purchase completed!");
    }
}
