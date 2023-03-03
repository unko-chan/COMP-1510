package ca.bcit.comp1510.lab06;

/**
 * The NameDriver class.
 *
 * @author Kevin Liang
 * @version 2023
 */
public class NameDriver {

    /**
     * Drives the program.
     * @param args unused
     */
    public static void main(String[] args) {
        Name name = new Name("kevin", "middle", "liang");
        Name whiteSpacedName = new Name("  white  ", "  space  ", "  in-name  ");
        Name emptySpacedName = new Name ("", "  ", "    ");
        System.out.println(name);
        System.out.println(whiteSpacedName);
        System.out.println(emptySpacedName);

        name.setMiddle("  ");
        emptySpacedName.setFirst("john");
        System.out.println(name);
        System.out.println(emptySpacedName);
    }
}
