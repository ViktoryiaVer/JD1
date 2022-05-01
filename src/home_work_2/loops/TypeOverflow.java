package home_work_2.loops;

import java.util.Scanner;

/**
 * в классе содержится метод для решения задания 1.4 - умножения числа до переполнения типа
 */
public class TypeOverflow {

    /**
     * метод перемножает число до переполнения типа long,
     * выводит результат до и после переполнения типа
     * @param number1 число, которое нужно перемножать
     * @param number2 число, на которое нужно умножать
     */
    public static long[] multiplyTillDataTypeOverflow(long number1, long number2) {
        long result = number1;
        long lastResult = number1;
        long [] results  = new long[2];

        // бесконечный цикл, выйти из которого можно, только если произойдет переполнение типа long
        while(true) {
            result *=number2;
            // переполнение происходит, если результат после переполнения не делится на результат до переполнения без остатка
            if(result % lastResult != 0 && result != 0) {
                results[0] = lastResult;
                results[1] = result;
                break;
                // переполнение происходит также тогда, когда результат становится 0, а b было не 0
            } else if(number2 != 0 && result == 0) {
                results[0] = lastResult;
                results[1] = result;
                break;
                // если число b равно 0, 1 или -1, цикл будет бесконечным, так как переполнения не будет
            } else if(number2 == 0 || Math.abs(number2) == 1) {
                results[0] = 0;
                results[1] = 0;
                break;
            }
            lastResult = result;
        }
        return results;
    }
}
