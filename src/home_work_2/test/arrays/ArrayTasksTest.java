package home_work_2.test.arrays;

import home_work_2.arrays.ArrayTasks;
import home_work_2.arrays.MinElements;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ArrayTasksTest {
    @Test
    public void calcSumEvenPositiveElem1() {
        int[] arr = {-1, 3, 5, 8, 0, 2, 15};
        int sum = ArrayTasks.sumEvenPositiveElements(arr);
        Assertions.assertEquals(10, sum);
    }

    @Test
    public void calcSumEvenPositiveElem2() {
        int[] arr = {-1, -2, 5, 0, -16};
        int sum = ArrayTasks.sumEvenPositiveElements(arr);
        Assertions.assertEquals(0, sum);
    }

    @Test
    public void calcSumEvenPositiveElem3() {
        int[] arr = {2, 62, 10, 7, 0, 1, 100};
        int sum = ArrayTasks.sumEvenPositiveElements(arr);
        Assertions.assertEquals(174, sum);
    }

    @Test
    public void calcSumEvenPositiveElemZeroArray() {
        int[] arr = new int[0];
        int sum = ArrayTasks.sumEvenPositiveElements(arr);
        Assertions.assertEquals(0, sum);
    }

    @Test
    public void findMaxElementWithEvenIndex1() {
        int[] arr = {-1, 0, -5};
        int sum = ArrayTasks.findMaxElementWithEvenIndex(arr);
        Assertions.assertEquals(-1, sum);
    }

    @Test
    public void findMaxElementWithEvenIndex2() {
        int[] arr = {100, 0, 3, 4, -100, 15, 2000};
        int sum = ArrayTasks.findMaxElementWithEvenIndex(arr);
        Assertions.assertEquals(2000, sum);
    }

    @Test
    public void findMaxElementWithEvenIndexZero() {
        int[] arr = new int[0];
        int sum = ArrayTasks.findMaxElementWithEvenIndex(arr);
        Assertions.assertEquals(0, sum);
    }

    @Test
    public void getSmallerAverage1() {
        int[] arr = {100, 500, 15, 45};
        int[] result = ArrayTasks.calculateAverageReturnAllSmaller(arr);
        Assertions.assertArrayEquals(new int[] {100, 15, 45}, result);
    }

    @Test
    public void getSmallerAverage2() {
        int[] arr = {-1, 30, 1000, 5, 4, 0};
        int[] result = ArrayTasks.calculateAverageReturnAllSmaller(arr);
        Assertions.assertArrayEquals(new int[] {-1, 30, 5, 4, 0}, result);
    }

    @Test
    public void getSmallerAverageZero() {
        int[] arr = new int[0];
        int[] result = ArrayTasks.calculateAverageReturnAllSmaller(arr);
        Assertions.assertArrayEquals(new int[0], result);
    }

    @Test
    public void findTwoMinElements1() {
        int[] arr = {-1, 30, 1000, 1, -5};
        MinElements elementExp = new MinElements(-5, -1);
        MinElements elementAct = ArrayTasks.findTwoMinElements(arr);
        Assertions.assertEquals(elementExp, elementAct);
    }

    @Test
    public void findTwoMinElements2() {
        int[] arr = {10, 300, 15, 500, 10};
        MinElements elementExp = new MinElements(10, 10);
        MinElements elementAct = ArrayTasks.findTwoMinElements(arr);
        Assertions.assertEquals(elementExp, elementAct);
    }

    @Test
    public void findTwoMinElements3() {
        int[] arr = {3, 3, 3, 3, 3};
        MinElements elementExp = new MinElements(3, 3);
        MinElements elementAct = ArrayTasks.findTwoMinElements(arr);
        Assertions.assertEquals(elementExp, elementAct);
    }

    @Test
    public void findTwoMinElementsZero() {
        int[] arr = new int[0];
        MinElements elementExp = null;
        MinElements elementAct = ArrayTasks.findTwoMinElements(arr);
        Assertions.assertEquals(elementExp, elementAct);
    }

    @Test
    public void deleteElementsInInterval1() {
        int a = 10;
        int b = 100;
        int[] arr = {9, 10, 99, 100, 101, 102};
        int[] resultExp = {9, 101, 102, 0, 0, 0};
        int[] resultAct = ArrayTasks.deleteElementsInInterval(a, b, arr);
        Assertions.assertArrayEquals(resultExp, resultAct);
    }

    @Test
    public void deleteElementsInInterval2() {
        int a = 4;
        int b = 4;
        int[] arr = {4, 3, 10, 4,0};
        int[] resultExp = {3, 10, 0, 0, 0};
        int[] resultAct = ArrayTasks.deleteElementsInInterval(a, b, arr);
        Assertions.assertArrayEquals(resultExp, resultAct);
    }

    @Test
    public void deleteElementsInInterval3() {
        int a = -25;
        int b = -5;
        int[] arr = {5, -5, -25, -4, -6, 0, 100};
        int[] resultExp = {5, -4, 0, 100, 0, 0, 0};
        int[] resultAct = ArrayTasks.deleteElementsInInterval(a, b, arr);
        Assertions.assertArrayEquals(resultExp, resultAct);
    }

    @Test
    public void deleteElementsInIntervalZero() {
        int a = 3;
        int b = 5;
        int[] arr = new int[0];
        int[] resultExp = new int[0];
        int[] resultAct = ArrayTasks.deleteElementsInInterval(a, b, arr);
        Assertions.assertArrayEquals(resultExp, resultAct);
    }


}
