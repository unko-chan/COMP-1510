package ca.bcit.comp1510.lab02;

/**
 * Prints A Table of Student Grades.
 * @author Kevin Liang
 * @version 2023
 * 
 */
public class Students {

    /**
     * Drives the program.
     * @param args unused.
     */
    public static void main(String[] args) {
        
        final String lineBreak = "\n";
        final String slashBorder = "///////////////////\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\";
        final String studentBorder = "==    \t    Student Points    \t    ==";
        final String slashBorderReversed = "\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\///////////////////";
        final String studentHeader = "Name \t Lab \t Bonus \t Total";
        final String divider = "---- \t --- \t ---- \t ----";
        final String joe = "Joe \t 43 \t 7 \t 50";
        final String william = "William  50 \t 8 \t 58";
        final String peng = "Peng \t 87 \t 6 \t 93";
        final String kwon = "Kwon \t 99 \t 0 \t 99";
        final String marySue = "Mary Sue 39\t 10 \t 49";
        
        System.out.println(slashBorder + lineBreak 
                + studentBorder + lineBreak 
                + slashBorderReversed + lineBreak
                + studentHeader + lineBreak
                + divider + lineBreak
                + joe + lineBreak
                + william + lineBreak
                + marySue + lineBreak
                + peng + lineBreak
                + kwon + lineBreak
                );

    }

}
