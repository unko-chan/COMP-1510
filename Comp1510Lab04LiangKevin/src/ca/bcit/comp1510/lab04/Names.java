package ca.bcit.comp1510.lab04;

import java.util.Scanner;

public class Names {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Input first, middle, last name "
                + "seperated by a space.");
        String first = scan.next();
        String middle = scan.next();
        String last = scan.next();

        Name name = new Name(first, middle, last);

        Name.setFirst(first);


    }
}
