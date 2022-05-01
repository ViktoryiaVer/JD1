package home_work_2.arrays;
/**
 * интерфейс для работы с методами печати массивов - задание 2.3
 */
public interface IArraysOperation {

    /**
     * печатает все элементы массива
     * @param arr массив чисел, элементы которого нужно распечатать
     */
    String printAllArrayElements(int[] arr);

    /**
     * печатает каждый второй элемент массива
     * @param arr массив чисел, каждый второй элемент которого нужно распечатать
     */
    String printEverySecondElement(int [] arr);

    /**
     * печатает все элементы массива в обратном порядке
     * @param arr массив чисел, элементы которого нужно распечатать
     */
    String printElementsInReversedOrder(int [] arr);
}
