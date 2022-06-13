package me.gaige;

import java.util.ArrayList;
import java.util.Arrays;


/**
 * Card class representing playing cards
 * @author Gaige Wycuff
 */
public class Card {
    private final String card;
    private static final String[] VALUES = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
    private static final String[] SUITS = {"C", "D", "H", "S"};
    private String value;
    private String suit;

    public Card(String card) {

        this.card = card;
        getCardAndSuit();

    }

    public String getCard() {
        return card;
    }

    public String getSuit() {
        return suit;
    }

    public void setSuit(String suit) {
        this.suit = suit;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets card and suit value from given Card string
     * @author Gaige Wycuff
     */
    public void getCardAndSuit() {
        ArrayList<String> parsedCard = new ArrayList<>(Arrays.asList(card.split("")));

        // Determine value of card, if equal to 1 the actual value is 10
        if(parsedCard.get(0).equals("1")) {
            this.value = "10";
            parsedCard.remove(1);
        } else {
            for(String info : VALUES) {
                if(parsedCard.get(0).equals(info)) {
                    this.value = info;
                }
            }
        }

        for(String info : SUITS) {
            if(parsedCard.get(1).equals(info)) {
                this.suit = info;
            }
        }

    }

}
