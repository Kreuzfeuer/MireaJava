package com.Mirea2.Work2;

import java.util.ArrayList;
import java.util.Scanner;

public class HowMany {
    public static void main(String[] args) {
        var in = new Scanner(System.in);
        ArrayList<String> strings = new ArrayList<>();
        while (in.hasNext()){
            strings.add(in.next());
        }
        System.out.println(strings);
        System.out.println("Number of words - " + strings.size());
    }
}
