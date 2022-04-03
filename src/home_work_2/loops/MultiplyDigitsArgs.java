package home_work_2.loops;

/**
 * в классе решается задание 1.2 - все цифры числа перемножаются, выводится ход решения и результат
 */

public class MultiplyDigitsArgs {
    public static void main(String[] args) {
        String enteredData = args[0];

        // обработка дробного числа и не числа: дальнейшие расчеты производятся, только если введено целое число
        if(isDouble(enteredData)) {
            System.out.println("Ошибка! Вы ввели не целое число.");
            return;
        }
        if(isText(enteredData)) {
            System.out.println("Ошибка! Вы ввели не число!");
            return;
        }
        int result = multiplyDigits(enteredData); // вызов метода для умножения цифр числа и возвращение значения

        System.out.println(showMultiplicationAsString(enteredData) + " = " + result); // печать хода решения  в виде отформатированной строки вместе с результатом

    }

    /**
     * определяет, является ли строка дробным числом:
     * проверяет, содержит ли строка . или , между цифрами
     * @param input строка, содержимое которой необходимо проверить
     * @return true, если . или , была найдена между цифрами (т.е., число дробное); false, если . или , между цифрами обнаружено не было
     */
    public static boolean isDouble (String input) {
        return input.matches("\\d+([.,]\\d+$)");
    }

    /**
     * определяет, является ли строка не числом:
     * проверяет, содержатся ли не цифры в строке
     * @param str строка, которую необходимо проверить
     * @return true, если строка содержит не цифры (кроме . или , между цифрами); false, если в строке находятся только цифры или . или , между цифрами
     */
    public static boolean isText (String str) {
        char[] chars = str.toCharArray();
        if(isDouble(str)) {
            return false; // если число является дробным, дальнейшая проверка не нужна
        }
        for (char c : chars) {
            if(!Character.isDigit(c)){
                return true;
            }
        }
        return false;
    }

    /**
     * умножает цифры числа, переданного как аргумент исполняемой программы в виде строки
     * @param str строка, цифры из которой нужно умножить друг на друга
     * @return результат умножения в виде числа
     */
    public static int multiplyDigits(String str) {
        char[] chars = str.toCharArray();

        int result = 1;
        for (char c : chars) {
            result *= Character.digit(c, 10);
        }
        return result;
    }

    /**
     * показывает ход умножения цифр числа в отформатированной строке
     * @param str строка, для цифр числа из которой нужно показать ход умноженя
     * @return ход умножения цифр числа в виде отформатированной строки
     */
    public static String showMultiplicationAsString(String str) {
        char[] chars = str.toCharArray();

        StringBuilder multResult = new StringBuilder();
        for(int i = 0; i < chars.length; i++) {
            multResult.append(chars[i]);

            if(i < chars.length - 1){
                multResult.append(" * ");
            }
        }

        return multResult.toString();
    }

}
