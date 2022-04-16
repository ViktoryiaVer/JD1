package home_work_3.calcs.simple;

import home_work_3.calcs.api.ICalculator;

/**
 * класс, наследующий CalculatorWithOperators (задания 4.2-4.3)
 */

public class CalculatorWithMathExtends extends CalculatorWithOperator implements ICalculator {
    @Override
    /**
     * выполняет возведение числа в степень,
     * использует библиотеку класса Math
     * @param firstNumber число типа double, которое нужно возвести в степень
     * @param secondNumber степень типа int, в которую нужно возвести число
     * @return результат возведения в степень в виде double
     */
    public double exponentiateNumbers(double firstNumber, int secondNumber) {
        return Math.pow(firstNumber,secondNumber);
    }

    @Override
    /**
     * получает модуль числа,
     * использует библиотеку класса Math
     * @param number число типа double, модуль которого необходимо  получить
     * @return модуль числа в виде double
     */
    public double getModulusOfNumber(double number) {
        return Math.abs(number);
    }

    @Override
    /**
     * выполняет извлечение квадратного корня из числа,
     * использует библиотеку класса Math
     * @param x число типа double, из которого нужно извлечь квадратный корень
     * @return результат извлечения квадратного корня в виде double
     */
    public double calculateSqrt(double x) {
        return Math.sqrt(x);
    }
}
