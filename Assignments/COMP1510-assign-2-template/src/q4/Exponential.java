package q4;

/**
 * Computes and prints -10.0 to 10.0 of the exponential function.
 *
 * @author Kevin Liang
 * @version 2023
 */
public class Exponential {

    /**
     * The minimum value of x.
     */
    private static final double MIN = -10.0;

    /**
     * The maximum value of x.
     */
    private static final double MAX = 10.0;

    /**
     * Computes the exponential function.
     *
     * @param x the argument
     * @return the value of e^x
     */
    public static double exp(double x) {
        double result = 1.0;
        double term = 1.0;
        int k = 1;
        while (term != 0.0) {
            term *= x / k;
            result += term;
            k++;
        }
        return result;
    }

    /**
     * Evaluates and prints the exponential function.
     * 
     * @param args command line arguments
     */
    public static void main(String[] args) {
        for (double x = -MIN; x <= MAX; x++) {
            double expx = Exponential.exp(x);
            System.out.printf("%10.2f %10.6f%n", x, expx);
        }
    }
}


