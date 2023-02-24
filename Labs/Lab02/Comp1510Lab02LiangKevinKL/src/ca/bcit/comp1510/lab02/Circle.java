package ca.bcit.comp1510.lab02;

import java.util.Scanner;

/**
 * Calculates important values of a Circle.
 * 
 * @author Kevin Liang
 * @version 2023
 *
 */
public class Circle {

    /**
     * Drives the program.
     * 
     * @param args unused.
     */
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter radius.");
        final double PI = 3.14159;
        
        double radius = myScanner.nextDouble();
        
        //Calculate the circumference        
        final double circumference = 2 * PI * radius;
        //Print circumference for user
        System.out.println("Circumference: " + circumference);
        
        //Calculate the area        
        final double area = PI * radius * radius;
        //Print area for user
        System.out.println("Area: " + area);
        
        //Declare double radius size
        double doubleRadius = radius * 2;
        //Calculate double circumference
        final double doubleCircumference = 2 * PI * doubleRadius;
        //Calculate size increase of circumference
        final double doubleCircumferenceSize = 
                doubleCircumference / circumference;
        
        //Calculate double area
        final double doubleArea = PI * doubleRadius * doubleRadius;
        //Calculate size increase of area
        final double doubleAreaSize = doubleArea / area;
        
        //Print circumference and area size difference
        System.out.println("When the radius is doubled, \r\n"
                + "the Circumference is: " + doubleCircumferenceSize
                + " times larger. \r\n" 
                + "the Area is: " + doubleAreaSize + " times larger."
        );
        
        myScanner.close();
    }

}
