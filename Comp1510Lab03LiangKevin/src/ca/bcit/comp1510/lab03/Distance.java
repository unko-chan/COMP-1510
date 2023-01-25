package ca.bcit.comp1510.lab03;

import java.util.Scanner;

import java.text.DecimalFormat;

/**
 * Prints the distance between two coordinates.
 * @author Kevin Liang
 * @version 2023
 */
public class Distance {
    /**
     * Takes inputs and calculates distance.
     * @param args unused
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter x and y coords seperated by a space");
        double x1 = scan.nextDouble();
        double y1 = scan.nextDouble();

        System.out.println("Enter second x and y coords seperated by a space");
        double x2 = scan.nextDouble();
        double y2 = scan.nextDouble();

        double x2x1 = Math.pow((x2 - x1), 2);
        double y2y1 = Math.pow((y2 - y1), 2);

        double distance = Math.sqrt(x2x1 + y2y1);

        System.out.println("Distance: " + distance);

        String pattern = "#.##";
        DecimalFormat decimalFormat = new DecimalFormat(pattern);
        System.out.println("Formatted distance: "
                + decimalFormat.format(distance));
    }
}
