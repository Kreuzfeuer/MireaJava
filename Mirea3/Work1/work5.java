package com.Mirea3.Work1;

import java.util.Random;
import java.util.Scanner;

public class work5 {
    public static void main(String[] args) {
        var in = new Scanner(System.in);
        int n;
        do {
            System.out.println("Enter a value of n");
            n = in.nextInt();
        }while(n < 0);
        int[] ar = new int[n];
        fillAr(ar,n);
        print(ar);
        print(fillEvenAr(ar));
    }
    static void print(int[] ar){
        for (int i = 0; i < ar.length; i++) {
            System.out.printf("%d ", ar[i]);
        }
        System.out.println();
    }

    static void fillAr(int[] ar, int n){
        var rand = new Random();
        for (int i = 0; i < ar.length; i++) {
            ar[i] = rand.nextInt(n+1);
        }
    }

    static int[] fillEvenAr(int[] ar){
        int counter = 0;
        for (int i = 0; i <ar.length ; i++) {
            if (ar[i]%2 == 0 && ar[i] != 0)
                counter++;
        }
        if (counter == 0)
            return null;
        int[] newAr = new int[counter];
        int arCounter = 0;
        for (int i = 0; i <ar.length ; i++) {
            if (ar[i]%2 == 0 && ar[i] != 0) {
                newAr[arCounter] = ar[i];
                arCounter++;
            }
        }

        return newAr;
    }
}
