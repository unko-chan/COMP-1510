package ca.bcit.comp1510.lab03;

import java.util.Random;

/**
 * Generates a random number between 1 and the number of sides
 * of the die specified.
 * @author Kevin Liang
 * @version 2023
 */
public class Dice {
    /**
     * Constant for a 4-sided die.
     */
    public static final int D4_SIDES = 4;
    /**
     * Constant for a 6-sided die.
     */

    public static final int D6_SIDES = 6;
    /**
     * Constant for an 8-sided die.
     */

    public static final int D8_SIDES = 8;
    /**
     * Constant for a 10-sided die.
     */

    public static final int D10_SIDES = 10;
    /**
     * Constant for a 12-sided die.
     */

    public static final int D12_SIDES = 12;
    /**
     * Constant for a 20-sided die.
     */

    public static final int D20_SIDES = 20;

    /**
     * Generates a random number between 1 and the number of sides of the die
     *
     * @param dieType number of sides of the die
     *
     * @return a random number between 1 and the number of sides of the die
     */
    static int randomNumber(int dieType) {
        Random rand = new Random();
        int min = 1;
        int range = dieType - min + 1;
        return rand.nextInt(range) + min;
    }

    /**
     * Rolls a 4, 6, 8, 10, 12, and a 20-sided die,
     * and prints the result of each roll and the total roll.
     *
     * @param args unused
     *
     */
    public static void main(String[] args) {
        int d4 = randomNumber(D4_SIDES);
        int d6 = randomNumber(D6_SIDES);
        int d8 = randomNumber(D8_SIDES);
        int d10 = randomNumber(D10_SIDES);
        int d12 = randomNumber(D12_SIDES);
        int d20 = randomNumber(D20_SIDES);

        int total = d4 + d6 + d8 + d10 + d12 + d20;

        System.out.println("D4: " + d4);
        System.out.println("D6: " + d6);
        System.out.println("D8: " + d8);
        System.out.println("D10: " + d10);
        System.out.println("D12: " + d12);
        System.out.println("D20: " + d20);
        System.out.println("Total: " + total);
    }
}


