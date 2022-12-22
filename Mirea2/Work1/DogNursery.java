package com.Mirea2.Work1;

import java.util.Scanner;

public class DogNursery {
    public static void main(String[] args) {
        int n = 3;
        Dog[] dogs = new Dog[n];
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            dogs[i] = new Dog(in.next(),in.nextInt());
        }
    }
    public static Dog[] addDog(Dog[] dogs,int value) {
        Dog[] newDogs = new Dog[dogs.length + value];
        for (int i = 0; i < dogs.length; i++) {
            newDogs[i] = dogs[i];
        }
        Scanner in = new Scanner(System.in);
        for (int i = dogs.length; i < dogs.length + value; i++) {
            newDogs[i] = new Dog(in.next(),in.nextInt());
        }
        return newDogs;
    }
}
