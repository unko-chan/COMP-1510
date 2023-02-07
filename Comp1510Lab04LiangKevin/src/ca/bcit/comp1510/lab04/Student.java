package ca.bcit.comp1510.lab04;

public class Student {
    private String firstName;
    private String lastName;
    private int birthYear;
    private String studentNumber;
    private int gradeAverage;

    /**
     * Constructs a Student object.
     * @param firstName first name
     * @param lastName last name
     * @param birthYear birth year
     * @param studentNumber student number
     * @param gradeAverage grade average
     */
    public Student(String firstName, String lastName, int birthYear,
                   String studentNumber, int gradeAverage) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthYear = birthYear;
        this.studentNumber = studentNumber;
        this.gradeAverage = gradeAverage;
    }

    /**
     * Sets the first name.
     * @param firstName the first name to set
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }

    public void setGradeAverage(int gradeAverage) {
        this.gradeAverage = gradeAverage;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    public int getGradeAverage() {
        return gradeAverage;
    }

    public String toString() {
        return firstName + " " + lastName + " " + birthYear + " "
                + studentNumber + " " + gradeAverage;
    }
}
