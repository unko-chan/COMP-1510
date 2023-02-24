package ca.bcit.comp1510.lab04;

/**
 * The name class.
 * @author Kevin Liang
 * @version 2023
 */
public class Name {

    /**
     * The first name.
     */
    private String first;
    /**
     * The middle name.
     */

    private String middle;
    /**
     * The last name.
     */

    private String last;

    /**
     * Constructs a name object.
     * @param first the first name.
     * @param middle the middle name.
     * @param last the last name.
     */
    public Name(String first, String middle, String last) {
        this.first = first;
        this.middle = middle;
        this.last = last;
    }

    /**
     * Gets the first name.
     * @return the first name.
     */
    public String getFirst() {
        return first;
    }


    /**
     * Sets the first name.
     * @param first the first name.
     */
    public void setFirst(String first) {
        this.first = first;
    }

    /**
     * Gets the middle name.
     * @return the middle name.
     */
    public String getMiddle() {
        return middle;
    }

    /**
     * Sets the middle name.
     * @param middle the middle name.
     */
    public void setMiddle(String middle) {
        this.middle = middle;
    }

    /**
     * Gets the last name.
     * @return the last name.
     */
    public String getLast() {
        return last;
    }

    /**
     * Sets the last name.
     * @param last the last name.
     */
    public void setLast(String last) {
        this.last = last;
    }

    /**
     * Returns the name in the format of first middle last.
     * @return the name in the format of first middle last.
     */
    public String toString() {
        return first + " " + middle + " " + last;
    }
}
