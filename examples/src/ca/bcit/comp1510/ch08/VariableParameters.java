package ca.bcit.comp1510.ch08;

/**
 * Demonstrates the use of a variable length parameter list.
 * 
 * @author Lewis & Loftus 9e
 * @author BCIT
 * @version 2017
 */
public class VariableParameters {

    /**
     * Creates two Family objects using a constructor that accepts
     * a variable number of String objects as parameters.
     * @param args command line arguments (unused)
     */
    public static void main(String[] args) {
        Family lewis = new Family("John", "Sharon", "Justin",
                "Kayla", "Nathan", "Samantha");

        Family camden = new Family("Stephen", "Annie", "Matt",
                "Mary", "Simon", "Lucy", "Ruthie", "Sam", "David");
        
        String[] members = {"Rabten", "Drolma", "Tenzin", "Yeshe"};        
        Family gyaltsen = new Family(members);
        
        //check whether implementation of Family allows access to internals
        //with an alias
        members[1] = "Yonten";

        System.out.println(lewis);
        System.out.println();
        System.out.println(camden);
        System.out.println();
        System.out.println(gyaltsen);
        
    }
}

