package ca.bcit.comp1510.lab07;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

/**
 * TestThis Test.
 *
 * @author Kevin Liang
 * @version 2023
 */
public class TestThisTest {

    /**
     * The TestThis object to test.
     */
    private TestThis testThis;

    /**
     * Creates a new TestThis objects before each test is executed.
     *
     * @throws Exception if a TestThis object cannot be created.
     */
    @BeforeEach
    public void setUp() {
        testThis = new TestThis();
    }

    /**
     * Tests largest method.
     */
    @Test
    public void testLargest1() {
        TestThis testThis = new TestThis();
        int result = testThis.largest(1, 2, 3);
        assertEquals(3, result);
    }

    /**
     * Tests largest method.
     */
    @Test
    public void testLargest2() {
        int result = testThis.largest(3, 2, 1);
        assertEquals(3, result);
    }

    /**
     * Tests largest method.
     */
    @Test
    public void testLargest3() {
        int result = testThis.largest(1, 3, 2);
        assertEquals(3, result);
    }

    /**
     * Tests largestList method.
     */
    @Test
    public void testLargestList1() {
        int result = testThis.largest(List.of(1, 2, 3));
        assertEquals(3, result);
    }

    /**
     * Tests largestList method.
     */
    @Test
    public void testLargestList2() {
        int result = testThis.largest(List.of(3, 2, 1));
        assertEquals(3, result);
    }

    /**
     * Tests largestList method.
     */
    @Test
    public void testLargestList3() {
        int result = testThis.largest(List.of(1, 3, 2));
        assertEquals(3, result);
    }
}