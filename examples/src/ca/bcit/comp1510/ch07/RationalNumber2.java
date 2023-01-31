package ca.bcit.comp1510.ch07;

/**
 * Represents one rational number with a numerator and denominator. Handles
 * argument errors (divide by zero)
 *
 * @author Lewis & Loftus 9e
 * @author BCIT
 * @version 2017
 */
public class RationalNumber2 {
    /** RationalNumber2 version of numeric zero. */
    public static final RationalNumber2 ZERO = new RationalNumber2(0, 1);

    /** Numerator of rational number in reduced form, holds sign. */
    private int numerator;

    /** Denominator of rational number in reduced form, positive sign. */
    private int denominator;

    /**
     * Constructs a RationalNumber2. Ensures a nonzero denominator and stores
     * the sign in the numerator
     * 
     * @param numer Raw numerator of rational number
     * @param denom Raw denominator of rational number
     * @throws IllegalArgumentException if denom is zero
     */
    public RationalNumber2(int numer, int denom) {
        if (denom == 0) {
            throw new IllegalArgumentException("Denominator was zero");
        }

        // Make the numerator "store" the sign
        if (denom < 0) {
            numer = numer * -1;
            denom = denom * -1;
        }

        numerator = numer;
        denominator = denom;

        reduce();
    }

    /**
     * Returns the numerator of this rational number.
     * 
     * @return numerator
     */
    public int getNumerator() {
        return numerator;
    }

    /**
     * Returns the denominator of this rational number.
     * 
     * @return denominator
     */
    public int getDenominator() {
        return denominator;
    }

    /**
     * Returns the reciprocal of this rational number.
     * 
     * @return reciprocal RationalNumber
     * @throws IllegalArgumentException if this component is zero
     */
    public RationalNumber2 reciprocal() {
        if (numerator == 0) {
            throw new
                IllegalArgumentException("Tried to take reciprocal of zero");
        }

        return new RationalNumber2(denominator, numerator);
    }

    /**
     * Adds this rational number to the one passed as a parameter. A common
     * denominator is found by multiplying the individual denominators.
     * 
     * @param op2 The value to add to this
     * @return The sum of this + op2
     */
    public RationalNumber2 add(RationalNumber2 op2) {
        int commonDenominator = denominator * op2.getDenominator();
        int numerator1 = numerator * op2.getDenominator();
        int numerator2 = op2.getNumerator() * denominator;
        int sum = numerator1 + numerator2;

        return new RationalNumber2(sum, commonDenominator);
    }

    /**
     * Subtracts the rational number passed as a parameter from this rational
     * number.
     * 
     * @param op2 The value to subtract from this
     * @return The difference of this - op2
     */
    public RationalNumber2 subtract(RationalNumber2 op2) {
        int commonDenominator = denominator * op2.getDenominator();
        int numerator1 = numerator * op2.getDenominator();
        int numerator2 = op2.getNumerator() * denominator;
        int difference = numerator1 - numerator2;

        return new RationalNumber2(difference, commonDenominator);
    }

    /**
     * Multiplies this rational number by the one passed as a parameter.
     * 
     * @param op2 The value to multiply to this
     * @return The product of this * op2
     */
    public RationalNumber2 multiply(RationalNumber2 op2) {
        int numer = numerator * op2.getNumerator();
        int denom = denominator * op2.getDenominator();

        return new RationalNumber2(numer, denom);
    }

    /**
     * Divides this rational number by the one passed as a parameter by
     * multiplying by the reciprocal of the second rational.
     * 
     * @param op2 The value to divide into this
     * @return The quotient of this / op2
     * @throws IllegalArgumentException if op2 is zero
     */
    public RationalNumber2 divide(RationalNumber2 op2) {
        if (op2.equals(ZERO)) {
            throw new IllegalArgumentException("Tried to divide by zero");
        }
        return multiply(op2.reciprocal());
    }

    /**
     * Determines if this rational number is equal to the one passed as a
     * parameter. Assumes they are both reduced.
     * 
     * @param op2 The value to compare to this
     * @return true if this is equal to op2 numerically
     */
    public boolean equals(Object op2) {
        return (op2 instanceof RationalNumber2
                && numerator == ((RationalNumber2) op2).getNumerator()
                && denominator == ((RationalNumber2) op2).getDenominator());
    }

    /**
     * Satisfies requirement that for all RationalNumber r1, r2: if
     * r1.equals(r2) then r1.hashCode() == r2.hashCode(). if !r1.equals(r2) then
     * r1.hashCode() != r2.hashCode() if possible.
     * 
     * @return hash code for this
     */
    public int hashCode() {
        return numerator ^ denominator;
    }

    /**
     * Returns this rational number as a string.
     * 
     * @return string representation of this
     */
    public String toString() {
        String result;

        if (numerator == 0) {
            result = "0";
        } else if (denominator == 1) {
            result = numerator + "";
        } else {
            result = numerator + "/" + denominator;
        }

        return result;
    }


    // Reduces this rational number by dividing both the numerator and the
    // denominator by their greatest common divisor.
    private void reduce() {
        if (numerator != 0) {
            int common = gcd(Math.abs(numerator), denominator);

            numerator = numerator / common;
            denominator = denominator / common;
        } else {
            denominator = 1;
        }
    }

    /*
     * Computes and returns the greatest common divisor of the two positive
     * parameters. Uses Euclid's algorithm.
     * 
     * @param num1
     *            positive integer first argument
     * @param num2
     *            positive integer second argument
     * @return greatest positive integer that divides num1 and num2
     */
    private int gcd(int num1, int num2) {
        while (num1 != num2) {
            if (num1 > num2) {
                num1 = num1 - num2;
            } else {
                num2 = num2 - num1;
            }
        }

        return num1;
    }
}

