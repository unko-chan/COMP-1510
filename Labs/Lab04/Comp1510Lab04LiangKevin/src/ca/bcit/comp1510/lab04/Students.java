package ca.bcit.comp1510.lab04;

/**
 * The Students class.
 * @author Kevin Liang
 * @version 2023
 */
public class Students {
    private String firstName;

    private String lastName;

    private int studentNumber;

    private double gpa;

    public Students (String firstName, String lastName, int studentNumber, double gpa) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.studentNumber = studentNumber;
        this.gpa = gpa;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(int studentNumber) {
        this.studentNumber = studentNumber;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public String toString() {
        return "First name: " + firstName + '\n'
                + "Last name: " + lastName + '\n'
                + "Student number: " + studentNumber + '\n'
                + "GPA: " + gpa;
    }
}
