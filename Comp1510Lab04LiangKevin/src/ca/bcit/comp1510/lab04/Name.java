package ca.bcit.comp1510.lab04;

/**
 * The name class.
 * @author Kevin Liang
 * @version 2023
 */
public class Name {
    private String first;
    private String middle;
    private String last;

    public String getFirst() {
        return first;
    }

    public void setFirst(String first) {
        this.first = first;
    }

    public String getMiddle() {
        return middle;
    }

    public void setMiddle(String middle) {
        this.middle = middle;
    }

    public String getLast() {
        return last;
    }

    public void setLast(String last) {
        this.last = last;
    }

    public Name(String first, String middle, String last) {
        this.first = first;
        this.middle = middle;
        this.last = last;
    }

    public String toString() {
        return first + middle + last;
    }
}
