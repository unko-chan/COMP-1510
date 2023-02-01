package q1;

import java.util.Scanner;

/**
 * Takes an input and calculates change.
 * @author Kevin Liang
 * @version 1.0
 */

public class Change {
    /**
     * Value for ten dollar bills.
     */
    private static final int TEN = 1000;

    /**
     * Value for five dollar bills.
     */
    private static final int FIVE = 500;

    /**
     * Value for toonies.
     */
    private static final int TOONIE = 200;

    /**
     * Value for loonies.
     */
    private static final int LOONIE = 100;

    /**
     * Value for quarters.
     */
    private static final int QUARTER = 25;

    /**
     * Value for dimes.
     */
    private static final int DIME = 10;

    /**
     * Value for nickels.
     */
    private static final int NICKEL = 5;

    /**
     * Value for pennies.
     */
    private static final int PENNY = 1;

    /**
     * Value for converting to cents.
     */
    private static final int CONVERT = 100;

    /**
     * Drives the program.
     * @param args unused.
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an amount of money:");

        double amount = scan.nextDouble();

        /**
         * Variable for current amount.
         */
        int currentAmount = (int) (amount * CONVERT);

        int tens = currentAmount / TEN;
        currentAmount = currentAmount - (tens * TEN);

        int fives = currentAmount / FIVE;
        currentAmount = currentAmount - (fives * FIVE);

        int toonies = currentAmount / TOONIE;
        currentAmount = currentAmount - (toonies * TOONIE);

        int loonies = currentAmount / LOONIE;
        currentAmount = currentAmount - (loonies * LOONIE);

        int quarters = currentAmount / QUARTER;
        currentAmount = currentAmount - (quarters * QUARTER);

        int dimes = currentAmount / DIME;
        currentAmount = currentAmount - (dimes * DIME);

        int nickels = currentAmount / NICKEL;
        currentAmount = currentAmount - (nickels * NICKEL);

        int pennies = currentAmount;

        System.out.println(tens + " ten dollar bills");
        System.out.println(fives + " five dollar bills");
        System.out.println(toonies + " toonies");
        System.out.println(loonies + " loonies");
        System.out.println(quarters + " quarters");
        System.out.println(dimes + " dimes");
        System.out.println(nickels + " nickels");
        System.out.println(pennies + " pennies");
    }

}
