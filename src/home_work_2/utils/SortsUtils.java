package home_work_2.utils;

import java.util.Arrays;

/**
 * класс, содержащий метод пузырьковой и шейкерной сортировок - задание 4.1
 */
public class SortsUtils {
    public static void main(String[] args) {

    }
    /**
     * сортирует массив при помощи пузырьковой сортировки:
     * каждый элемент массива сравнивается с соседним до тех пор, пока не будут отсортированы все элементы,
     * затем результат сортировки выводится в консоль
     * @param arr массив, который нужно отсортировать
     */

    public static void bubbleSort (int[] arr) {
        for(int i = 0; i < arr.length-1; i++) {
            for(int j = 0; j < arr.length -1 -i; j++) {
                if(arr[j] > arr[j+1]) {
                    int swap = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = swap;
                }
            }
        }
        System.out.print(Arrays.toString(arr) + "\n");
    }
    /**
     * сортирует массив при помощи шейкерной сортировки:
     * массив просматривается справа налево и слева направо,
     * границы сортируемой части массива сдвигаются на 1 позицию на каждой итерации,
     * просмотр массива осуществляется до тех пор, пока все элементы не встанут в порядке возрастания,
     * если при движении по части массива перестановки не происходят, то ее можно исключить из рассмотрения,
     * после сортировки результат выводится  в консоль
     * @param arr массив, который нужно отсортировать
     */

    public static void shakeSort (int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        boolean wasSwap = true;
        while(left < right && wasSwap) {
            wasSwap = false;
            for(int i = left; i < right; i++) {
                if(arr[i] > arr[i+1]) {
                    int swap = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = swap;
                    wasSwap = true;
                }
            }
            right--;
            for(int i = right; i > left; i--) {
                if(arr[i-1] > arr[i]) {
                    int swap = arr[i];
                    arr[i] = arr[i-1];
                    arr[i-1] = swap;
                    wasSwap = true;
                }
            }
            left++;
        }
        System.out.print(Arrays.toString(arr) + "\n");

    }

}
