package q3;

import java.util.ArrayList;
import java.lang.Math;
import java.util.Scanner;

/**
 * <p>This is where you put your description about what this class does. You
 * don't have to write an essay but you should describe exactly what it does.
 * Describing it will help you to understand the programming problem better.</p>
 *
 * @author Your Name goes here
 * @version 1.0
 */
public class Primes {

    private static final ArrayList<Boolean> primes = new ArrayList<Boolean>();

    public Primes(int N) {
        for (int i = 0; i <= N; i++) {
            primes.add(true);
        }
        calculatePrimes(N);
    }

    private void calculatePrimes(int N) {
        primes.set(0, false);
        primes.set(1, false);
        int max = (int) Math.sqrt(N);
        for (int i = 2; i <= max; i++){
           if (primes.get(i)) {
                for (int j = i; j * i <= N; j++) {
                    int composite = j * i;
                    primes.set(composite, false);
                }
            }
        }
    }

    public static void printPrimes() {
        for (int i = 2; i <= primes.size() -1; i++) {
            if (primes.get(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static int countPrimes() {
        int count = 0;
        for (int i = 2; i <= primes.size() - 1; i++) {
            if (primes.get(i)) {
                count++;
            }
        }
        return count;
    }

    public static boolean isPrime(int x) {
        if (x <= primes.size() - 1){
            return primes.get(x);
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
        System.out.println("This program uses the sieve of Eratosthenes to determine which numbers are prime.");

        do {
            System.out.println("Enter an upper bound:");
            while (!scan.hasNextInt()) {
                System.out.println("Invalid input. Enter an integer greater than 1:");
                scan.nextLine();
            }
            input = scan.nextInt();
            scan.nextLine();
        } while (input <= 1);

        new Primes(input);

        System.out.println("There are " + countPrimes() + " primes");

        System.out.println("The prime numbers between 0 and " + input + " are:");

        printPrimes();
    }
}
