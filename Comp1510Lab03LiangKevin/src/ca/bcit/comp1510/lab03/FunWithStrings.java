package ca.bcit.comp1510.lab03;

import java.util.Scanner;

/**
 * Having fun with strings.
 *
 * @author Kevin Liang
 * @version 2023
 */

public class FunWithStrings {

    /**
     * Length of word "The".
     */
    static final int CHAR = 3;

    /**
     * Drives the program.
     *
     * @param args unused.
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the title of your favourite book.");
        String input = scan.nextLine();
        if (input.substring(0, CHAR).equals("The")) {
            System.out.println("The first word of your title starts with "
                    + "\"The\".");
        }

        System.out.println(input.toUpperCase());
        String inputUpperCase = input.toUpperCase();
        System.out.println(inputUpperCase);
    }
}
