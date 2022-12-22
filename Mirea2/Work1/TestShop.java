package com.Mirea2.Work1;

import java.util.Scanner;

public class TestShop {
    public static void main(String[] args) {
        var shop = new Shop();
        shopFilling(shop);
        System.out.println("Введите имя пользователя, чей компьютер нужно удалить: ");
        Scanner in = new Scanner(System.in);
        shop.delComputers(in.next());
    }
    static void shopFilling(Shop shop){
        System.out.println("Введите количество компьютеров: ");
        var in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 0; i < n ; i++) {
            System.out.println("Введите имя пользователя - " );
            shop.addComputers(in.next());
        }
    }
}
