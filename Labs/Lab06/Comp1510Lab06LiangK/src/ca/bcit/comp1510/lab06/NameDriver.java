package ca.bcit.comp1510.lab06;

public class NameDriver {
    /*
    You can do this by creating some Names and printing their toStrings.
    Create correct names and names that use white space or empty Strings for their components.
    Mutate them, too.
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
