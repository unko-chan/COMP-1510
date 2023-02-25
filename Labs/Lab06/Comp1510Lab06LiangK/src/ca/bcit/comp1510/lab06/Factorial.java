package ca.bcit.comp1510.lab06;

import java.util.Scanner;

/**
 * The Factorial class.
 *
 * @author Kevin Liang
 * @version 2023
 */
public class Factorial {

    /**
     * Drives the program.
     *
     * @param args unused
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int input;
        int factorial = 1;

        System.out.println("Please enter a non-negative integer.");
        input = readInt(scan);

        if (input == 0) {
            System.out.println("ca.bcit.comp1510.lab06.Factorial: "
                    + factorial);
            return;
        }

        while (input > 0) {
            factorial = factorial * input;
            input--;
        }

        System.out.println("ca.bcit.comp1510.lab06.Factorial: " + factorial);
    }

    /**
     * Reads an integer from the user.
     *
     * @param scan the scanner object.
     * @return the integer.
     */
    public static int readInt(Scanner scan) {
        int userInput = -1;
        boolean validInput = false;
        while (!validInput) {
            System.out.println("Enter a non-negative integer: ");
            if (scan.hasNextInt()) {
                userInput = scan.nextInt();
                if (userInput >= 0) {
                    validInput = true;
                } else {
                    System.out.println("Input must be non-negative. "
                            + "Please try again.");
                }
            } else {
                System.out.println("Input must be an integer. "
                        + "Please try again.");
                scan.next();
            }
        }
        return userInput;
    }
}
