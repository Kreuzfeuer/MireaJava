package com.Mirea2.Work2;

public class StringReverse {
    public static String reverseStr(String str){
        char[] ar = str.toCharArray();
        String result = "";
        for (int i = ar.length - 1; i >= 0 ; i--) {
            result += ar[i];
        }
        return result;
    }
    public static String revStr(String str){
        return new StringBuilder(str).reverse().toString();
    }

    public static void main(String[] args) {
        String str = "Andrey";
        System.out.println(reverseStr(str));
        System.out.println(revStr(str));
    }
}
