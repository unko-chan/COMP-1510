import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int input;
        int factorial = 1;

        System.out.println("Please enter a non-negative integer.");
        input = readInt(scan);

        if (input == 0) {
            System.out.println("Factorial: " + factorial);
            return;
        }

        while (input > 0) {
            factorial = factorial * input;
            input--;
        }

        System.out.println("Factorial: " + factorial);
    }

    public static int readInt(Scanner scan) {
        int userInput = -1;
        boolean validInput = false;
        while (!validInput) {
            System.out.println("Enter a non-negative integer: ");
            if (scan.hasNextInt()) {
                userInput = scan.nextInt();
                if (userInput >= 0) {
                    validInput = true;
                } else {
                    System.out.println("Input must be non-negative. "
                            + "Please try again.");
                }
            } else {
                System.out.println("Input must be an integer. "
                        + "Please try again.");
                scan.next(); // clear the invalid input from scanner
            }
        }
        return userInput;
    }
}
