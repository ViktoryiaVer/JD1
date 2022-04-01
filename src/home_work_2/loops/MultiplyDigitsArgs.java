package home_work_2.loops;

/**
 * в классе решается задание 1.2 - все цифры числа перемножаются, выводится ход решения и результат
 */

public class MultiplyDigitsArgs {
    public static void main(String[] args) {
        //создание булевых перемнных для последующих проверок

        boolean isDouble = args[0].matches("\\d+([.,]\\d+$)"); // проверка на дробное число, содержащее . или , между цифрами
        boolean isInt = args[0].matches("\\d+$");

        // обработка дробного числа и не числа: дальнейшие расчеты производятся, только если введено целое число
        if(isInt) {
            int strLength = args[0].length(); // получение длины введенного числа для условия последующего цикла
            int result = 1;
            StringBuilder resultString = new StringBuilder();

            // цикл, в котором получаем первую цифру из строки и парсим ее в int и выполнением произведение
            for (int i = 0; i < strLength; i++) {

                int digit = Integer.parseInt(String.valueOf(args[0].charAt(i)));
                result *= digit;

                // запись хода решения в переменную String: * добавляется только тогда, когда цифра не последняя
                if (i != strLength - 1) {
                    resultString.append(digit).append(" * ");
                } else {
                    resultString.append(digit);
                }
            }

            System.out.println(resultString + " = " + result); // печать хода решения вместе с результатом
            // обработка ввода не целого числа
        } else if(isDouble) {
            System.out.println("Ошибка! Вы ввели не целое число.");
            // обработка ввода не числа
        } else {
            System.out.println("Ошибка! Вы ввели не число!");
        }
    }
}
