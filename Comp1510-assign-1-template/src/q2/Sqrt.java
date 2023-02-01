package q2;

import java.util.Scanner;

/**
 * Calculates an approximation to the square root given an input.
 * @author Kevin Liang
 * @version 1.0
 */
public class Sqrt {
    /**
     * Drives the program.
     *
     * @param args unused.
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input a double value: ");

        double a = scan.nextDouble();

        double estimate = (a + 1) / 2;
        System.out.println(estimate);

        estimate = (estimate + a / estimate) / 2;
        System.out.println(estimate);

        estimate = (estimate + a / estimate) / 2;
        System.out.println(estimate);

        estimate = (estimate + a / estimate) / 2;
        System.out.println(estimate);

        estimate = (estimate + a / estimate) / 2;
        System.out.println(estimate);

        estimate = (estimate + a / estimate) / 2;
        System.out.println(estimate);

        estimate = (estimate + a / estimate) / 2;
        System.out.println(estimate);

        estimate = (estimate + a / estimate) / 2;
        System.out.println(estimate);

        estimate = (estimate + a / estimate) / 2;
        System.out.println(estimate);

        estimate = (estimate + a / estimate) / 2;
        System.out.println(estimate);
    }

}
