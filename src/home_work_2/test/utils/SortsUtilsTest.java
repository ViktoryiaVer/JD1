package home_work_2.test.utils;

import home_work_2.utils.SortsUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SortsUtilsTest {
    @Test
    public void sortArrayWithBubbleSortSorted() {
        SortsUtils utils = new SortsUtils(new int[]{1,2,3,4,5,6});
        int[] resultExp = {1,2,3,4,5,6};
        SortsUtils.bubbleSort(utils.getArr());
        Assertions.assertArrayEquals(resultExp,utils.getArr());

    }

    @Test
    public void sortArrayWithBubbleSortAllEqual() {
        SortsUtils utils = new SortsUtils(new int[]{1,1,1,1});
        int[] resultExp = {1,1,1,1};
        SortsUtils.bubbleSort(utils.getArr());
        Assertions.assertArrayEquals(resultExp,utils.getArr());

    }

    @Test
    public void sortArrayWithBubbleSortSomeEqual() {
        SortsUtils utils = new SortsUtils(new int[]{9,1,5,99,9,9});
        int[] resultExp = {1,5,9,9,9,99};
        SortsUtils.bubbleSort(utils.getArr());
        Assertions.assertArrayEquals(resultExp,utils.getArr());
    }

    @Test
    public void sortArrayWithBubbleSortZero() {
        SortsUtils utils = new SortsUtils(new int[]{});
        int[] resultExp = new int[]{};
        SortsUtils.bubbleSort(utils.getArr());
        Assertions.assertArrayEquals(resultExp,utils.getArr());
    }

    @Test
    public void sortArrayWithBubbleSortReversed() {
        SortsUtils utils = new SortsUtils(new int[]{6,5,4,3,2,1});
        int[] resultExp = {1,2,3,4,5,6};
        SortsUtils.bubbleSort(utils.getArr());
        Assertions.assertArrayEquals(resultExp,utils.getArr());
    }

    @Test
    public void sortArrayWithBubbleSortWithNegative() {
        SortsUtils utils = new SortsUtils(new int[]{-10,-100,1,0,-15,3, 10, -1, 999});
        int[] resultExp = {-100, -15, -10, -1, 0, 1, 3, 10, 999};
        SortsUtils.bubbleSort(utils.getArr());
        Assertions.assertArrayEquals(resultExp,utils.getArr());
    }

    @Test
    public void sortArrayWithBubbleSorTwoKinds() {
        SortsUtils utils = new SortsUtils(new int[]{0, 99, 0 , 0, 99, 99, 0});
        int[] resultExp = {0, 0, 0, 0, 99, 99, 99};
        SortsUtils.bubbleSort(utils.getArr());
        Assertions.assertArrayEquals(resultExp,utils.getArr());
    }

    @Test
    public void sortArrayWithShakeSortSorted() {
        SortsUtils utils = new SortsUtils(new int[]{1,2,3,4,5,6});
        int[] resultExp = {1,2,3,4,5,6};
        SortsUtils.shakeSort(utils.getArr());
        Assertions.assertArrayEquals(resultExp,utils.getArr());

    }

    @Test
    public void sortArrayWithShakeSortAllEqual() {
        SortsUtils utils = new SortsUtils(new int[]{1,1,1,1});
        int[] resultExp = {1,1,1,1};
        SortsUtils.shakeSort(utils.getArr());
        Assertions.assertArrayEquals(resultExp,utils.getArr());

    }

    @Test
    public void sortArrayWithShakeSortSomeEqual() {
        SortsUtils utils = new SortsUtils(new int[]{9,1,5,99,9,9});
        int[] resultExp = {1,5,9,9,9,99};
        SortsUtils.shakeSort(utils.getArr());
        Assertions.assertArrayEquals(resultExp,utils.getArr());
    }

    @Test
    public void sortArrayWithShakeSortZero() {
        SortsUtils utils = new SortsUtils(new int[]{});
        int[] resultExp = new int[]{};
        SortsUtils.shakeSort(utils.getArr());
        Assertions.assertArrayEquals(resultExp,utils.getArr());
    }

    @Test
    public void sortArrayWithShakeSortReversed() {
        SortsUtils utils = new SortsUtils(new int[]{6,5,4,3,2,1});
        int[] resultExp = {1,2,3,4,5,6};
        SortsUtils.shakeSort(utils.getArr());
        Assertions.assertArrayEquals(resultExp,utils.getArr());
    }

    @Test
    public void sortArrayWithShakeSortWithNegative() {
        SortsUtils utils = new SortsUtils(new int[]{-10,-100,1,0,-15,3, 10, -1, 999});
        int[] resultExp = {-100, -15, -10, -1, 0, 1, 3, 10, 999};
        SortsUtils.shakeSort(utils.getArr());
        Assertions.assertArrayEquals(resultExp,utils.getArr());
    }

    @Test
    public void sortArrayWithShakeSorTwoKinds() {
        SortsUtils utils = new SortsUtils(new int[]{0, 99, 0 , 0, 99, 99, 0});
        int[] resultExp = {0, 0, 0, 0, 99, 99, 99};
        SortsUtils.shakeSort(utils.getArr());
        Assertions.assertArrayEquals(resultExp,utils.getArr());
    }
}
