package home_work_3.calcs.additional;

import home_work_3.calcs.api.ICalculator;

/**
 * класс с учетом количества использований калькулятора и использованием паттерна "Декоратор" (задание 11)
 */

public class CalculatorWithCounterAutoDecorator implements ICalculator {
    private ICalculator calculator;
    private long countOperation;

    public CalculatorWithCounterAutoDecorator(ICalculator calculator) {
        this.calculator = calculator;
    }

    /**
     * возвращает вложенный в поле calculator калькулятор
     * @return вложенный калькулятор типа ICalculator
     */
    public ICalculator getCalculator() {
        return calculator;
    }

    /**
     * возвращает количество использований калькулятора в виде long (геттер для поля countOperation)
     * @return количество использований калькулятора в виде long
     */
    public long getCountOperation() {
        return countOperation;
    }

    /**
     * увеличивает значение счетчика использований оператора на 1
     */
    public void incrementCountOperation() {
        countOperation++;
    }

    /**
     * устанавливает количество использований калькулятора в виде long (сеттер для поля countOperation)
     * @param countOperation число типа long, которое необходимо установить как количество использований
     */
    public void setCountOperation(long countOperation) {
        this.countOperation = countOperation;
    }

    /**
     * выполняет сложение чисел,
     * при вызове данного метода вызывается метод учета количества использований калькулятора
     * @param firstNumber первое слагаемое типа double
     * @param secondNumber второе слагаемое типа double
     * @return сумму двух чисел в виде double
     */
    @Override
    public double addNumbers(double firstNumber, double secondNumber) {
        incrementCountOperation();
        return calculator.addNumbers(firstNumber,secondNumber);
    }

    /**
     * выполняет вычитание чисел,
     * при вызове данного метода вызывается метод учета количества использований калькулятора
     * @param firstNumber уменьшаемое типа double
     * @param secondNumber вычитаемое типа double
     * @return разность двух чисел в виде double
     */
    @Override
    public double subtractNumbers(double firstNumber, double secondNumber) {
        incrementCountOperation();
        return calculator.subtractNumbers(firstNumber, secondNumber);
    }

    /**
     * выполняет умножение чисел,
     * при вызове данного метода вызывается метод учета количества использований калькулятора
     * @param firstNumber первый множитель типа double
     * @param secondNumber второй множитель типа double
     * @return произведение двух чисел в виде double
     */
    @Override
    public double multiplyNumbers(double firstNumber, double secondNumber) {
        incrementCountOperation();
        return calculator.multiplyNumbers(firstNumber, secondNumber);
    }

    /**
     * выполняет деление чисел,
     * при вызове данного метода вызывается метод учета количества использований калькулятора
     * @param firstNumber делимое типа double
     * @param secondNumber делитель типа double
     * @return результат деления в виде double
     */
    @Override
    public double divideNumbers(double firstNumber, double secondNumber) {
        incrementCountOperation();
        return calculator.divideNumbers(firstNumber, secondNumber);
    }

    /**
     * выполняет возведение числа в степень,
     * при вызове данного метода вызывается метод учета количества использований калькулятора
     * @param firstNumber число типа double, которое нужно возвести в степень
     * @param secondNumber степень типа int, в которую нужно возвести число
     * @return результат возведения в степень в виде double
     */
    @Override
    public double exponentiateNumbers(double firstNumber, int secondNumber) {
        incrementCountOperation();
        return calculator.exponentiateNumbers(firstNumber, secondNumber);
    }

    /**
     * получает модуль числа,
     * при вызове данного метода вызывается метод учета количества использований калькулятора
     * @param number число типа double, модуль которого необходимо  получить
     * @return модуль числа в виде double
     */
    @Override
    public double getModulusOfNumber(double number) {
        incrementCountOperation();
        return calculator.getModulusOfNumber(number);
    }

    /**
     * выполняет извлечение квадратного корня из числа,
     * при вызове данного метода вызывается метод учета количества использований калькулятора
     * @param x число типа double, из которого нужно извлечь квадратный корень
     * @return результат извлечения квадратного корня в виде double
     */
    @Override
    public double calculateSqrt(double x) {
        incrementCountOperation();
        return calculator.calculateSqrt(x);
    }

}
