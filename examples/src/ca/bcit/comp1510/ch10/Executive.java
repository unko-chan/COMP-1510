package ca.bcit.comp1510.ch10;

/**
 * Represents an executive staff member, who can earn a bonus.
 *
 * @author Lewis & Loftus 9e
 * @author Bruce Link
 * @version 2017
 */
public class Executive extends Employee {
    
    /** Bonus paid on top of salary. Constructed instance leaves value zero */
    private double bonus;

    /**
     * No argument constructor. For creating components to be initialized from a
     * Scanner
     */
    public Executive() {
    }

    /**
     * Constructors a new Executive object with the specified information.
     * 
     * @param eName employee name
     * @param eAddress employee address
     * @param ePhone employee phone
     * @param socInNumber social insurance number
     * @param rate pay rate
     */
    public Executive(String eName,
                     String eAddress,
                     String ePhone, 
                     String socInNumber, 
                     double rate) {
        super(eName, eAddress, ePhone, socInNumber, rate);
    }

    /**
     * Awards the specified bonus to this executive.
     * 
     * @param execBonus Amount of bonus
     */
    public void awardBonus(double execBonus) {
        bonus = execBonus;
    }

    /**
     * Computes and returns the pay for an executive, which is the regular
     * employee payment plus a one-time bonus.
     * 
     * @return amount paid, including whatever bonus is due
     */
    public double pay() {
        double payment = super.pay() + bonus;

        bonus = 0;

        return payment;
    }
}

