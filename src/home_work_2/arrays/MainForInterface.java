package home_work_2.arrays;

import home_work_2.utils.ArraysUtils;

/**
 * класс для работы с различными реализациями интерфейса ArraysOperation
 */
public class MainForInterface {
    public static void main(String[] args) {
        int[] container = ArraysUtils.arrayFromConsole(); // получение массива с консоли

        // создание объекта класса DoWhileOperation для раблты с реализацией интерфейса ArraysOperation при помощи do... while
        DoWhileOperation Object1 = new DoWhileOperation();
        Object1.printAllArrayElements(container);

        // создание объекта класса WhileOperation для раблты с реализацией интерфейса ArraysOperation при помощи while
        WhileOperation Object2 = new WhileOperation();
        Object2.printEverySecondElement(container);

        // создание объекта класса ForOperation для раблты с реализацией интерфейса ArraysOperation при помощи for
        ForOperation Object3 = new ForOperation();
        Object3.printElementsInReversedOrder(container);

        // создание объекта класса ForEachOperation для раблты с реализацией интерфейса ArraysOperation при помощи for each
        ForEachOperation Object4 = new ForEachOperation();
        Object4.printAllArrayElements(container);

    }
}
