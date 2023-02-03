package q4;

import java.util.Scanner;

/**
 * Encodes and decodes a 5-character string into a 5-digit number.
 * The program prompts the user for a 5-character string and then encodes it
 * into a 5-digit number. The program then decodes the 5-digit number back into
 * its original 5-character string.
 *
 * @author Kevin Liang Set B
 * @version 1.0
 */
public class Pack {

    /**
     * The base of the number system.
     */
    private static final int BASE = 56;

    /**
     * The position of the first character.
     */
    private static final int POS0 = 0;

    /**
     * The position of the second character.
     */
    private static final int POS1 = 1;

    /**
     * The position of the third character.
     */
    private static final int POS2 = 2;

    /**
     * The position of the fourth character.
     */
    private static final int POS3 = 3;

    /**
     * The position of the fifth character.
     */
    private static final int POS4 = 4;
    
    
    /**
     * Drives the program by prompting the user for a 5-character input,
     * packing it into a 5-digit number, and decoding the packed number
     * back into its original characters.
     *
     * @param args unused.
     */
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Input 5 characters restricted to the range from "
                + "A to I (inclusive).");

        String input = scan.nextLine();
        System.out.println("Input: " + input);

        char c1 = input.charAt(POS0);
        char c2 = input.charAt(POS1);
        char c3 = input.charAt(POS2);
        char c4 = input.charAt(POS3);
        char c5 = input.charAt(POS4);

        int c1Num = c1 - 'A' + 1;
        int c2Num = c2 - 'A' + 1;
        int c3Num = c3 - 'A' + 1;
        int c4Num = c4 - 'A' + 1;
        int c5Num = c5 - 'A' + 1;

        // Encode
        int c1Value = (int) (c1Num * Math.pow(BASE, POS4));
        int c2Value = (int) (c2Num * Math.pow(BASE, POS3));
        int c3Value = (int) (c3Num * Math.pow(BASE, POS2));
        int c4Value = (int) (c4Num * Math.pow(BASE, POS1));
        int c5Value = (int) (c5Num * Math.pow(BASE, POS0));

        int encoded = c1Value + c2Value + c3Value + c4Value + c5Value;

        System.out.println("Encoded integer: " + encoded);

        // Decode
        int c5Digit = encoded % BASE;
        encoded = encoded / BASE;
        int c4Digit = encoded % BASE;
        encoded = encoded / BASE;
        int c3Digit = encoded % BASE;
        encoded = encoded / BASE;
        int c2Digit = encoded % BASE;
        encoded = encoded / BASE;
        int c1Digit = encoded % BASE;

        char c1Decode = (char) (c1Digit - 1 + 'A');
        char c2Decode = (char) (c2Digit - 1 + 'A');
        char c3Decode = (char) (c3Digit - 1 + 'A');
        char c4Decode = (char) (c4Digit - 1 + 'A');
        char c5Decode = (char) (c5Digit - 1 + 'A');

        System.out.println("Decoded Characters: " + c1Decode + "" + c2Decode
                + "" + c3Decode + "" + c4Decode + "" + c5Decode);

    }

}
