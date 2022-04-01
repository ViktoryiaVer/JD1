package home_work_2.sorts;

import home_work_2.utils.ArraysUtils;
import home_work_2.utils.SortsUtils;
import java.util.Arrays;

/**
 * класс, в котором осуществляется тестирование методо пузырьковой и шейкерной сортировок
 */
public class SortsMain {
    public static void main(String[] args) {
        int [] test1 = {1,2,3,4,5,6};
        int [] test2 = {1,1,1,1};
        int [] test3 = {9,1,5,99,9,9};
        int [] test4 = {};
        int [] test5 = {6,5,4,3,2,1};

        // тесты сортировки предварительно созданных массивов

        System.out.println("Сортировка массива при помощи пузырьковой сортировки.");
        System.out.print(Arrays.toString(test1) + " -> ");
        SortsUtils.bubbleSort(test1);
        System.out.println("Сортировка массива при помощи шейкерной сортировки.");
        System.out.print(Arrays.toString(test1) + " -> ");
        SortsUtils.shakeSort(test1);

        System.out.println("Сортировка массива при помощи пузырьковой сортировки.");
        System.out.print(Arrays.toString(test2) + " -> ");
        SortsUtils.bubbleSort(test2);
        System.out.println("Сортировка массива при помощи шейкерной сортировки.");
        System.out.print(Arrays.toString(test2) + " -> ");
        SortsUtils.shakeSort(test2);

        System.out.println("Сортировка массива при помощи пузырьковой сортировки.");
        System.out.print(Arrays.toString(test3) + " -> ");
        SortsUtils.bubbleSort(test3);
        System.out.println("Сортировка массива при помощи шейкерной сортировки.");
        System.out.print(Arrays.toString(test3) + " -> ");
        SortsUtils.shakeSort(test3);

        System.out.println("Сортировка массива при помощи пузырьковой сортировки.");
        System.out.print(Arrays.toString(test4) + " -> ");
        SortsUtils.bubbleSort(test4);
        System.out.println("Сортировка массива при помощи шейкерной сортировки.");
        System.out.print(Arrays.toString(test4) + " -> ");
        SortsUtils.shakeSort(test4);

        System.out.println("Сортировка массива при помощи пузырьковой сортировки.");
        System.out.print(Arrays.toString(test5) + " -> ");
        SortsUtils.bubbleSort(test5);
        System.out.println("Сортировка массива при помощи шейкерной сортировки.");
        System.out.print(Arrays.toString(test5) + " -> ");
        SortsUtils.shakeSort(test5);

        // тесты сортировки массвиа рандомных чисел
        int [] randomTest = ArraysUtils.arrayRandom(50, 100);

        System.out.println("Сортировка массива при помощи пузырьковой сортировки.");
        System.out.println(Arrays.toString(randomTest) + " -> ");
        SortsUtils.bubbleSort(randomTest);
        System.out.println("Сортировка массива при помощи шейкерной сортировки.");
        System.out.println(Arrays.toString(randomTest) + " -> ");
        SortsUtils.shakeSort(randomTest);

        // тесты сортировки массива, полученного с консоли
        int[] arrayFromConsoleTest = ArraysUtils.arrayFromConsole();

        System.out.println("Сортировка массива при помощи пузырьковой сортировки.");
        System.out.print(Arrays.toString(arrayFromConsoleTest) + " -> ");
        SortsUtils.bubbleSort(arrayFromConsoleTest);
        System.out.println("Сортировка массива при помощи шейкерной сортировки.");
        System.out.print(Arrays.toString(arrayFromConsoleTest) + " -> ");
        SortsUtils.shakeSort(arrayFromConsoleTest);
    }
}
