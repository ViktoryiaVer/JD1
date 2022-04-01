package home_work_2.arrays;

/**
 * класс для реализации интерфейса ArraysOperation при помощи do...while
 */
public class DoWhileOperation implements IArraysOperation {

    @Override
    public void printAllArrayElements(int[] arr) {
        System.out.println("Вывод всех элементов массива при помощи do...while:");
        int i = 0;
        do {
            System.out.printf("%-5d", arr[i]);
            i++;
        } while(i < arr.length);
        System.out.println();
    }

    @Override
    public void printEverySecondElement(int[] arr) {
        int i = 0;
        System.out.println("Вывод каждого второго элемента массива при помощи do...while:");
        do {
            if(i % 2 != 0) {
                System.out.printf("%-5d", arr[i]);
            }
            i++;
        } while(i < arr.length);
        System.out.println();
    }

    @Override
    public void printElementsInReversedOrder(int[] arr) {
        int i = arr.length - 1;
        System.out.println("Вывод всех элементов массива в обратном порядке при помощи do...while:");
        do {
            System.out.printf("%-5d", arr[i]);
            i--;
        } while(i>=0);
        System.out.println();
    }
}
