package ca.bcit.comp1510.lab08;
import java.util.Scanner;


/**
 * Represent a valid Gregorian date on or after 24 February 1582
 * @author blink
 */
public class Date {
    /** day of month.  1 .. max days in month */
    private int day;
    
    /** month of year.  1 .. 12 */
    private int month;
    
    /** year in Gregorian calendar.  1001 .. 2999 */
    private int year;
    
    public Date(int theDay, int theMonth, int theYear) {
        // fill this code in and only store a valid date.  
        // throw exception if parameters are not a valid date
    }
    
    public static boolean isMonthValid(int m) {
        return 1 <= m && m <= 12;
    }
    
    public static boolean isYearValid(int year) {
        return 1582 <= year && year <= 2999;
    }
    
    public static boolean isLeapYear(int year) {
        if (year % 4 == 0 && year % 100 != 0) {
            return true;
        } else if (year % 400 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isDayValid(int day, int daysInMonth ) {
        return 1 <= day && day <= daysInMonth;
    }
    
    public static int daysInMonth(int month, boolean isLeapYear) {
        if (month == 2) {
            if (isLeapYear) {
                return 29;
            } else {
                return 28;
            }
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            return 30;
        } else {
            return 31;
        }
    }
    
    public static boolean isDateValid(int day, int month, int year) {
        
        return false;
    }
    
    public static void main(String[] args) { 
        Scanner input = new Scanner(System.in);
        int month, day, year;
        boolean monthValid, yearValid, dayValid;
        int daysInMonth;
        boolean leapYear;
        boolean dateValid;

        System.out.println("Enter a date in the form mm/dd/yyyy");

        month= input.nextInt();
        day = input.nextInt();
        year = input.nextInt();

        monthValid = isMonthValid(month);
        yearValid = isYearValid(year);
        leapYear = isLeapYear(year);
        daysInMonth = daysInMonth(month, leapYear);
        dayValid = isDayValid(day, daysInMonth);
        dateValid = isDateValid(day, month, year);

        //Use the methods to determine whether date is valid
        //   and print appropriate message
        //Create a Date object with month, day, year
    } 
} 
