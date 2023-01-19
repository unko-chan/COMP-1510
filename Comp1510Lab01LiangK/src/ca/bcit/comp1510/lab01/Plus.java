package ca.bcit.comp1510.lab01;

/**
 * Demonstrates the different behaviours of the + operator.
 * 
 * @author Kevin Liang
 * @version 2023
 */
public class Plus {

    /**
     * Drives the program.
     * @param args command-line arguments (unused)
     */
    public static void main(String[] args) {
        final int year = 70;
        final int x = 8;
        final int y = 5;
        System.out.println("This is a long string that is the" 
                + " concatenation of two shorter strings.");
        System.out.println("The first computer was invented about " + year 
                + " years ago");
        
        //converts 8 and 5 to a string and concatenates 
        //both strings to form 85
        System.out.println("8 plus 5 is " + x + y);
        
        //8 + 5 happens in an isolated process hence
        //no type conversion happens
        System.out.println("8 plus 5 is " + (x + y));
        
        //no type conversion happens because
        //the compiler recognizes integers first
        System.out.println(x + y + " equals 8 plus 5.");
    }
}
