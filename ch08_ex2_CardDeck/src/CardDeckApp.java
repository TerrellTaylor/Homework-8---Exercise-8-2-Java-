import java.util.Arrays;

import com.sun.tools.javac.Main;

public class CardDeckApp {

    public static void main(String[] args) {
        System.out.println("DECK");
        String[] deck = getDeck();
        displayCards(deck);

        System.out.println("SHUFFLED DECK");
        shuffleDeck(deck);
        displayCards(deck);

        int count = 2;
        System.out.println("HAND OF " + count + " CARDS");
        String[] hand = dealCards(deck, count);
        displayCards(hand);
    }

    private static String[] getDeck() {
        String[] deck = new String[52];
        // add code that creates deck here
        String[] suites = new String[4];
        suites[0] = "Spades";
        suites[1] = "Hearts";
        suites[2] = "Clubs";
        suites[3] = "Diamonds";
        String[] ranks = new String[13];
        ranks[0] = "Ace";
        ranks[1] = "2";
        ranks[2] = "3";
        ranks[3] = "4";
        ranks[4] = "5";
        ranks[5] = "6";
        ranks[6] = "7";
        ranks[7] = "8";
        ranks[8] = "9";
        ranks[9] = "10";
        ranks[10] = "Jack";
        ranks[11] = "Queen";
        ranks[12] = "King";

        int k = 0;
        for (int i = 0; i < suites.length; i++) {
            for (int j = 0; j < ranks.length; j++) {
                deck[k] = (ranks[j] + " of " + suites[i]);
                k++;
            }
        }

        return deck;
    }

    private static void displayCards(String[] cards) {
        // add code that displays cards here
        for (String card : cards) {
            System.out.print("|" + card);
        }
        System.out.println();
    }

    private static void shuffleDeck(String[] deck) {
        int randomIndex = (int) (Math.random() * deck.length-1);
        String temp = "";

        // add code that shuffles the deck here
        for (int i = 0; i < deck.length; i++) {
            if (temp != deck[randomIndex]) {
                temp = deck[i];
                deck[i] = deck[randomIndex];
                deck[randomIndex] = temp;
                randomIndex = (int) (Math.random() * deck.length-1);
            }
        }
    }

    private static String[] dealCards(String[] deck, int count) {
        String[] hand = new String[count];
        for (int i = 0; i < count; i++) {
            hand[i] = deck[i];
        }
        return hand;
    }
}