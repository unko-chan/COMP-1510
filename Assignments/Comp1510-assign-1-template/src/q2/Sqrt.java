package q2;

import java.util.Scanner;

/**
 * Calculates the estimate of the square root of a given number.
 * This program calculates the estimate of the square root of a number
 * using the Babylonian method, which is an iterative method for finding
 * the square root of a positive number.
 *
 * @author Kevin Liang Set B
 * @version 1.0
 */
public class Sqrt {
    /**
     * The main method that drives the program.
     * Reads in a double value as input and calculates its square root estimate
     * using the Babylonian method.
     *
     * @param args unused
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input a double value: ");

        double a = scan.nextDouble();

        double estimate = (a + 1) / 2;
        System.out.println("First estimate: " + estimate);

        estimate = (estimate + a / estimate) / 2;
        System.out.println("Second estimate: " + estimate);

        estimate = (estimate + a / estimate) / 2;
        System.out.println("Third estimate: " + estimate);

        estimate = (estimate + a / estimate) / 2;
        System.out.println("Fourth estimate: " + estimate);

        estimate = (estimate + a / estimate) / 2;
        System.out.println("Fifth estimate: " + estimate);

        estimate = (estimate + a / estimate) / 2;
        System.out.println("Sixth estimate: " + estimate);

        estimate = (estimate + a / estimate) / 2;
        System.out.println("Seventh estimate: " + estimate);

        estimate = (estimate + a / estimate) / 2;
        System.out.println("Eighth estimate: " + estimate);

        estimate = (estimate + a / estimate) / 2;
        System.out.println("Ninth estimate: " + estimate);

        estimate = (estimate + a / estimate) / 2;
        System.out.println("Tenth estimate: " + estimate);
    }

}
