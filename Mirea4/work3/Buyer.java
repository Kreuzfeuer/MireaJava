package com.Mirea4.work3;

import java.util.ArrayList;

public class Buyer {
    private String login;
    private String password;
    private ArrayList<Product> cart = new ArrayList<>();
    public Buyer(String login, String password) {
        this.login = login;
        this.password = password;
    }
    public void addToCart(Product product){
        cart.add(product);
    }
    public void buyCart(){
        int sum = 0;
        for (var e: cart) {
            sum+= e.getPrice();
        }
        System.out.println("Cost " + sum +". Purchase completed!");
    }
}
