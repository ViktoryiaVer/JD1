package home_work_2.loops;

import java.util.Scanner;

/**
 * в классе содержится метод для решения задания 1.4 - умножения числа до переполнения типа
 */
public class TypeOverflow {
    public static void main(String[] args) {
        //1.4.1
        long a = 1L;
        long b = 3;
        multiplyTillDataTypeOverflowPrintResults(a, b);

        //1.4.2
        b = 188;
        multiplyTillDataTypeOverflowPrintResults(a,b);

        //1.4.3
        b = -19;
        multiplyTillDataTypeOverflowPrintResults(a, b);

        //1.4.4
        System.out.println("Введите целое число для умножения до переполнения типа:");
        Scanner console = new Scanner(System.in);
        while(!console.hasNextInt()) {
            System.out.println("Введите целое число!");
            console.next();
        }
        b = console.nextInt();
        multiplyTillDataTypeOverflowPrintResults(a, b);


    }

    /**
     * метод перемножает число до переполнения типа long,
     * выводит результат до и после переполнения типа
     * @param number1 число, которое нужно перемножать
     * @param number2 число, на которое нужно умножать
     */
    public static void multiplyTillDataTypeOverflowPrintResults(long number1, long number2) {
        long result = number1;
        long lastResult = number1;

        // бесконечный цикл, выйти из которого можно, только если произойдет переполнение типа long
        while(true) {
            result *=number2;
            // переполнение происходит, если результат после переполнения не делится на результат до переполнения без остатка
            if(result % lastResult != 0 && result != 0) {
                System.out.println("Тип long переполнен. Значение до переполнения: " + lastResult + ". Значение после переполнения: " + result);
                break;
                // переполнение происходит также тогда, когда результат становится 0, а b было не 0
            } else if (number2 != 0 && result == 0) {
                System.out.println("Тип long переполнен. Значение до переполнения: " + lastResult + ". Значение после переполнения: " + result);
                break;
                // если число b равно 0, 1 или -1, цикл будет бесконечным, так как переполнения не будет
            } else if(number2 == 0 || Math.abs(number2) == 1) {
                System.out.println("Да бесконечное это дело, не стоит того. 0 * 0 всегда будет 0, а 1 * -1, то 1, то -1... Да и 1 * 1 всегда 1.");
                break;
            }
            lastResult = result;
        }
    }
}
