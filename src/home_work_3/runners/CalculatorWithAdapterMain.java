package home_work_3.runners;

import home_work_3.calcs.adapter.CalculatorStringAdapter;
import home_work_3.calcs.adapter.StringExpressionChecker;

/**
 * класс с точкой входа для класса CalculatorStringAdapter
 */
public class CalculatorWithAdapterMain {
    public static void main(String[] args) {
        processExpr("4.1 + 15 * 7 + (28 / 5) ^ 2");
    }

    /**
     * обрабатывае введенную строку:
     * проверяет, введено ли верное выражение.
     * сообщает пользователю, если введено некоретное выражение,
     * если введено корректное выражение, вызывает метод для подсчета значения и выводит его результат
     * @param str строка, которую необходимо обработать
     */
    public static void processExpr(String str) {
        StringExpressionChecker check = new StringExpressionChecker();
        if(!check.hasCorrectSymbols(str)) {
            System.out.println("Проверьте ввод. В Вашем выражении недопустимые символы.\n" +
                    "Калькулятор поддерживает операторы +-\\*^||, (), а также константы PI, E");
            return;
        }
        try {
            System.out.println(calculate(str));
        }
        catch (NumberFormatException ex) {
            System.out.println("Ошибка! Проверьте введенное выражение!");
        }
    }

    /**
     * считает математическое выражение в виде строки,
     * для подсчета создается объект типа CalculatorStringAdapter и вызывается метод от этого объекта
     * @param str строка с математическим выражением
     * @return результат вычисления в виде double
     */
    public static double calculate(String str) {
        CalculatorStringAdapter calc = new CalculatorStringAdapter();
        return calc.calculateString(str);
    }
}

