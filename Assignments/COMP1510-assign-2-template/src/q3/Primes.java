package q3;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * The Primes class calculates all the primes up to a given number.
 *
 * @author Kevin Liang
 * @version 2023
 */
public class Primes {

    /**
     *  Boolean array to store the primes.
     */
    private static final ArrayList<Boolean> PRIMES = new ArrayList<Boolean>();

    /**
     * Takes in a number N and calculates all the primes up to N.
     * @param n the number to calculate primes up to.
     */
    public Primes(int n) {
        for (int i = 0; i <= n; i++) {
            PRIMES.add(true);
        }
        calculatePrimes(N);
    }

    /**
     * Calculates the primes.
     * @param n the number to calculate primes up to.
     */
    private void calculatePrimes(int n) {
        PRIMES.set(0, false);
        PRIMES.set(1, false);
        int max = (int) Math.sqrt(n);
        for (int i = 2; i <= max; i++) {
            if (PRIMES.get(i)) {
                for (int j = i; j * i <= n; j++) {
                    int composite = j * i;
                    PRIMES.set(composite, false);
                }
            }
        }
    }

    /**
     * Prints the primes.
     */
    public static void printPrimes() {
        for (int i = 2; i <= PRIMES.size() - 1; i++) {
            if (PRIMES.get(i)) {
                System.out.print(i + " ");
            }
        }
    }

    /**
     * Counts the number of primes.
     * @return the number of primes.
     */
    public static int countPrimes() {
        int count = 0;
        for (int i = 2; i <= PRIMES.size() - 1; i++) {
            if (PRIMES.get(i)) {
                count++;
            }
        }
        return count;
    }

    /**
     * Checks if a number is prime.
     * @param x the number to check.
     * @return true if the number is prime, false otherwise.
     */
    public static boolean isPrime(int x) {
        if (x <= PRIMES.size() - 1) {
            return PRIMES.get(x);
        } else {
            return false;
        }
    }

    /**
     * <p>This is the main method (entry point) that gets called by the JVM.</p>
     *
     * @param args command line arguments.
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int input = 0;
        boolean awaitInput = true;
        System.out.println("This program uses the sieve of Eratosthenes "
                + "to determine which numbers are prime.");

        do {
            System.out.println("Enter an upper bound:");
            while (!scan.hasNextInt()) {
                System.out.println("Invalid input. "
                        + "Enter an integer greater than 1:");
                scan.nextLine();
            }
            input = scan.nextInt();
            scan.nextLine();
        } while (input <= 1);

        new Primes(input);

        System.out.println("There are " + countPrimes() + " primes");

        System.out.println("The prime numbers between 0 and "
                + input + " are:");

        printPrimes();
    }
}
