package ca.bcit.comp1510.lab05;

/**
 * The Mathematics class.
 * @author Kevin Liang
 * @version 2023
 */
public class Mathematics {

    /**
     * The value of pi.
     */
    public static final double PI = Math.PI;

    /**
     * returns the area of a circle.
     * @param radius the radius of the circle.
     * @return the area of a circle.
     */
    public double getCircleArea(double radius) {
        return PI * Math.pow(radius, 2.0);
    }

    /**
     * returns the sum of the integers from 1 to ints.
     * @param ints the number of integers to sum.
     * @return the sum of the integers from 1 to ints.
     */
    public int sumOfInts(int ints) {
        int i = 0;
        int sum = 0;

        while (i <= ints) {
            sum += i;
            i++;
        }
        return sum;
    }

    /**
     * returns a boolean value indicating whether i is positive.
     * @param i the integer to check.
     * @return a boolean value indicating whether i is positive.
     */
    public boolean isPositive(int i) {
        return i > 0;
    }

    /**
     * returns a boolean value indicating whether i is even.
     * @param i the integer to check.
     * @return a boolean value indicating whether i is even.
     */
    public boolean isEven(int i) {
        return i % 2 == 0;
    }

    /**
     * returns the sum of the even integers from 0 to ints.
     * @param ints the number of integers to sum.
     * @return the sum of the even integers from 0 to ints.
     */
    public int sumOfEvens(int ints) {
        boolean negative = false;
        int i = 0;
        int sum = 0;

        if (ints < 0) {
            negative = true;
        }

        ints = Math.abs(ints);

        while (i <= ints) {
            if (isEven(i)) {
                sum += i;
            }
            i++;
        }

        if (negative) {
            sum *= -1;
        }

        return sum;
    }
}
