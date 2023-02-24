package ca.bcit.comp1510.lab04;

import java.util.Scanner;

/**
 * Prints a name.
 * @author Kevin Liang
 * @version 2023
 */
public class Names {
    /**
     * Drives the program.
     * @param args unused.
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Input first, middle, last name "
                + "seperated by a space.");
        String first = scan.next();
        String middle = scan.next();
        String last = scan.next();

        Name name = new Name(first, middle, last);

        name.setFirst(first.substring(0, 1).toUpperCase()
                + first.substring(1).toLowerCase());

        name.setMiddle(middle.substring(0, 1).toUpperCase()
                + middle.substring(1).toLowerCase());

        name.setLast(last.substring(0, 1).toUpperCase()
                + last.substring(1).toLowerCase());

        System.out.println(name.toString());
    }
}
