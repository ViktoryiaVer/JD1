package home_work_2.utils;

import java.util.Random;
import java.util.Scanner;

/**
 * класс содержит метод для получения массива чисел с консоли и метод для получения массива рандомных чисел - задание 2.1
 */

public class ArraysUtils {
    public static void main(String[] args) {
        int[] container = arrayFromConsole(); // вызов метода для получения массива с консоли и возврат ее значения

        int [] container2 = arrayRandom(5, 100); // вызов метода для получения массива рандомных чисел и возврат ее значения

    }

    /**
     * получает массив с консоли
     * метод запрашивает у пользователя число для размера массива
     * если пользователь вводит некорректные данные, число запрашивается снова
     * после получения размера массива последовательно запрашивается числа для каждого элемента массива
     * если пользователь вводит некорректные данные, число запрашивается снова
     * @return массив чисел, полученный в результате ввода чисел пользователем
     */
    public static int[] arrayFromConsole() {
        System.out.println("Введите число для размера массива");
        Scanner console = new Scanner(System.in);

        // цикл, в котором проверяется корректность ввода первого числа, и который продолжается до тех пор, пока ввод не будет правильным
        while(console.hasNext("-\\d+") || console.hasNext("0") || console.hasNext("\\D+") || !console.hasNextInt()) {
            System.out.println("Ошибка! Введите целое положительное число для размера массива.");
            console.next();
        }
        int arrayLength = console.nextInt();
        int[] arr = new int [arrayLength];

        // цикл, проходящий по всему массиву и заполняющий его элементы значениями, введенными пользователем
        for (int i = 0; i <arrayLength; i++) {
            System.out.println("Введите число для элемента массива");

            // цикл, в котором проверяется корректность ввода первого числа, и который продолжается до тех пор, пока ввод не будет правильным
            while(!console.hasNextInt()) {
                System.out.println("Ошибка! Введите целое число для элемента массива.");
                console.next();
            }
            arr[i] = console.nextInt();
        }
        return arr;
    }

    /**
     * заполяняет массив определенного размера рандомными числами
     * @param size число, указывающее размер массива
     * @param maxValueExclusion - число, указывающее, до какого числа исключительно генерирвоать случайные числа
     * @return массив рандомных чисел
     */

    public static int[] arrayRandom(int size, int maxValueExclusion) {
        int [] array = new int[size];
        Random rand = new Random();
        // цикл, проходящий по всему массиву и заполняющий его элементы рандомными значениями
        for (int i = 0; i <array.length; i++) {
            array[i] = rand.nextInt(maxValueExclusion);
        }
        return array;
    }
}
