package ca.bcit.comp1510.lab07;

/*
 *	Version 1 (Buggy).
 *
 *	This programs asks the user to enter a number "n" (bigger than 2).
 *	It then prints out the first "n" numbers of the Fibonacci Sequence.
 *	Each number is the sum of the two previous numbers.
 *
 *  Example: The output for n=11 should look exactly like this: 
 *  
 *		0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, ...
 *
 *	Fix all compile-time and run-time errors.
 *
 *@author Carly Orr
 *@version 1
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FibonacciBuggy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number bigger than 2: ");
        int n = scanner.nextInt();
        while (n < 2) {
            System.out.println("Enter a number bigger than 2: ");
            n = scanner.nextInt();
        }
        printList(getFiboList(n));
    }

    private static List<Integer> getFiboList(int n) {
        List<Integer> f = new ArrayList<Integer>(n);
        f.add(0);
        f.add(1);
        int i = 2;
        while (i < n) {
            f.add(f.get(i - 1) + f.get(i - 2));
            i++;
        }
        return f;
    }

    private static void printList(List<Integer> fiboList) {
        int i = 0;
        while (i < fiboList.size()) {
            System.out.print(fiboList.get(i));
            System.out.print(", ");
            i++;
        }
        System.out.println("...");
    }
}
