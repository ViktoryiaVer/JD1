package home_work_3.calcs.simple;

import home_work_3.calcs.api.ICalculator;

/**
 * в классе находятся математические методы для вычисления с использованием библиотеки Math (задание 3.2)
 */

public class CalculatorWithMathCopy implements ICalculator {

    /**
     * выполняет сложение чисел
     * @param firstNumber первое слагаемое типа double
     * @param secondNumber второе слагаемое типа double
     * @return сумму двух чисел в виде double
     */
    public double addNumbers(double firstNumber, double secondNumber) {
        return firstNumber + secondNumber;
    }

    /**
     * выполняет вычитание чисел
     * @param firstNumber уменьшаемое типа double
     * @param secondNumber вычитаемое типа double
     * @return разность двух чисел в виде double
     */
    public double subtractNumbers(double firstNumber, double secondNumber) {
        return firstNumber - secondNumber;
    }

    /**
     * выполняет умножение чисел
     * @param firstNumber первый множитель типа double
     * @param secondNumber второй множитель типа double
     * @return произведение двух чисел в виде double
     */
    public double multiplyNumbers(double firstNumber, double secondNumber) {
        return firstNumber * secondNumber;
    }

    /**
     * выполняет деление чисел
     * @param firstNumber делимое типа double
     * @param secondNumber делитель типа double
     * @return результат деления в виде double
     */
    public double divideNumbers(double firstNumber, double secondNumber) {
        return firstNumber / secondNumber;
    }

    /**
     * выполняет возведение числа в степень,
     * использует библиотеку класса Math
     * @param firstNumber число типа double, которое нужно возвести в степень
     * @param secondNumber степень типа int, в которую нужно возвести число
     * @return результат возведения в степень в виде double
     */
    public double exponentiateNumbers(double firstNumber, int secondNumber) {
        double powResult = Math.pow(firstNumber,secondNumber);
        return powResult;
    }

    /**
     * получает модуль числа,
     * использует библиотеку класса Math
     * @param number число типа double, модуль которого необходимо  получить
     * @return модуль числа в виде double
     */
    public double getModulusOfNumber(double number) {
        double modulus = Math.abs(number);
        return modulus;
    }

    /**
     * выполняет извлечение квадратного корня из числа,
     * использует библиотеку класса Math
     * @param x число типа double, из которого нужно извлечь квадратный корень
     * @return результат извлечения квадратного корня в виде double
     */
    public double calculateSqrt(double x) {
        double sqrtResult = Math.sqrt(x);
        return sqrtResult;
    }
}
