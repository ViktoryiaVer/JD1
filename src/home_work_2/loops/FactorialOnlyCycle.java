package home_work_2.loops;

/**
 * в классе решается задание по вычислению факториала 1.1
 */
public class FactorialOnlyCycle {

    /**
     * проверяет переданный в консоль аргумент на наличие символов
     * @param userInput строка, которую нужно проверить
     * @return true, если в строке были найдены символы; false, если в строке только цифры
     */

    public static boolean hasSymbols (String userInput) {
        for (int i = 0; i < userInput.length(); i++) {
            char c = userInput.charAt(i);
            if(!Character.isDigit(c)){
                return true;
            }
        }
        return false;
    }

    /**
     * высчитывает факториал числа
     * @param number число, для которого нужно высчитать факториал
     * @return результат вычисления в виде числа
     */

    public static long calculateFactorial(long number) {
        long result = 1;
        for(int i = 1; i <= number; i++) {
            result *= i;
        }
        return result;
    }

    /**
     * форматирует строку для отражения хода вычисления факториала
     * @param number число, для которого нужно отразить ход вычисления факториала
     * @return ход вычисления в виде отформатирвоанной строки
     */
    public static String showCalculationInString(long number) {
        StringBuilder resultString = new StringBuilder();
        for(int i = 1; i<=number; i++) {
            // * добавляется только тогда, когда цифра не последняя
            resultString.append(i);
            if(i < number) {
                resultString.append(" * ");
            }
        }
        return resultString.toString();
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
