package ca.bcit.comp1510.ch09;

/**
 * Demonstrates use of an overridden method.
 * 
 * @author Lewis & Loftus 9e
 * @author BCIT
 * @version 2017
 */
public class Messages {
    /**
     * Creates two objects and invokes the message method in each.
     * 
     * @param args
     *            command line arguments (unused)
     */
    public static void main(String[] args) {

        Thought parked = new Thought();
        Advice dates = new Advice();
        parked.message();
        
        // Invokes the overridden version of the method.
        dates.message();
    }
}

