package me.gaige;


public class PickWinner {

    /**
     * Picks winner
     * @author Gaige Wycuff
     * @returns Winning player, if tie returns null
     */
    public static Player pickWinner(Player one, Player two) {
        WinningHands playerOne = one.checkHand();
        WinningHands playerTwo = two.checkHand();

        if(playerOne.getRank() == playerTwo.getRank()) {

            if()

            if(Integer.parseInt(playerOne.getHighCard()) > Integer.parseInt(playerTwo.getHighCard())) {
                return one;
            } else if(Integer.parseInt(playerOne.getHighCard()) < Integer.parseInt(playerTwo.getHighCard())) {
                return two;
            } else {
                return null;
            }
        } else if(playerOne.getRank() < playerTwo.getRank()) {
            return one;
        } else {
            return two;
        }
    }

}
