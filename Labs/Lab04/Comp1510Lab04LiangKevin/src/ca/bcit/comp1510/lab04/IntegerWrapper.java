package ca.bcit.comp1510.lab04;

import java.util.Scanner;

/**
 * IntegerWrapper experiments with the Integer class.
 * @author Kevin Liang
 * @version 2023
 */

public class IntegerWrapper {
    /**
     * Constant for the maximum possible java integer value.
     */
    static final int MAX_VALUE = Integer.MAX_VALUE;

    /**
     * Constant for the minimum possible java integer value.
     */
    static final int MIX_VALUE = Integer.MIN_VALUE;

    /**
     * Drives the program.
     * @param args unused
     */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int input = scan.nextInt();

        String binary = Integer.toBinaryString(input);
        String hex = Integer.toHexString(input);
        String octal = Integer.toOctalString(input);

        System.out.println("The binary representation of " + input + " is "
                + binary);
        System.out.println("The hex representation of " + input + " is "
                + hex);
        System.out.println("The octal representation of " + input + " is "
                + octal);

        System.out.println("The maximum java integer value is " + MAX_VALUE);
        System.out.println("The minimum java integer value is " + MIX_VALUE);

        System.out.println("Enter two integers, one per line.");
        String inputInt1 = scan.next();
        String inputInt2 = scan.next();
        scan.close();

        int integer1 = Integer.parseInt(inputInt1);
        int integer2 = Integer.parseInt(inputInt2);

        int sum = integer1 + integer2;

        System.out.println("The sum of the two integers is " + sum);


    }
}
