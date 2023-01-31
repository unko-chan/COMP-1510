package ca.bcit.comp1510.lab04;

import java.util.Scanner;

/**
 * Uses the MultiDie class to roll a die.
 * @author Kevin Liang
 * @version 2023
 */
public class RollingMultiDice {
    /**
     * Drives the program.
     * @param args unused.
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input the number of sides on the die:");
        int sides = scan.nextInt();

        MultiDie multiDie = new MultiDie(sides);
        System.out.println("The maximum number of sides: " + multiDie.max);
        System.out.println("Die roll value: " + multiDie.roll());
        System.out.println("Current die face value: "
                + multiDie.getFaceValue());
    }
}
