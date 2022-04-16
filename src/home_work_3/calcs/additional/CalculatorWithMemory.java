package home_work_3.calcs.additional;

import home_work_3.calcs.api.ICalculator;

/**
 * класс с дополнительной функцией памяти (задание 10)
 */
public class CalculatorWithMemory {
    private ICalculator calc;
    private double lastOperationResult;
    private double result;

    public CalculatorWithMemory(ICalculator calc) {
        this.calc = calc;
    }

    /**
     * возвращает результат последнего вычисления, записанный в памяти калькулятора
     * затем память очищается
     * @return результат последнего вычисления в виде double
     */
    public double getLastOperationResult() {
        double temp = this.lastOperationResult;
        this.lastOperationResult = 0;
        return temp;
    }

    /**
     * записывает результат последнего выполненного вычисления в память калькулятора
     */
    public void setLastOperationResult() {
        this.lastOperationResult = this.result;

    }

    /**
     * выполняет сложение чисел
     * @param a первое слагаемое типа double
     * @param b второе слагаемое типа double
     * @return сумму двух чисел в виде double
     */
    public double add(double a, double b) {
        this.result = calc.add(a, b);
        return result;
    }

    /**
     * выполняет вычитание чисел
     * @param a уменьшаемое типа double
     * @param b вычитаемое типа double
     * @return разность двух чисел в виде double
     */
    public double subtract(double a, double b) {
        this.result = calc.subtract(a, b);
        return result;
    }

    /**
     * выполняет умножение чисел
     * @param a первый множитель типа double
     * @param b второй множитель типа double
     * @return произведение двух чисел в виде double
     */
    public double multiply(double a, double b) {
        this.result = calc.multiply(a, b);
        return result;
    }

    /**
     * выполняет деление чисел
     * @param a делимое типа double
     * @param b делитель типа double
     * @return результат деления в виде double
     */
    public double divide(double a, double b) {
        this.result = calc.divide(a, b);
        return result;
    }

    /**
     * выполняет возведение числа в степень
     * @param a число типа double, которое нужно возвести в степень
     * @param b степень типа int, в которую нужно возвести число
     * @return результат возведения в степень в виде double
     */
    public double pow(double a, int b) {
        this.result = calc.pow(a, b);
        return result;
    }

    /**
     * получает модуль числа
     * @param x число типа double, модуль которого необходимо  получить
     * @return модуль числа в виде double
     */
    public double abs(double x) {
        this.result = calc.abs(x);
        return result;
    }

    /**
     * выполняет извлечение квадратного корня из числа
     * @param x число типа double, из которого нужно извлечь квадратный корень
     * @return результат извлечения квадратного корня в виде double
     */
    public double sqrt(double x) {
        this.result = calc.sqrt(x);
        return result;

    }
}
