package home_work_2.loops;

/**
 * в классе содержится рекурсивный метод для вычисления факториала: задание  1.2
 */
public class FactorialRecursion {

    /**
     * считает факториал числа
     * @param x число, для которого высчитывается факториал
     * @return число, которому равняется факториал переданного в методию числа
     */

    public static long calculateFactorialRecursive(long x) {
        if(x == 1 || x == 0) {
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
            return x + " * " + formatStringForResultRecursive(x-1);
        }
    }

    /**
     * проверяет, будет ли переполнение типа long при вычислении факториала числа
     * @param number число типа long, которое необходимо проверить
     * @return true, если переполнение будет, false, если переполнения не будет
     */
    public static boolean isOverFlowExpected(long number){
        if(number > 20) {
            return true;
        }
        return false;
    }
}
