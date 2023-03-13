package ca.bcit.comp1510.lab08;

import java.util.Scanner;

/**
 * Represent a valid Gregorian date on or after 24 February 1582.
 * @author blink & Kevin Liang
 * @version 2023
 */

public class Date {

    /** days in each month.  0 is a placeholder for the first element. */
    private static final int[] DAYS_IN_MONTH = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    /** Month of February. */
    private static final int FEBRUARY = 2;

    /** Max number of months in a year. */
    private static final int MAX_MONTH = 12;

    /** Number of years between a leap year and the next. */
    private static final int LEAP_YEAR = 4;

    /** Number of years between a century and the next. */
    private static final int CENTURY = 100;

    /** Number of years between a quarter-century and the next. */
    private static final int QUARTER_CENTURY = 400;

    /** Number of days in a leap year. */
    private static final int LEAP_DAY = 29;

    /** Minimum year in Gregorian calendar. */
    private static final int MIN_YEAR = 1582;

    /** Maximum year in Gregorian calendar. */
    private static final int MAX_YEAR = 2999;

    /** day of month.  1 ... max days in month */
    private int day;

    /** month of year.  1 ... 12 */
    private int month;

    /** year in Gregorian calendar.  1001 ... 2999 */
    private int year;

    /**
     * Constructs a Date object.
     * @param theDay day of month
     * @param theMonth month of year
     * @param theYear year in Gregorian calendar
     */
    public Date(int theDay, int theMonth, int theYear) {
        // fill this code in and only store a valid date.  
        // throw exception if parameters are not a valid date

        if (isDateValid(theDay, theMonth, theYear)) {
            day = theDay;
            month = theMonth;
            year = theYear;
        } else {
            throw new IllegalArgumentException("Date is not valid");
        }
    }

    /**
     * Validates the month.
     * @param m month of year
     * @return boolean of whether the month is valid
     */
    public static boolean isMonthValid(int m) {
        return 1 <= m && m <= MAX_MONTH;
    }

    /**
     * Validates the year.
     * @param year year in Gregorian calendar
     * @return boolean of whether the year is valid
     */
    public static boolean isYearValid(int year) {
        return MIN_YEAR <= year && year <= MAX_YEAR;
    }

    /**
     * Checks if the year is a leap year.
     * @param year year in Gregorian calendar
     * @return boolean of whether the year is a leap year
     */
    public static boolean isLeapYear(int year) {
        if (isYearValid(year)) {
            if (year % LEAP_YEAR == 0 && year % CENTURY != 0) {
                return true;
            } else {
                return year % QUARTER_CENTURY == 0;
            }
        } else {
            return false;
        }
    }

    /**
     * Validates the day.
     * @param day day of month
     * @param daysInMonth max days in month
     * @return boolean of whether the day is valid
     */
    public static boolean isDayValid(int day, int daysInMonth) {
        return 1 <= day && day <= daysInMonth;
    }

    /**
     * Returns the number of days in the month.
     * @param month month of year
     * @param isLeapYear boolean of whether the year is a leap year
     * @return number of days in the month
     */
    public static int daysInMonth(int month, boolean isLeapYear) {
        if (!isMonthValid(month)) {
            return 0;
        }
        if (month == FEBRUARY) {
            if (isLeapYear) {
                return LEAP_DAY;
            }
        }
        return DAYS_IN_MONTH[month];
    }

    /**
     * Validates the date.
     * @param day day of month
     * @param month month of year
     * @param year year in Gregorian calendar
     * @return boolean of whether the date is valid
     */
    public static boolean isDateValid(int day, int month, int year) {
        boolean monthValid;
        boolean yearValid;
        boolean dayValid;
        int daysInMonth;
        boolean leapYear;
        boolean dateValid;

        monthValid = isMonthValid(month);
        yearValid = isYearValid(year);
        leapYear = isLeapYear(year);
        daysInMonth = daysInMonth(month, leapYear);
        dayValid = isDayValid(day, daysInMonth);

        dateValid = monthValid && yearValid && dayValid;

        return dateValid;
    }

    /**
     * Drives the program.
     * @param args unused
     */
    public static void main(String[] args) { 
        Scanner input = new Scanner(System.in);
        int month;
        int day;
        int year;

        System.out.println("Enter a date in the form mm dd yyyy");

        month = input.nextInt();
        day = input.nextInt();
        year = input.nextInt();

        boolean leapYear = isLeapYear(year);
        boolean validDate = isDateValid(day, month, year);

        Date date = new Date(day, month, year);

        if (validDate) {
            System.out.println("Date is valid");
        }

        if (leapYear) {
            System.out.println("Leap year");
        }
    } 
} 
