package ca.bcit.comp1510.lab06;

/**
 * The Mathematics2 class.
 * @author Kevin Liang
 * @version 2023
 */
public class Mathematics2 {

    /**
     * The ratio of one foot to one kilometer.
     */
    public static final double FOOT_TO_KILOMETRE_RATIO = 0.0003048;

    /**
     * The minimum value for the random number.
     */
    private static final int RANDOM_MIN = 11;

    /**
     * The maximum value for the random number.
     */
    private static final int RANDOM_MAX = 10;

    /**
     * The exception value for the random number.
     */
    private static final int RANDOM_EXCEPTION = 15;

    /**
     * Returns the area of the square with the specified edge length.
     *
     * @param edgeLength of the square.
     * @return area as a double
     */
    public double getSquareArea(double edgeLength) {
        return Math.pow(edgeLength, 2);
    }

    /**
     * Returns the sum of the specified values.
     *
     * @param first  operand
     * @param second operand
     * @return sum of the operands
     */
    public double add(double first, double second) {
        return first + second;
    }

    /**
     * Returns the product of the specified values.
     *
     * @param first  operand
     * @param second operand
     * @return product of the operands
     */
    public double multiply(double first, double second) {
        return first * second;
    }

    /**
     * Returns the difference of the specified values.
     *
     * @param first  operand
     * @param second operand
     * @return difference of the operands
     */
    public double subtract(double first, double second) {
        return first - second;
    }

    /**
     * Returns the quotient of the specified values. If the divisor is zero,
     * returns zero instead of NaN or infinity.
     *
     * @param first operand
     * @param second operand
     * @return quotient of the operands
     */
    public double divide(double first, double second) {
        if (second == 0) {
            return 0;
        }

        return first / second;
    }

    /**
     * Returns the absolute value of the specified integer.
     *
     * @param number to test
     * @return absolute value of number
     */
    public int absoluteValue(int number) {
        return Math.abs(number);
    }

    /**
     * Converts the specified number of feet to kilometres.
     *
     * @param feet to convert
     * @return kilometres in the specified number of feet
     */
    public double convertFeetToKilometres(double feet) {
        return feet * FOOT_TO_KILOMETRE_RATIO;
    }

    /**
     * Returns the sum of the numbers between zero and the
     * first parameter that are divisible by the second
     * number. For example, sumOfProducts(10, 3) will return
     * 3 + 6 + 9 = 18, and sumOfProducts(10, 2) will return
     * 2 + 4 + 6 + 8 + 10 = 30 and sumOfProducts(-10, 2) will
     * return -2 + -4 + -6 + -8 + -10 = -30.
     *
     * @param bound the upper bound
     * @param divisor the divisor
     * @return sum
     */
    public int sumOfProducts(int bound, int divisor) {
        boolean isNegative = false;
        int i = 0;
        int sum = 0;

        if (bound < 0) {
            isNegative = true;
            bound = Math.abs(bound);
        }

        while (i <= bound) {
            if (i % divisor == 0) {
                sum += i;
            }
            i++;
        }

        if (isNegative) {
            sum *= -1;
        }

        return sum;
    }

    /**
     * Returns a random number between 10 and 20 inclusive,
     * but NOT 15.
     *
     * @return random number in range [10, 20] excluding 15.
     */
    public int getRandomNumberBetweenTenAndTwentyButNotFifteen() {
        int randomNumber = (int) (Math.random() * RANDOM_MIN) + RANDOM_MAX;

        while (randomNumber == RANDOM_EXCEPTION) {
            randomNumber = (int) (Math.random() * RANDOM_MIN) + RANDOM_MAX;
        }

        return randomNumber;
    }
}
