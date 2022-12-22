package com.Mirea3.Work1;

import java.util.Random;
//1
public class TestRandom {
    final static int n = 10;

    public static void main(String[] args) {
        double[] ar = new double[n];
        fillArR1(ar);
        print(ar);
        sort(ar);
        print(ar);
        fillArR2(ar);
        print(ar);
        sort(ar);
        print(ar);
    }
    public static void fillArR1(double [] ar){
        var random = new Random();
        for (int i = 0; i < n; i++) {
            ar[i] = random.nextDouble(100);
        }
    }

    public static void fillArR2(double [] ar){
        for (int i = 0; i < n; i++) {
            ar[i] = Math.random() * 100;
        }
    }

    public static void sort(double[] arr){
        for(int i = arr.length-1 ; i > 0 ; i--){
            for(int j = 0 ; j < i ; j++){
                 if( arr[j] > arr[j+1] ){
                    double tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
        }
    }
}
    static void print(double[] ar){
        for (int i = 0; i < n; i++) {
            System.out.printf("%.2f | ", ar[i]);
        }
        System.out.println();
    }
}
