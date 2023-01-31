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
     * Variable for current amount.
     */
    private static int currentAmount;

    /**
     * Drives the program.
     * @param args unused.
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an amount of money:");

        double amount = scan.nextDouble();

        currentAmount = (int) (amount * CONVERT);

        int tens = calculateChange(TEN);
        int fives = calculateChange(FIVE);
        int toonies = calculateChange(TOONIE);
        int loonies = calculateChange(LOONIE);
        int quarters = calculateChange(QUARTER);
        int dimes = calculateChange(DIME);
        int nickels = calculateChange(NICKEL);
        int pennies = calculateChange(PENNY);

        System.out.println(tens + " ten dollar bills");
        System.out.println(fives + " five dollar bills");
        System.out.println(toonies + " toonies");
        System.out.println(loonies + " loonies");
        System.out.println(quarters + " quarters");
        System.out.println(dimes + " dimes");
        System.out.println(nickels + " nickels");
        System.out.println(pennies + " pennies");
    }

    /**
     * Takes in a currency type to calculate change and
     * subtract from total amount left.
     * @param type the type of change.
     * @return the amount of change.
     */
    public static int calculateChange(int type) {
        int change = currentAmount / type;
        currentAmount = currentAmount - (change * type);

        return change;
    }
}
