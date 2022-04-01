package home_work_2.arrays;

import home_work_2.utils.ArraysUtils;

/**
 * класс с методами для печати всех элементов массива, каждого второго элемента массива и всех элементов в обратном порядке - 2.2
 */
public class ArraysIteration {
    public static void main(String[] args) {
        int[] container = ArraysUtils.arrayFromConsole(); // вызов метода для получения массива с консоли и возврат ее значения
        printAllArrayElements (container); // вызов метода печати всех элементов массива 4 способами
        printEverySecondElement(container); // вызов метода печати каждого второго массива 4 способами
        printElementsInReversedOrder(container); // вызов метода печати всех элементов массива в обратно порядке 4 способами
    }
    /**
     * печатает все элементы массива при помощи do... while, while, for, for each
     * @param arr  массив, который нужно распечатать
     */

    public static void printAllArrayElements(int[] arr) {
        System.out.println("Вывод всех элементов массива при помощи do...while:");
        int i = 0;
        do {
            System.out.printf("%-5d", arr[i]);
            i++;
        } while (i < arr.length);
        System.out.println();
        System.out.println("Вывод всех элементов массива при помщи while:");
        i = 0;
        while (i < arr.length) {
            System.out.printf("%-5d", arr[i]);
            i++;
        }
        System.out.println();
        System.out.println("Вывод всех элементов массива при помощи for:");
        for (i = 0; i < arr.length; i++) {
            System.out.printf("%-5d", arr[i]);
        }
        System.out.println();
        System.out.println("Вывод всех элементов массива при помощи for each:");
        for (int number : arr) {
            System.out.printf("%-5d", number);
        }
        System.out.println();
    }

    /**
     * печатает каждый второй элемент массива при помощи do... while, while, for, for each
     * @param arr  массив, который нужно распечатать
     */

    public static void printEverySecondElement(int [] arr) {
        int i = 0;
        System.out.println("Вывод каждого второго элемента массива при помощи do...while:");
        do {
            if(i % 2 != 0) {
                System.out.printf("%-5d", arr[i]);
            }
            i++;
        } while(i < arr.length);
        System.out.println();
        System.out.println("Вывод каждого второго элемента массива при помщи while:");
        i = 0;
        while(i < arr.length) {
            if(i % 2 != 0) {
                System.out.printf("%-5d", arr[i]);
            }
            i++;
        }
        System.out.println();
        System.out.println("Вывод каждого второго элемента массива при помщи for:");
        for (i = 0; i< arr.length; i++) {
            if(i % 2 != 0) {
                System.out.printf("%-5d", arr[i]);
            }
        }
        System.out.println();
        System.out.println("Вывод каждого второго элемента массива при помщи for each:");
        i = 0;
        for (int number : arr) {
            if(i % 2 !=0) {
                System.out.printf("%-5d", number);
            }
            i++;
        }
        System.out.println();
    }

    /**
     * печатает все элементы массива в обратном порядке при помощи do... while, while, for, for each
     * @param arr массив чисел, который нужно распечатать в обратном порядке
     */
    public static void printElementsInReversedOrder(int [] arr) {
        int i = arr.length - 1;
        System.out.println("Вывод всех элементов массива в обратном порядке при помощи do...while:");
        do {
            System.out.printf("%-5d", arr[i]);
            i--;
        } while(i>=0);
        System.out.println();
        System.out.println("Вывод всех элементов массива в обратном порядке при помощи while:");
        i = arr.length - 1;
        while(i>=0) {
            System.out.printf("%-5d", arr[i]);
            i--;
        }
        System.out.println();
        System.out.println("Вывод всех элементов массива в обратном порядке при помощи for:");
        for (i = arr.length - 1; i >= 0 ; i--) {
            System.out.printf("%-5d", arr[i]);
        }
        System.out.println();
        System.out.println("Вывод всех элементов массива в обратном порядке при помощи for each:");
        for (int number: arr){
            System.out.printf("%-5d", number);
        }
        System.out.println();
    }


}
