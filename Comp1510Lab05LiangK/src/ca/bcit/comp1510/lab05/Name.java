package ca.bcit.comp1510.lab05;

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

    public int nameLength() {
        return first.length() + middle.length() + last.length();
    }


    /**
     * Returns the initials of the name.
     * @return the initials of the name.
     */
    public String initials() {
        return (first.substring(0, 1) + middle.substring(0, 1)
                + last.substring(0, 1)).toUpperCase();
    }

    /**
     * Returns the nth character of the name.
     * @param n the nth character.
     * @return the nth character of the name.
     */
    public int nthChar(int n) {
        return (first + middle + last).charAt(n);
    }

    /**
     * Returns the name in the format of last, first middle.
     * @return the name in the format of last, first middle.
     */
    public String lastFirst() {
        return last + ", " + first + " " + middle;
    }

    /**
     * Returns true if the first name is the same as the parameter.
     * @param firstName the first name.
     * @return true if the first name is the same as the parameter.
     */
    public boolean assertFirst(String firstName) {
        return first.equals(firstName);
    }

    /**
     * Returns true if the name is the same as the parameter.
     * @param name the name.
     * @return true if the name is the same as the parameter.
     */
    public boolean assertName(Name name) {
        return first.equals(name.first) && middle.equals(name.middle)
                && last.equals(name.last);
    }


    /**
     * Returns the name in the format of first middle last.
     * @return the name in the format of first middle last.
     */
    public String toString() {
        return first + " " + middle + " " + last;
    }
}
