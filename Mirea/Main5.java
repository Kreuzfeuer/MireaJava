package com.Mirea;

public class Main5 {
    public static void main(String[] args){
        for (var element:args) {
            if (element.equals("-a"))
                System.out.println("Shutdown");
            System.out.println(element);
        }
    }
}
