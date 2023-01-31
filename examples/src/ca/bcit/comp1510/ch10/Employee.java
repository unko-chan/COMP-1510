package ca.bcit.comp1510.ch10;

import java.util.Scanner;

/**
 * Represents a general paid employee.
 *
 * @author Lewis & Loftus 9e
 * @author Bruce Link
 * @version 2017
 */
public class Employee extends StaffMember {

    /** Social Insurance Number, assumes Canadian workers. */
    private String socialInsuranceNumber;

    /**
     * Amount employee is paid per unit. For most salaried employees a unit is
     * one pay period. For hourly employees a unit is one hour.
     */
    private double payRate;

    /**
     * No argument constructor. For creating components to be initialized from a
     * Scanner
     */
    public Employee() {
    }

    /**
     * Constructor creates an Employee object with the specified information.
     * 
     * @param eName employee name
     * @param eAddress employee address
     * @param ePhone employee phone
     * @param socInNumber social insurance number
     * @param rate pay rate
     */
    public Employee(String eName,
                    String eAddress, 
                    String ePhone, 
                    String socInNumber, 
                    double rate) {
        super(eName, eAddress, ePhone);

        socialInsuranceNumber = socInNumber;
        payRate = rate;
    }

    /**
     * Returns the pay rate.
     * 
     * @return pay rate
     */
    public double getPayRate() {
        return payRate;
    }

    /**
     * Returns information about this Employee as a string.
     * 
     * @return adds sin to other information
     */
    public String toString() {
        String result = super.toString();

        result += "\nSocial Insurance Number: " + socialInsuranceNumber;

        return result;
    }

    /**
     * Returns the pay for this employee. Same as pay rate.
     * 
     * @return Amount this employee is paid
     */
    public double pay() {
        return payRate;
    }

    /**
     * Reads instance data from scanner. Subclasses that add instance data
     * should override to read additional data.
     * 
     * @param scan Should be positioned before the instance data. Each field
     *            should be a token.
     */
    public void readInstanceData(Scanner scan) {
        super.readInstanceData(scan);
        socialInsuranceNumber = scan.next();
        payRate = Double.parseDouble(scan.next());
    }
}

