package home_work_2.arrays;
/**
 * класс для реализации интерфейса ArraysOperation при помощи for
 */
public class ForOperation implements IArraysOperation {
    @Override
    public void printAllArrayElements(int[] arr) {
        System.out.println("Вывод всех элементов массива при помощи for:");
        for(int i = 0; i < arr.length; i++) {
            System.out.printf("%-5d", arr[i]);
        }
        System.out.println();
    }

    @Override
    public void printEverySecondElement(int[] arr) {
        System.out.println("Вывод каждого второго элемента массива при помщи for:");
        for(int i = 0; i< arr.length; i++) {
            if(i % 2 != 0) {
                System.out.printf("%-5d", arr[i]);
            }
        }
        System.out.println();
    }

    @Override
    public void printElementsInReversedOrder(int[] arr) {
        System.out.println("Вывод всех элементов массива в обратном порядке при помощи for:");
        for(int i = arr.length - 1; i >= 0 ; i--) {
            System.out.printf("%-5d", arr[i]);
        }
        System.out.println();
    }
}
