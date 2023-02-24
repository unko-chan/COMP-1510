package ca.bcit.comp1510.lab04;

import java.util.Random;

/**
 * Represents one die (singular of dice) with faces showing values between 1 and
 * 6.
 * 
 * @author Lewis & Loftus 9e
 * @author BCIT
 * @author Kevin Liang
 * @version 2023
 *
 *     1. No because the max field is declared as public and its value cannot
 *     be changed after initialization. You should not have them because they
 *     do not add any value.
 *
 *     2.
 */
public class MultiDie {
    /** Maximum face value. */
    public final int max;

    /** Current value showing on the die. */
    private int faceValue;

    /**
     * Constructor sets the initial face value to 1.
     * @param numSides set number of sides on die.
     */
    public MultiDie(int numSides) {
        faceValue = roll();
        max = numSides;
    }

    /**
     * Rolls this Die and returns the result.
     * @return faceValue as an int
     */
    public int roll() {
        faceValue = (int) (Math.random() * max) + 1;

        return faceValue;
    }

    /**
     * Sets the face value of this Die to the specified value.
     * @param value an int
     */
    public void setFaceValue(int value) {
        faceValue = value;
    }

    /**
     * Returns the face value of this Die as an int.
     * @return faceValue as an int
     */
    public int getFaceValue() {
        return faceValue;
    }

    /**
     * Returns a String representation of this Die.
     * @return toString description
     */
    public String toString() {
        String result = Integer.toString(faceValue);

        return result;
    }
}

