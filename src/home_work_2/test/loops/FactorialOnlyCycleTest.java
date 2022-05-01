package home_work_2.test.loops;

import home_work_2.loops.FactorialOnlyCycle;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FactorialOnlyCycleTest {
    @Test
    public void calculateFactorialfor5() {
        long result = FactorialOnlyCycle.calculateFactorial(5);
        Assertions.assertEquals(120,result);
    }

    @Test
    public void calculateFactorialfor20() {
        long result = FactorialOnlyCycle.calculateFactorial(20);
        Assertions.assertEquals(2_432_902_008_176_640_000L,result);
    }

    @Test
    public void calculateFactorialfor0() {
        long result = FactorialOnlyCycle.calculateFactorial(0);
        Assertions.assertEquals(1, result);
    }

    @Test
    public void checkInvalidSymbols() {
        boolean hasInvalidSymbols = FactorialOnlyCycle.hasSymbols("privet");
        Assertions.assertTrue(hasInvalidSymbols);
    }

    @Test
    public void checkTypeOverflowFor21() {
        boolean isOverflowExpected = FactorialOnlyCycle.isOverFlowExpected(21);
        Assertions.assertTrue(isOverflowExpected);
    }
    @Test
    public void checkTypeOverflowFor20() {
        boolean isOverflowExpected = FactorialOnlyCycle.isOverFlowExpected(20);
        Assertions.assertFalse(isOverflowExpected);
    }
    @Test
    public void getCalculationInString() {
        String calc = FactorialOnlyCycle.showCalculationInString(5);
        Assertions.assertEquals("1 * 2 * 3 * 4 * 5", calc);
    }

}
