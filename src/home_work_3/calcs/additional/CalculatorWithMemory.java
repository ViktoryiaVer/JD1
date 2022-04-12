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
        this.lastOperationResult = this.result;
        double temp = this.lastOperationResult;
        this.lastOperationResult = 0;
        this.result = 0;
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
     * @param firstNumber первое слагаемое типа double
     * @param secondNumber второе слагаемое типа double
     * @return сумму двух чисел в виде double
     */
    public double addNumbers(double firstNumber, double secondNumber) {
        this.result = calc.addNumbers(firstNumber, secondNumber);
        return result;
    }

    /**
     * выполняет вычитание чисел
     * @param firstNumber уменьшаемое типа double
     * @param secondNumber вычитаемое типа double
     * @return разность двух чисел в виде double
     */
    public double subtractNumbers(double firstNumber, double secondNumber) {
        this.result = calc.subtractNumbers(firstNumber, secondNumber);
        return result;
    }

    /**
     * выполняет умножение чисел
     * @param firstNumber первый множитель типа double
     * @param secondNumber второй множитель типа double
     * @return произведение двух чисел в виде double
     */
    public double multiplyNumbers(double firstNumber, double secondNumber) {
        this.result = calc.multiplyNumbers(firstNumber, secondNumber);
        return result;
    }

    /**
     * выполняет деление чисел
     * @param firstNumber делимое типа double
     * @param secondNumber делитель типа double
     * @return результат деления в виде double
     */
    public double divideNumbers(double firstNumber, double secondNumber) {
        this.result = calc.divideNumbers(firstNumber, secondNumber);
        return result;
    }

    /**
     * выполняет возведение числа в степень
     * @param firstNumber число типа double, которое нужно возвести в степень
     * @param secondNumber степень типа int, в которую нужно возвести число
     * @return результат возведения в степень в виде double
     */
    public double exponentiateNumbers(double firstNumber, int secondNumber) {
        this.result = calc.exponentiateNumbers(firstNumber, secondNumber);
        return result;
    }

    /**
     * получает модуль числа
     * @param number число типа double, модуль которого необходимо  получить
     * @return модуль числа в виде double
     */
    public double getModulusOfNumber(double number) {
        this.result = calc.getModulusOfNumber(number);
        return result;
    }

    /**
     * выполняет извлечение квадратного корня из числа
     * @param x число типа double, из которого нужно извлечь квадратный корень
     * @return результат извлечения квадратного корня в виде double
     */
    public double calculateSqrt(double x) {
        this.result = calc.calculateSqrt(x);
        return result;

    }
}
