package com.Mirea2.Work2;


public class CardTest {
    public static void main(String[] args) {
    cardDistribution(5);
    }
    public static void cardDistribution(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 5; j++) {
                var card = new Card();
                System.out.print(card.getCardName() + " | ");
            }
            System.out.println();
        }
    }
}
