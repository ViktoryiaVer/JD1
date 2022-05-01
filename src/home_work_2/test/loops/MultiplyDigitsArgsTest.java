package home_work_2.test.loops;

import home_work_2.loops.MultiplyDigitsArgs;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MultiplyDigitsArgsTest {
    @Test
    public void multiplyDigitsInt1() {
        String result = MultiplyDigitsArgs.process("181232375");
        Assertions.assertEquals("1 * 8 * 1 * 2 * 3 * 2 * 3 * 7 * 5 = 10080", result);
    }

    @Test
    public void multiplyDigitsInt2() {
        String result = MultiplyDigitsArgs.process("11111");
        Assertions.assertEquals("1 * 1 * 1 * 1 * 1 = 1", result);
    }
    @Test
    public void multiplyDigitsZero() {
        String result = MultiplyDigitsArgs.process("00001");
        Assertions.assertEquals("0 * 0 * 0 * 0 * 1 = 0", result);
    }

    @Test
    public void multiplyDigitsDouble() {
        String result = MultiplyDigitsArgs.process("9.2");
        Assertions.assertEquals("Введено не целое число", result);
    }

    @Test
    public void multiplyDigitsDoubleZeroComma() {
        String result = MultiplyDigitsArgs.process("0,0");
        Assertions.assertEquals("Введено не целое число", result);
    }

    @Test
    public void multiplyDigitsText() {
        String result = MultiplyDigitsArgs.process("Привет");
        Assertions.assertEquals("Введено не число", result);
    }

    @Test
    public void multiplyDigitsSpecificSymbols() {
        String result = MultiplyDigitsArgs.process("!§%&%&//");
        Assertions.assertEquals("Введено не число", result);
    }
}
