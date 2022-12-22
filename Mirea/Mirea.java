package com.Mirea;

import java.util.Scanner;
import java.util.Random;

public class Mirea {
    public static void main(String[] args){
        int n = 5;
        int[] array = new int[n];
        array = FillArray(array);
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
           sum += array[i];
        }
        System.out.println("For: ");
        System.out.println("Sum - " + sum + " Average - " + sum / array.length);
        System.out.println("While / do while: ");
        sum = 0;
        int i = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        while(i < array.length){
            sum+= array[i];
            if (min > array[i])
                min = array[i];
            if (max < array[i])
                max = array[i];
            i++;
        }
        System.out.println("Sum - " + sum + " Min - " + min + " Max - " + max);
    }
    public static int[] FillArray(int[] array){
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            array[i] = in.nextInt();
        }
        return array;
    }
}
