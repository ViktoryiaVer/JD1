package home_work_2.loops;
/**
 * в классе находится решение задания 1.3 - возведение одного числа в степень второго, которые вводятся пользователем
 */

public class PowerNumbers {

    /**
     * проверяет, введено ли положительное или отрицательное дробное число
     * @param str строка, которую необходимо проверить
     * @return true, если введено дробное число, false, если введено не дробное число
     */
    public static boolean isDoubleEntered(String str) {
        return str.matches("-*\\d+[.,]\\d+");
    }

    /**
     * проверяет, введено ли положительное целое число
     * @param str строка, которую необходимо проверить
     * @return true, если введено положительное целое число, false, если введено не целое положительное число
     */
    public static boolean isPositiveIntegerEntered(String str) {
        if("0".equals(str)) {
            return false;
        }
        return str.matches("\\d+");
    }

    /**
     * возводит положительное или отрицательное дробное число в степень целого положительного числа
     * @param first положительное или отрицательное дробное число, которое необходимо возвести в степень
     * @param second целое положительное числа, в степень которого необходимо возвести
     * @return результат возведения в степень типа double
     */
    public static double powNumber(double first, int second) {
        if(first == 0) {
            return 0;
        }
        double powResult = 1;
        for(int i = 1; i <= second; i++) {
            powResult *= first;
        }
        return powResult;
    }


}
