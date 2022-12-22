package com.Mirea3.Work1;

import java.util.Random;
//3
public class Work4 {
    public static void main(String[] args) {
        int[] ar = new int[4];
        var rand = new Random();
        for (int i = 0; i < 4; i++) {
            ar[i] = rand.nextInt(90) + 10;
        }
        print(ar);
        if (isIncrease(ar))
            System.out.println("The array is a strictly increasing sequence.");
        else
            System.out.println("The array is not a strictly increasing sequence");
    }
    static boolean isIncrease(int[] ar){
        if(ar[0] < ar[1] && ar[1] < ar[2] && ar[2] < ar[3])
            return true;
        return false;
    }
    static void print(int[] ar){
        for (int i = 0; i < ar.length; i++) {
            System.out.printf("%d ", ar[i]);
        }
        System.out.println();
    }
}
