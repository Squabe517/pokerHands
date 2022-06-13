package me.gaige;

import java.util.ArrayList;

/**
 * Used to represent player with name and hand
 * @author Gaige Wycuff
 */
public class Player {
    private String id;
    private ArrayList<Card> hand;

    public Player() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ArrayList<Card> getHand() {
        return hand;
    }

    public void setHand(ArrayList<Card> hand) {
        this.hand = hand;
    }


    /**
     * Sorts hand and converts face cards to integers
     */
    public void sortHand() {
        //Sorts hand to make checking cards easier

        //Handle Non-int card values
        for(int i = 0; i < 5; i++) {
            if(hand.get(i).getValue().equals("J")) {
                hand.get(i).setValue("11");
            } else if(hand.get(i).getValue().equals("Q")) {
                hand.get(i).setValue("12");
            } else if(hand.get(i).getValue().equals("K")) {
                hand.get(i).setValue("13");
            } else if(hand.get(i).getValue().equals("A")) {
                hand.get(i).setValue("14");
            }
        }

        //Bubble sort
        for(int i = 0; i < 5; i++) {
            for(int j = 0; j < 5 - i - 1; j++) {
                if(Integer.parseInt(hand.get(j).getValue()) > Integer.parseInt(hand.get(j + 1).getValue())) {
                    Card temp = hand.get(j);
                    hand.set(j, hand.get(j+1));
                    hand.set(j+1, temp);
                }
            }
        }



    }

    /**
     * Uses logic to determine what hands a user has, prioritized if statements then choose the best one
     * @return The highest value hand player has
     */
    public WinningHands checkHand() {
        int highCard = Integer.parseInt(hand.get(4).getValue());
        boolean flush = true;
        boolean straight = false;
        boolean fourOfAKind = false;
        boolean fullHouse = false;
        boolean threeOfaKind = false;
        boolean twoPair = false;
        boolean pair = false;


        // Check Flush
        for(Card card : hand) {
            if(!card.getSuit().equals(hand.get(0).getSuit())) {
                flush = false;
            }
        }
        // Check Straight
        if((Integer.parseInt(hand.get(0).getValue())) == (highCard - 4)) {
            if ((Integer.parseInt(hand.get(1).getValue())) == (highCard - 3)) {
                if ((Integer.parseInt(hand.get(2).getValue())) == (highCard - 2)) {
                    if ((Integer.parseInt(hand.get(3).getValue())) == (highCard - 1)) {
                        straight = true;
                    }
                }
            }
        }
        // Check Pairs
        ArrayList<Card> pairs = new ArrayList<>();
        for(int i = 0; i < hand.size(); i++) {
            for(int j = i+1; j < hand.size(); j++) {
                if(hand.get(i).getValue().equals(hand.get(j).getValue())) {
                    pairs.add(hand.get(i));

                }
            }
        }

        // The size of the pairs array can be used to determine the following hands
        if(pairs.size() == 1) {
            pair = true;
        }
        if(pairs.size() == 2) {
            twoPair = true;
        }
        if(pairs.size() == 3) {
            threeOfaKind = true;
        }
        if(pairs.size() == 4) {
            fullHouse = true;
        }
        if(pairs.size() == 6) {
            fourOfAKind = true;
        }



        //Check wins
        if(flush && straight) {
            return new WinningHands.StraightFlush(hand.get(4).getValue());
        } else if(fourOfAKind) {
            return new WinningHands.FourOfAKind(hand.get(2).getValue());
        } else if(fullHouse) {
            return new WinningHands.FullHouse(hand.get(2).getValue());
        } else if(flush) {
            return new WinningHands.Flush(hand.get(4).getValue());
        } else if(straight) {
            return new WinningHands.Straight(hand.get(4).getValue());
        } else if(threeOfaKind) {
            return new WinningHands.ThreeOfAKind(pairs.get(1).getValue());
        } else if(twoPair) {
            return new WinningHands.TwoPairs(pairs.get(1).getValue());
        } else if(pair) {
            return new WinningHands.Pair(pairs.get(0).getValue());
        } else {
            return new WinningHands.HighCard(hand.get(4).getValue());
        }
    }
}
