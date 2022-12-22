package com.Mirea;

import java.util.Scanner;

public class Main7 {
    public static void main(String[] args) {
        var in = new Scanner(System.in);
        System.out.println("Enter a number: ");
        System.out.println("Your factorial - " + factorial(in.nextInt()));
    }
    public static int factorial(int n){
        if (n <= 1) return 1;
        return n * factorial(n-1);
    }
}
