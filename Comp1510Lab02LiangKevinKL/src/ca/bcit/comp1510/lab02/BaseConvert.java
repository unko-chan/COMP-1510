package ca.bcit.comp1510.lab02;

import java.util.Scanner;

/**
 * Converts a base 10 number to a 4-digit number
 * in another base
 * 
 * @author Kevin Liang
 * @version 2023
 *
 */
public class BaseConvert {
    
    /**
     * Set MaxDigits.
     */
    static final int MAXDIGITS = 4;
    
    /**
     * Drives the program.
     * @param args unused.
     */
    public static void main(String[] args) {
        int base10number; // the number in base 10
        int base; // the new base
        int maximumNumber = 0; // the maximum number that will fit
        // in 4 digits in the new base
        int place0; // digit in the 1's (base^0) place
        int place1;
        int place2;
        int place3;
        Scanner scan = new Scanner(System.in);
        System.out.println("Base Conversion Program");
        System.out.print("Please enter a base (2-9): ");
        
        // Assign the user's input to the base variable
        base = scan.nextInt();
        
        // Calculate the correct value to store in maxNumber
        maximumNumber = (int) Math.pow(base, MAXDIGITS) - 1;
        
        
        System.out.println("The max base 10 number to convert for that base is " + maximumNumber);
        System.out.print("Please enter a base 10 number to convert: ");
        
        // Assign the user's input to the base10number variable
        base10number = scan.nextInt();
        
        int computePlace = base10number % base;
        int computeQuotient = base10number / base;

        place0 = computePlace;  
        base10number = computeQuotient;
        
        computePlace = base10number % base;
        place1 = computePlace;
        computeQuotient = base10number / base;
        base10number = computeQuotient;
                
        computePlace = base10number % base;
        place2 = computePlace;
        computeQuotient = base10number / base;
        base10number = computeQuotient;
                
        computePlace = base10number % base;
        place3 = computePlace;
        computeQuotient = base10number / base;
        base10number = computeQuotient;
                
        //REVERSE PLACE
        String baseBNumber = new String("Number in new base: " 
                + place3 + place2 + place1 + place0 );
        scan.close();
        
        System.out.println(baseBNumber);
    }

}
