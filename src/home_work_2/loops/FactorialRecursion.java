package home_work_2.loops;

/**
 * в классе содержится рекурсивный метод для вычисления факториала: задание  1.2
 */
public class FactorialRecursion {
    public static void main(String[] args) {
        String enteredData = args[0];
        boolean isValidInput = FactorialOnlyCycle.hasSymbols(enteredData); // вызов метода для проверки на ввод не числа, дробного или отрицательного числа и возвращение значения

        // обработка невалидного ввода
        if(isValidInput) {
            System.out.println("Проверьте ввод. Необходимо ввести целое положительное число.");
            return;
        }

        long userNumber = Long.parseLong(args[0]);

        // обработка переполнения типа long
        if(userNumber > 20) {
            System.out.println("С таким числом будет переполнение типа long. Передайте в консоль число <= 20");
            return;
        }

        // вызов рекурсивной метода для вычисления факториала и передача возвращаемого значения
        long factorial = calculateFactorialRecursive(userNumber);


        // печать итогового результата происходит только в том случае, если не было переполнения
        System.out.println(formatStringForResultRecursive(userNumber) + " = " + factorial); // вывод отформатированной строки вместе с результатом вычисления факториала

    }

    /**
     * считает факториал числа
     * @param x число, для которого высчитывается факториал
     * @return число, которому равняется факториал переданного в методию числа
     */

    public static long calculateFactorialRecursive (long x) {
        if(x == 1) {
            return 1;
        } else {
            return x * calculateFactorialRecursive(x-1);
        }
    }

    /**
     * форматирует число в строку, в которой будет отражен ход вычисления факториала
     * @param x число, для которого расписывается ход вычисления факториала в виде строки
     * @return отформатированная строка вида x * x-1
     */

    public static String formatStringForResultRecursive(long x) {
        if("1".equals(String.valueOf(x))) {
            return "1";
        } else {
            String result = x + " * " + formatStringForResultRecursive(x-1);
            return result;
        }
    }
}
