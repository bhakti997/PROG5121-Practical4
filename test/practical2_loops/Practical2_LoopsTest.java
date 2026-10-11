package practical2_loops;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * ICE Task 4 - Unit test for the calculateSum method
 * from the Loops practical
 */
public class Practical2_LoopsTest {

    // Test calculateSum with two positive numbers
    @Test
    public void testCalculateSumPositiveNumbers() {
        int number1 = 10;
        int number2 = 20;
        int expected = 30;

        int actual = Practical2_Loops.calculateSum(number1, number2);

        assertEquals(expected, actual);
    }

    // Test calculateSum with a negative number
    @Test
    public void testCalculateSumNegativeNumber() {
        int number1 = -5;
        int number2 = 15;
        int expected = 10;

        int actual = Practical2_Loops.calculateSum(number1, number2);

        assertEquals(expected, actual);
    }

    // Test calculateSum with zero
    @Test
    public void testCalculateSumWithZero() {
        int number1 = 0;
        int number2 = 7;
        int expected = 7;

        int actual = Practical2_Loops.calculateSum(number1, number2);

        assertEquals(expected, actual);
    }
}