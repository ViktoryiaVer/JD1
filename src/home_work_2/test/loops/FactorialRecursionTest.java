package home_work_2.test.loops;

import home_work_2.loops.FactorialRecursion;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FactorialRecursionTest {
    @Test
    public void calculateFactorialfor5() {
        long result = FactorialRecursion.calculateFactorialRecursive(5);
        Assertions.assertEquals(120,result);
    }

    @Test
    public void calculateFactorialfor20() {
        long result = FactorialRecursion.calculateFactorialRecursive(20);
        Assertions.assertEquals(2_432_902_008_176_640_000L,result);
    }

    @Test
    public void calculateFactorialfor0() {
        long result = FactorialRecursion.calculateFactorialRecursive(0);
        Assertions.assertEquals(1, result);
    }

    @Test
    public void checkTypeOverflowFor21() {
        boolean isOverflowExpected = FactorialRecursion.isOverFlowExpected(21);
        Assertions.assertTrue(isOverflowExpected);
    }
    @Test
    public void checkTypeOverflowFor20() {
        boolean isOverflowExpected = FactorialRecursion.isOverFlowExpected(20);
        Assertions.assertFalse(isOverflowExpected);
    }
    @Test
    public void getCalculationInString() {
        String calc = FactorialRecursion.formatStringForResultRecursive(5);
        Assertions.assertEquals("5 * 4 * 3 * 2 * 1", calc);
    }

}
