package home_work_1.test;

import home_work_1.BinaryNumbersArrayBitwiseOperator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BinaryNumbersTest {
    @Test
    public void getBinaryNumberForPositive1() {
        byte userNumber = 42;
        String binaryNumber = BinaryNumbersArrayBitwiseOperator.toBinaryString(userNumber);
        Assertions.assertEquals("00101010", binaryNumber);
    }
    @Test
    public void getBinaryNumberForPositive2() {
        byte userNumber = 15;
        String binaryNumber = BinaryNumbersArrayBitwiseOperator.toBinaryString(userNumber);
        Assertions.assertEquals("00001111", binaryNumber);
    }
    @Test
    public void getBinaryNumberForNegative1() {
        byte userNumber = -42;
        String binaryNumber = BinaryNumbersArrayBitwiseOperator.toBinaryString(userNumber);
        Assertions.assertEquals("11010110", binaryNumber);
    }
    @Test
    public void getBinaryNumberForNegative2() {
        byte userNumber = -15;
        String binaryNumber = BinaryNumbersArrayBitwiseOperator.toBinaryString(userNumber);
        Assertions.assertEquals("11110001", binaryNumber);
    }
    @Test
    public void getBinaryNumberForZero() {
        byte userNumber = 0;
        String binaryNumber = BinaryNumbersArrayBitwiseOperator.toBinaryString(userNumber);
        Assertions.assertEquals("00000000", binaryNumber);
    }
}
