package home_work_3.calcs.simple;

import home_work_3.calcs.api.ICalculator;

import static java.lang.Double.NaN;

/**
 * в классе находятся математические методы для вычисления без использования библиотеки Math
 */
public class CalculatorWithOperator implements ICalculator {

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
     * не использует библиотеку класса Math
     * @param firstNumber число типа double, которое нужно возвести в степень
     * @param secondNumber степень типа int, в которую нужно возвести число
     * @return результат возведения в степень в виде double
     */
    public double exponentiateNumbers(double firstNumber, int secondNumber) {
        double powResult = 1;
        for(int i = 1; i <= secondNumber; i++) {
            powResult *= firstNumber;
        }
        return powResult;
    }

    /**
     * получает модуль числа,
     * не использует библиотеку класса Math
     * @param number число типа double, модуль которого необходимо  получить
     * @return модуль числа в виде double
     */
    public double getModulusOfNumber(double number) {
        double modulus = number > 0d ? number : - number;
        return modulus;
    }

    /**
     * выполняет извлечение квадратного корня из числа,
     * не использует библиотеку класса Math
     * @param x число типа double, из которого нужно извлечь квадратный корень
     * @return результат извлечения квадратного корня в виде double
     */
    public double calculateSqrt(double x) {
        if(x<0) {
            return NaN;
        }
        if(x < 2){
            return x;
        }
        double x0 = x;
        double x1 = (x0 + x/x0)/2;
        while(x0 != x1){
            x0 = x1;
            x1 = (x0 + x/x0)/2;
        }
        return x0;
    }

}
