package me.gaige;

import java.util.ArrayList;
import java.util.Arrays;

public class PlayerInput {
    private Player playerOne;
    private Player playerTwo;

    public PlayerInput() {
        this.playerOne = new Player();
        this.playerTwo = new Player();
    }

    public Player getPlayerOne() {
        return playerOne;
    }

    public Player getPlayerTwo() {
        return playerTwo;
    }

    /**
     * Parses the users input string
     * @param info Takes string containing players and hands from user
     * @author Gaige Wycuff
     */
    public void getPlayers(String info) {

        // Parse string into ArrayList
        ArrayList<String> parseInfo = new ArrayList<>(Arrays.asList(info.split(" ")));
        ArrayList<Card> handOne = new ArrayList<>();
        ArrayList<Card> handTwo = new ArrayList<>();

        // Format the name elements
        parseInfo.set(0, parseInfo.get(0).replace(":", ""));
        parseInfo.set(6, parseInfo.get(6).replace(":", ""));

        // Prepare the hand lists
        for(int i = 1; i < 6; i++) {
            handOne.add(new Card(parseInfo.get(i)));
        }
        for(int i = 7; i < 12; i++) {
            handTwo.add(new Card(parseInfo.get(i)));
        }


        //Properly create the players
        playerOne.setId(parseInfo.get(0));
        playerTwo.setId(parseInfo.get(6));

        playerOne.setHand(handOne);
        playerTwo.setHand(handTwo);

        playerOne.sortHand();
        playerTwo.sortHand();

    }
}
