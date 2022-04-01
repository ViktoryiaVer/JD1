package home_work_2.arrays;
/**
 * класс для реализации интерфейса ArraysOperation при помощи for each
 */
public class ForEachOperation implements IArraysOperation {
    @Override
    public void printAllArrayElements(int[] arr) {
        System.out.println("Вывод всех элементов массива при помощи for each:");
        for (int number : arr) {
            System.out.printf("%-5d", number);
        }
        System.out.println();
    }

    @Override
    public void printEverySecondElement(int[] arr) {
        System.out.println("Вывод каждого второго элемента массива при помщи for each:");
        int i = 0;
        for (int number : arr) {
            if(i % 2 !=0) {
                System.out.printf("%-5d", number);
            }
            i++;
        }
        System.out.println();
    }

    @Override
    public void printElementsInReversedOrder(int[] arr) {
        System.out.println("Вывод всех элементов массива в обратном порядке при помощи for each:");
        for (int number: arr){
            System.out.printf("%-5d", number);
        }
        System.out.println();
    }
}
