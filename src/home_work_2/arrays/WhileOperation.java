package home_work_2.arrays;
/**
 * класс для реализации интерфейса ArraysOperation при помощи while
 */
public class WhileOperation implements ArraysOperation {
    @Override
    public void printAllArrayElements(int[] arr) {
        System.out.println("Вывод всех элементов массива при помщи while:");
        int i = 0;
        while (i < arr.length) {
            System.out.printf("%-5d", arr[i]);
            i++;
        }
        System.out.println();
    }

    @Override
    public void printEverySecondElement(int[] arr) {
        System.out.println("Вывод каждого второго элемента массива при помщи while:");
        int i = 0;
        while(i < arr.length) {
            if(i % 2 != 0) {
                System.out.printf("%-5d", arr[i]);
            }
            i++;
        }
        System.out.println();
    }

    @Override
    public void printElementsInReversedOrder(int[] arr) {
        System.out.println("Вывод всех элементов массива в обратном порядке при помощи while:");
        int i = arr.length - 1;
        while(i>=0) {
            System.out.printf("%-5d", arr[i]);
            i--;
        }
        System.out.println();
    }
}
