package q1;

import java.util.Scanner;

/**
 * Calculates the change given an amount of money.
 * The class prompts the user for an amount of money and then calculates
 * the number of 10 dollar bills, 5 dollar bills, toonies, loonies,
 * quarters, dimes, nickels, and pennies that make up the change.
 *
 * @author Kevin Liang Set B
 * @version 1.0
 */

public class Change {

    /**
     * The constant for the denomination of 10 dollars.
     */
    private static final int TEN = 1000;

    /**
     * The constant for the denomination of 5 dollars.
     */
    private static final int FIVE = 500;

    /**
     * The constant for the denomination of 2 dollars.
     */
    private static final int TOONIE = 200;

    /**
     * The constant for the denomination of 1 dollar.
     */
    private static final int LOONIE = 100;

    /**
     * The constant for the denomination of 25 cents.
     */
    private static final int QUARTER = 25;

    /**
     * The constant for the denomination of 10 cents.
     */
    private static final int DIME = 10;

    /**
     * The constant for the denomination of 5 cents.
     */
    private static final int NICKEL = 5;

    /**
     * The constant for converting from double to int.
     */
    private static final int CONVERT = 100;


    /**
     * Drives the program by prompting the user for an amount of money,
     * calculating the change, and printing out the number of bills and coins.
     *
     * @param args unused.
     */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter an amount of money:");

        double amount = scan.nextDouble();
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
