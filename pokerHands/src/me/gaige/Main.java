package me.gaige;

import java.util.Scanner;

public class Main {

    public static final Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        boolean run = true;

        // Receive Input

        do {
            String hands = getValidatedInput();

            // Parse input into two separate Player objects
            PlayerInput inputPlayers = new PlayerInput();
            inputPlayers.getPlayers(hands);

            Player winner = PickWinner.pickWinner(inputPlayers.getPlayerOne(), inputPlayers.getPlayerTwo());

            //Checking for tie
            if(winner != null) {
                printWinner(winner);
            } else {
                System.out.println("Tie.");
            }

            System.out.println("Would you like to play again(y/n)? ");
            String choice = input.nextLine();

            if(!choice.equalsIgnoreCase("y")) {
                run = false;
            }

        } while(run);

    }

    public static void printWinner(Player winner) {
        String notFace = winner.checkHand().getHighCard();
        String faceCard;

        //Converting back to face cards for readability
        switch (notFace) {
            case "11":
                faceCard =  "Jack";
                break;
            case "12":
                faceCard = "Queen";
                break;
            case "13":
                faceCard = "King";
                break;
            case "14":
                faceCard = "Ace";
                break;
            default:
                faceCard = notFace;
                break;

        }
        System.out.println(winner.getId() + " wins. - with " + winner.checkHand().getName() + ": " + faceCard + " high");

    }

    public static String getValidatedInput() {
        //Should always receive 12 args
        boolean correctNumArgs = true;
        String hands;

        do {
            System.out.print("Please input a poker hand for player one and a poker hand for player two(EX 'Gaige: 10D 3H 4H KD 6C Gavin: 7H 9D JC AS 3S') \n>>>>>>>> ");
            hands = input.nextLine();
            String[] parsedHands = hands.split(" ");
            if(parsedHands.length != 12 ) {
                correctNumArgs = false;
                System.out.println("Please follow directions!\n");
            } else {
                correctNumArgs = true;
            }

        } while(!correctNumArgs);

        return hands.toUpperCase();

    }

}
