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
     * Drives the program.
     *
     * @param args unused.
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the title of your favourite book.");

        String input = scan.nextLine();

        String trimmedUserInput = input.trim();

        String inputUpperCase = trimmedUserInput.toUpperCase();
        // 16. toUpperCase() does not mutate the original string.

        final int inputLength = trimmedUserInput.length();

        String trimmedLowerCase = trimmedUserInput.toLowerCase();

        String firstUpper =
                trimmedLowerCase.substring(0, 1).toUpperCase();

        String lastUpper =
                trimmedLowerCase.substring(inputLength - 1, inputLength).
                        toUpperCase();

        String trimmedString =
                trimmedUserInput.substring(1, inputLength - 1).toLowerCase();

        String finalString = firstUpper + trimmedString + lastUpper;

        System.out.println("Stored Input: " + input);
        System.out.println("Length of title: " + inputLength);

        if (trimmedUserInput.startsWith("The")) {
            System.out.println("The first word of your title starts with "
                    + "\"The\".");
        }

        System.out.println("toUpperCase() invoked on input: "
                + trimmedUserInput.toUpperCase());

        System.out.println("Assigned result to new String Variable: "
                + inputUpperCase);

        System.out.println("Name of book in uppercase: "
                + trimmedUserInput.toUpperCase());

        System.out.println("Name of book in lowercase: "
                + trimmedUserInput.toLowerCase());

        System.out.println(finalString);
    }
}
