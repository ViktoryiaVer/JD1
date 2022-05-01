package home_work_2.test.loops;

import home_work_2.loops.PowerNumbers;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PowerNumbersTest {
    @Test
    public void powNumber1() {
        double result = PowerNumbers.powNumber(18, 5);
        Assertions.assertEquals(1_889_568.0,result);
    }

    @Test
    public void powNumber2() {
        double result = PowerNumbers.powNumber(7.5, 2);
        Assertions.assertEquals(56.25, result);
    }

    @Test
    public void powNumberZeroBase() {
        double result = PowerNumbers.powNumber(0, 2);
        Assertions.assertEquals(0, result);
    }

    @Test
    public void powNumberZeroExponent() {
        double result = PowerNumbers.powNumber(10, 0);
        Assertions.assertEquals(1, result);
    }

    @Test
    public void powNumberNegativeBase() {
        double result = PowerNumbers.powNumber(-10.5, 2);
        Assertions.assertEquals(110.25, result);
    }

    @Test
    public void checkDoubleForInt() {
        boolean isDouble = PowerNumbers.isDoubleEntered("12");
        Assertions.assertFalse(isDouble);
    }
    @Test
    public void checkDoubleForNegativeDouble() {
        boolean isDouble = PowerNumbers.isDoubleEntered("-100.3");
        Assertions.assertTrue(isDouble);
    }

    @Test
    public void checkPositiveIntForZero() {
        boolean isPositiveInt = PowerNumbers.isPositiveIntegerEntered("0");
        Assertions.assertFalse(isPositiveInt);
    }

    @Test
    public void checkPositiveIntForNegativeDouble() {
        boolean isPositiveInt = PowerNumbers.isPositiveIntegerEntered("-12.3");
        Assertions.assertFalse(isPositiveInt);
    }
}
