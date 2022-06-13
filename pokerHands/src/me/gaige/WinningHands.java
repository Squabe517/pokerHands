package me.gaige;

/**
 * Different winning hands of poker, nested classes for readability
 * Each hand has a name rank and high card
 * @author Gaige Wycuff
 */
public abstract class WinningHands {

    public abstract int getRank();
    public abstract String getName();
    public abstract String getHighCard();

    public static class StraightFlush extends WinningHands {
        private final String name = "Straight Flush";
        private final int rank = 1;
        private String highCard;

        public StraightFlush(String highCard) {
            this.highCard = highCard;
        }

        public String getHighCard() {
            return highCard;
        }

        public void setHighCard(String highCard) {
            this.highCard = highCard;
        }

        @Override
        public String getName() {
            return name;
        }

        @Override
        public int getRank() {
            return rank;
        }
    }

    public static class FourOfAKind extends WinningHands {
        private final String name = "Four of a kind";
        private final int rank = 2;
        private String highCard;

        public FourOfAKind(String highCard) {
            this.highCard = highCard;
        }

        public String getHighCard() {
            return highCard;
        }

        public void setHighCard(String highCard) {
            this.highCard = highCard;
        }

        @Override
        public String getName() {
            return name;
        }

        @Override
        public int getRank() {
            return rank;
        }
    }

    public static class FullHouse extends WinningHands {
        private final String name = "Full House";
        private final int rank = 3;
        private String highCard;

        public FullHouse(String highCard) {
            this.highCard = highCard;
        }

        public String getHighCard() {
            return highCard;
        }

        public void setHighCard(String highCard) {
            this.highCard = highCard;
        }

        @Override
        public String getName() {
            return name;
        }

        @Override
        public int getRank() {
            return rank;
        }
    }

    public static class Flush extends WinningHands {
        private final String name = "Flush";
        private final int rank = 4;
        private String highCard;

        public Flush(String highCard) {
            this.highCard = highCard;
        }

        public String getHighCard() {
            return highCard;
        }

        public void setHighCard(String highCard) {
            this.highCard = highCard;
        }

        @Override
        public String getName() {
            return name;
        }

        @Override
        public int getRank() {
            return rank;
        }
    }

    public static class Straight extends WinningHands {
        private final String name = "Straight";
        private final int rank = 5;
        private String highCard;

        public Straight(String highCard) {
            this.highCard = highCard;
        }

        public String getHighCard() {
            return highCard;
        }

        public void setHighCard(String highCard) {
            this.highCard = highCard;
        }

        @Override
        public String getName() {
            return name;
        }

        @Override
        public int getRank() {
            return rank;
        }
    }

    public static class ThreeOfAKind extends WinningHands {
        private final String name = "Three of a Kind";
        private final int rank = 6;
        private String highCard;

        public ThreeOfAKind(String highCard) {
            this.highCard = highCard;
        }

        public String getHighCard() {
            return highCard;
        }

        public void setHighCard(String highCard) {
            this.highCard = highCard;
        }

        @Override
        public String getName() {
            return name;
        }

        @Override
        public int getRank() {
            return rank;
        }
    }

    public static class TwoPairs extends WinningHands {
        private final String name = "Two Pair";
        private final int rank = 7;
        private String highCard;

        public TwoPairs(String highCard) {
            this.highCard = highCard;
        }

        public String getHighCard() {
            return highCard;
        }

        public void setHighCard(String highCard) {
            this.highCard = highCard;
        }

        @Override
        public String getName() {
            return name;
        }

        @Override
        public int getRank() {
            return rank;
        }
    }

    public static class Pair extends WinningHands {
        private final String name = "Pair";
        private final int rank = 8;
        private String highCard;

        public Pair(String highCard) {
            this.highCard = highCard;
        }

        public String getHighCard() {
            return highCard;
        }

        public void setHighCard(String highCard) {
            this.highCard = highCard;
        }

        @Override
        public String getName() {
            return name;
        }

        @Override
        public int getRank() {
            return rank;
        }
    }

    public static class HighCard extends WinningHands {
        private final String name = "High Card";
        private final int rank = 9;
        private String highCard;

        public HighCard(String highCard) {
            this.highCard = highCard;
        }

        public String getHighCard() {
            return highCard;
        }

        public void setHighCard(String highCard) {
            this.highCard = highCard;
        }

        @Override
        public String getName() {
            return name;
        }

        @Override
        public int getRank() {
            return rank;
        }
    }


}
