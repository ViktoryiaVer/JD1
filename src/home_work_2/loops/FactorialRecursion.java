package home_work_2.loops;

/**
 * в классе содеожится рекурсивный метод для вычисления факториала: задание  1.2
 */
public class FactorialRecursion {
    public static void main(String[] args) {
        long userNumber = Long.parseLong(args[0]);

        boolean isPositiveNumber = userNumber > 0; // булевая для проверки отрицательного числа или 0

        long factorial;
        String resultString;

        // обработка ввода не положительного аргумента
        if(!isPositiveNumber) {
            System.out.println("Вы ввели не положительное число. Передайте в консоль положительное число.");
        } else {
            // вызов рекурсивной метода для вычисления факториала и передача возвращаемого значения
            factorial = calculateFactorial(userNumber);

            // обработка переполнения типа long: когда происходит переполнение, изначально положительное число становится не положительным
            if(factorial <= 0) {
                System.out.println("Переполнение типа long.\nЧтобы избежать переполнения, передайте в консоль число <= 20");
            }

            // печать итогового результата происходит только в том случае, если не было переполнения
            else {
                resultString = formatStringForShowingResult(userNumber); // вызов метода для форматирвоания строки и возврат значения
                System.out.println(resultString + " = " + factorial); // вывод отформатированной строки вместе с результатом вычисления факториала
            }
        }
    }

    /**
     * считает факториал числа
     * @param x число, для которого высчитывается факториал
     * @return число, которому равняется факториал переданного в методию числа
     */

    public static long calculateFactorial (long x) {
        if(x == 1) {
            return 1;
        } else {
            return x * calculateFactorial(x-1);
        }

    }

    /**
     * форматирует число в строку, в которой будет отражен ход вычисления факториала
     * @param x число, для которого расписывается ход вычисления факториала в виде строки
     * @return отформатированная строка вида x * x-1
     */

    public static String formatStringForShowingResult (long x) {
        if("1".equals(String.valueOf(x))) {
            return "1";
        } else {
            String result = x + " * " + formatStringForShowingResult(x-1);
            return result;
        }

    }
}
