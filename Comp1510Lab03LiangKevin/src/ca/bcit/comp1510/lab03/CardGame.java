package ca.bcit.comp1510.lab03;

import java.util.Random;

/**
 * Prints a random card.
 *
 * @author Kevin Liang
 * @version 2023
 */

public class CardGame {

    /**
     * Enumerated type representing the ranks of standard playing cards.
     */
    public enum Rank {
        ACE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK,
        QUEEN, KING
    }

    /**
     * Enumerated type representing the suits of standard playing cards.
     */
    public enum Suit {
        HEARTS, DIAMONDS, CLUBS, SPADES
    }

    /**
     * Generates a random card.
     *
     * @param args unused
     */
    public static void main(String[] args) {

        Random random = new Random();
        int randomRankChoice = random.nextInt(Rank.values().length);

        Rank randomRank = Rank.values()[randomRankChoice];

        int randomSuitChoice = random.nextInt(Suit.values().length);

        Suit randomSuit = Suit.values()[randomSuitChoice];

        System.out.println("Random Rank: " + randomRank);
        System.out.println("Random Suit: " + randomSuit);

        System.out.println("Your random card: " + randomRank + " of "
                + randomSuit);

    }
}
