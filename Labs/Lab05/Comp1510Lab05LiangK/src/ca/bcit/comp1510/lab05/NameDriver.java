package ca.bcit.comp1510.lab05;

/**
 * The name class.
 * @author Kevin Liang
 * @version 2023
 */
public class NameDriver {

    /**
     * Drives the program.
     * @param args unused.
     */
    public static void main(String[] args) {
        Name name = new Name("Kevin", "JiaJun", "Liang");

        System.out.println(name.nameLength());
        System.out.println(name.initials());
        System.out.println(name.nthChar(2));
        System.out.println(name.lastFirst());
        System.out.println(name.assertFirst("Kevin"));
        System.out.println(name.assertName(name));

    }
}
