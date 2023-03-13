package ca.bcit.comp1510.lab08;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Date Test.
 *
 * @author Kevin Liang
 * @version 2023
 */

public class DateTest {

    private Date date;

    @Test
    public void isMonthValidTrue() {
        for (int i = 1; i <= 12; i++) {
            boolean result = Date.isMonthValid(i);
            assertTrue(result);
        }
    }

    @Test
    public void isMonthValidFalse() {
        boolean result = Date.isMonthValid(13);
        assertFalse(result);
    }

    @Test
    void isYearValid() {
        assertTrue(Date.isYearValid(1582));
        assertTrue(Date.isYearValid(2999));
        assertTrue(Date.isYearValid(2023));
        assertFalse(Date.isYearValid(1581));
        assertFalse(Date.isYearValid(3000));
    }

    @Test
    void isLeapYear() {
        assertTrue(Date.isLeapYear(2024));
        assertTrue(Date.isLeapYear(2996));
        assertFalse(Date.isLeapYear(1200));
    }

    @Test
    void isDayValid() {
        int days = Date.daysInMonth(2, true);
        assertTrue(Date.isDayValid(29, days));
        assertFalse(Date.isDayValid(30, days));

        days = Date.daysInMonth(2, false);
        assertTrue(Date.isDayValid(28, days));
        assertFalse(Date.isDayValid(29, days));
    }

    @Test
    void daysInMonth() {
        assertEquals(29, Date.daysInMonth(2, true));
        assertEquals(28, Date.daysInMonth(2, false));
        assertEquals(31, Date.daysInMonth(1, true));
        assertEquals(31, Date.daysInMonth(1, false));
    }

    @Test
    void isDateValid() {
        assertTrue(Date.isDateValid(10, 3, 2023));
        assertFalse(Date.isDateValid(10, 3, 3023));
        assertFalse(Date.isDateValid(10, 3, 1023));
    }
}
