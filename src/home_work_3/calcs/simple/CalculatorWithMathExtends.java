package home_work_3.calcs.simple;

import home_work_3.calcs.api.ICalculator;

/**
 * класс, наследующий CalculatorWithOperator (задания 4.2-4.3)
 */

public class CalculatorWithMathExtends extends CalculatorWithOperator implements ICalculator {
    @Override
    /*
      выполняет возведение числа в степень,
      использует библиотеку класса Math
      @param a число типа double, которое нужно возвести в степень
     * @param b степень типа int, в которую нужно возвести число
     * @return результат возведения в степень в виде double
     */
    public double pow(double a, int b) {
        return Math.pow(a,b);
    }

    @Override
    /*
     * получает модуль числа,
     * использует библиотеку класса Math
     * @param b число типа double, модуль которого необходимо  получить
     * @return модуль числа в виде double
     */
    public double abs(double b) {
        return Math.abs(b);
    }

    @Override
    /*
     * выполняет извлечение квадратного корня из числа,
     * использует библиотеку класса Math
     * @param x число типа double, из которого нужно извлечь квадратный корень
     * @return результат извлечения квадратного корня в виде double
     */
    public double sqrt(double x) {
        return Math.sqrt(x);
    }
}
