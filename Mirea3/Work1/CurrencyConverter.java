package com.Mirea3.Work1;

public class CurrencyConverter {
    public static final double USD = 61.9;
    public static final double EUR = 62.8;
    public static double toUSD(double rubles){
        return  rubles/USD;
    }

    public static double toEUR(double rubles){
        return  rubles/EUR;
    }

    public static double fromUSD(double usd){
        return  usd * USD;
    }

    public static double fromEUR(double eur){
        return  eur * EUR;
    }
}
