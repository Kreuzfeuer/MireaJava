package com.Mirea2.Work2;

import java.util.Objects;
import java.util.Random;

public class Card {

    private String cardName;

    public Card(){
        this.cardName = this.generateRandomCard();
    }

    public String getCardName() {
        return cardName;
    }

    private String generateRandomCard(){
        String value;
        var random = new Random();
        int rand = (random.nextInt(4));

        if (rand == 0) value = "suit of hearts ";
        else if (rand == 1) value = "baptism suit ";
        else if (rand == 2) value = "suit of spades ";
        else value = "suit of diamonds ";

        rand = random.nextInt(13);
        if(rand == 0){
            value += "ace";
        }
        else if (rand == 1) {
            value += "jack";
        }
        else if(rand == 11) {
            value += "queen";
        }
        else if(rand == 12) {
            value += "king";
        }
        else  value+= Integer.toString(rand);
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Card card = (Card) o;
        return Objects.equals(cardName, card.cardName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cardName);
    }

    @Override
    public String toString() {
        return "Card{" +
                "cardName='" + cardName + '\'' +
                '}';
    }

}
