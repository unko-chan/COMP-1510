package ca.bcit.comp1510.lab02;

import java.util.Scanner;


/**
 * Paints a room.
 * 
 * @author Kevin Liang
 * @version 2023
 * 
 */
public class Paint {
    /**
     * Assume that a 4 litre (≈1 gallon) can of paint
     * will cover 400 square feet.
     */
    
    static final int COVERAGE = 400;

    /**
     * Drives the program.
     * 
     * @param args unused.
     * 
     */
    
    public static void main(String[] args) {
        
        Scanner myScanner = new Scanner(System.in);
        
        System.out.println("Enter length of the room in feet.");
        double length = myScanner.nextDouble();
        
        System.out.println("Enter width of the room in feet.");
        double width = myScanner.nextDouble();
        
        System.out.println("Enter height of the room in feet.");
        double height = myScanner.nextDouble();
        
        System.out.println("Enter the number of coats.");
        double coats = myScanner.nextDouble();
        
        myScanner.close();
        
        double surfaceArea = 2 * (width * length + height * length 
                + height * width);
        
        double coverageNeeded = coats * surfaceArea;
        
        double cansOfPaintNeeded = coverageNeeded / COVERAGE;
        
        System.out.println("You need to buy " + cansOfPaintNeeded
                + " cans of paint.");
    }

}
