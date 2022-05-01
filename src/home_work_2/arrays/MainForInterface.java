package home_work_2.arrays;

import home_work_2.utils.ArraysUtils;

/**
 * класс для работы с различными реализациями интерфейса ArraysOperation
 */
public class MainForInterface {
    public static void main(String[] args) {
        int[] container = ArraysUtils.arrayFromConsole(); // получение массива с консоли

        // создание объекта класса DoWhileOperation для раблты с реализацией интерфейса ArraysOperation при помощи do... while
        DoWhileOperation object1 = new DoWhileOperation();
        System.out.println(object1.printAllArrayElements(container));

        // создание объекта класса WhileOperation для раблты с реализацией интерфейса ArraysOperation при помощи while
        WhileOperation object2 = new WhileOperation();
        System.out.println(object2.printEverySecondElement(container));

        // создание объекта класса ForOperation для раблты с реализацией интерфейса ArraysOperation при помощи for
        ForOperation object3 = new ForOperation();
        System.out.println(object3.printElementsInReversedOrder(container));


        // создание объекта класса ForEachOperation для раблты с реализацией интерфейса ArraysOperation при помощи for each
        ForEachOperation object4 = new ForEachOperation();
        System.out.println(object4.printAllArrayElements(container));

    }
}
