package home_work_2.test.arrays;

import home_work_2.arrays.ForOperation;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ForOperationTest {
    @Test
    public void printArrayWith7elements() {
        ForOperation forOperation = new ForOperation();
        String arrResult = forOperation.printAllArrayElements(new int[] {1, 10, 15, 100, 1000, -1, 0});
        Assertions.assertEquals("1 10 15 100 1000 -1 0", arrResult);
    }
    @Test
    public void printArrayWith1element() {
        ForOperation forOperation = new ForOperation();
        String arrResult = forOperation.printAllArrayElements(new int[] { 100});
        Assertions.assertEquals("100", arrResult);
    }

    @Test
    public void printArrayWith0elements() {
        ForOperation forOperation = new ForOperation();
        String arrResult = forOperation.printAllArrayElements(new int[0]);
        Assertions.assertEquals("", arrResult);
    }

    @Test
    public void printEverySecondInArrWith9elements() {
        ForOperation forOperation = new ForOperation();
        String arrResult = forOperation.printEverySecondElement(new int[] {1, 40, 0, -100, 1, 15, 3, -4, 10});
        Assertions.assertEquals("40 -100 15 -4 ", arrResult);
    }

    @Test
    public void printEverySecondInArrWith1element() {
        ForOperation forOperation = new ForOperation();
        String arrResult = forOperation.printEverySecondElement(new int[] {4000});
        Assertions.assertEquals("", arrResult);
    }

}
