package q3;

import java.text.NumberFormat;
import java.util.Scanner;

/**
 * Calculates the discount on cheeses based on the number of cheeses purchased
 * and referrals made.
 *
 * @author Kevin Liang Set B
 * @version 1.0
 */
public class DiscountCalculator {

    /**
     * Main method to run the program.
     *
     * @param args command line arguments.
     */
    public static void main(String[] args) {
        final double maxDiscount = 0.75;
        final int convertPercent = 100;
        Scanner scan = new Scanner(System.in);

        System.out.println("Input number of cheeses purchased:");
        int cheesesPurchased = scan.nextInt();

        System.out.println("Input number of referrals:");
        int referrals = scan.nextInt();

        double sum = (double) (cheesesPurchased + referrals) / convertPercent;

        double discount = Math.min(sum, maxDiscount);
        NumberFormat percentage = NumberFormat.getPercentInstance();

        System.out.println("Floating point discount: " + discount);
        System.out.println("Percentage discount: "
                + percentage.format(discount));
    }

}
