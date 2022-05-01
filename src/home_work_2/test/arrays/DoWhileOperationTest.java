package home_work_2.test.arrays;

import home_work_2.arrays.DoWhileOperation;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DoWhileOperationTest {
    @Test
    public void printArrayWith7elements() {
        DoWhileOperation doWhileOperation = new DoWhileOperation();
        String arrResult = doWhileOperation.printAllArrayElements(new int[] {1, 10, 15, 100, 1000, -1, 0});
        Assertions.assertEquals("1 10 15 100 1000 -1 0", arrResult);
    }
    @Test
    public void printArrayWith1element() {
        DoWhileOperation doWhileOperation = new DoWhileOperation();
        String arrResult = doWhileOperation.printAllArrayElements(new int[] { 100});
        Assertions.assertEquals("100", arrResult);
    }

    @Test
    public void printArrayWith0elements() {
        DoWhileOperation doWhileOperation = new DoWhileOperation();
        String arrResult = doWhileOperation.printAllArrayElements(new int[0]);
        Assertions.assertEquals("", arrResult);
    }

    @Test
    public void printEverySecondInArrWith9elements() {
        DoWhileOperation doWhileOperation = new DoWhileOperation();
        String arrResult = doWhileOperation.printEverySecondElement(new int[] {1, 40, 0, -100, 1, 15, 3, -4, 10});
        Assertions.assertEquals("40 -100 15 -4 ", arrResult);
    }

    @Test
    public void printEverySecondInArrWith1element() {
        DoWhileOperation doWhileOperation = new DoWhileOperation();
        String arrResult = doWhileOperation.printEverySecondElement(new int[] {4000});
        Assertions.assertEquals("", arrResult);
    }

}
