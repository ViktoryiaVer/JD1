package home_work_2.utils;

import java.util.Arrays;

/**
 * класс, содержащий метод пузырьковой и шейкерной сортировок - задание 4.1
 */
public class SortsUtils {

    private int[] arr;

    public SortsUtils(int[] arr) {
        this.arr = arr;
    }

    public int[] getArr() {
        return arr;
    }

    public void setArr(int[] arr) {
        this.arr = arr;
    }

    /**
     * сортирует массив при помощи пузырьковой сортировки:
     * каждый элемент массива сравнивается с соседним до тех пор, пока не будут отсортированы все элементы,
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
    }
    /**
     * сортирует массив при помощи шейкерной сортировки:
     * массив просматривается справа налево и слева направо,
     * границы сортируемой части массива сдвигаются на 1 позицию на каждой итерации,
     * просмотр массива осуществляется до тех пор, пока все элементы не встанут в порядке возрастания,
     * если при движении по части массива перестановки не происходят, то ее можно исключить из рассмотрения,
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

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SortsUtils that = (SortsUtils) o;
        return Arrays.equals(arr, that.arr);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(arr);
    }

    @Override
    public String toString() {
        return "SortsUtils{" +
                "arr=" + Arrays.toString(arr) +
                '}';
    }
}
