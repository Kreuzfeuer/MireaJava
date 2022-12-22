package com.Mirea4;

public class Atelier {
    public static void  dressWomen(Object[] ar)
    {
        for (var element: ar) {
            if (element instanceof WomenClothing)
                ((WomenClothing) element).dressWomen();
        }
    }
    public static void dressMan(Object[] ar)
    {
        for (var element: ar) {
           if (element instanceof MenClothing)
                ((MenClothing) element).dressMan();
        }
    }
}
