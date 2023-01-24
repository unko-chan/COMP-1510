package ca.bcit.comp1510.lab03;

import java.util.Scanner;

public class FunWithStrings {
    public FunWithStrings() {
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the title of your favourite book.");
        String input = scan.nextLine();
        if (input.substring(0, 3).equals("The")) {
            System.out.println("The first word of your title starts with \"The\".");
        }

        System.out.println(input.toUpperCase());
        String inputUpperCase = input.toUpperCase();
        System.out.println(inputUpperCase);
    }
}
