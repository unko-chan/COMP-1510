package ca.bcit.comp1510.lab01;

/**
 * Prints a poem.
 * @author Kevin Liang
 * @version 2023
 */
public class Poem {
    
    /**
     * Prints a poem using string concatenation.
     * @param args command-line arguments (unused)
     */
    public static void main(String[] args) {
        String poem = "Roses are red\r\n"
                + "Violets are blue\r\n"
                + "Sugar is sweet\r\n"
                + "But I have commitment issues\r\n"
                + "So I’d rather just be friends\r\n"
                + "At this point in our relationship.";
                    
        System.out.println(poem);
    }
}
