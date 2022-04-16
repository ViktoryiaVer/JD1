package home_work_3.calcs.simple;

import home_work_3.calcs.api.ICalculator;

import static java.lang.Double.NaN;

/**
 * в классе находятся математические методы для вычисления без использования библиотеки Math
 */
public class CalculatorWithOperator implements ICalculator {

    /**
     * выполняет сложение чисел
     * @param a первое слагаемое типа double
     * @param b второе слагаемое типа double
     * @return сумму двух чисел в виде double
     */
    public double add(double a, double b) {
        return a + b;
    }

    /**
     * выполняет вычитание чисел
     * @param a уменьшаемое типа double
     * @param b вычитаемое типа double
     * @return разность двух чисел в виде double
     */
    public double subtract(double a, double b) {
        return a - b;
    }

    /**
     * выполняет умножение чисел
     * @param a первый множитель типа double
     * @param b второй множитель типа double
     * @return произведение двух чисел в виде double
     */
    public double multiply(double a, double b) {
        return a * b;
    }

    /**
     * выполняет деление чисел
     * @param a делимое типа double
     * @param b делитель типа double
     * @return результат деления в виде double
     */
    public double divide(double a, double b) {
        return a / b;
    }

    /**
     * выполняет возведение числа в степень,
     * не использует библиотеку класса Math
     * @param a число типа double, которое нужно возвести в степень
     * @param b степень типа int, в которую нужно возвести число
     * @return результат возведения в степень в виде double
     */
    public double pow(double a, int b) {
        double powResult = 1;
        for(int i = 1; i <= b; i++) {
            powResult *= a;
        }
        return powResult;
    }

    /**
     * получает модуль числа,
     * не использует библиотеку класса Math
     * @param x число типа double, модуль которого необходимо  получить
     * @return модуль числа в виде double
     */
    public double abs(double x) {
        return x > 0d ? x: -x;
    }

    /**
     * выполняет извлечение квадратного корня из числа,
     * не использует библиотеку класса Math
     * @param x число типа double, из которого нужно извлечь квадратный корень
     * @return результат извлечения квадратного корня в виде double
     */
    public double sqrt(double x) {
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
