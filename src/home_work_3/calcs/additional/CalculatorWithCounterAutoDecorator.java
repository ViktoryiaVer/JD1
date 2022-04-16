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
    private void incrementCountOperation() {
        countOperation++;
    }

    /**
     * выполняет сложение чисел,
     * при вызове данного метода вызывается метод учета количества использований калькулятора
     * @param a первое слагаемое типа double
     * @param b второе слагаемое типа double
     * @return сумму двух чисел в виде double
     */
    @Override
    public double add(double a, double b) {
        incrementCountOperation();
        return calculator.add(a,b);
    }

    /**
     * выполняет вычитание чисел,
     * при вызове данного метода вызывается метод учета количества использований калькулятора
     * @param a уменьшаемое типа double
     * @param b вычитаемое типа double
     * @return разность двух чисел в виде double
     */
    @Override
    public double subtract(double a, double b) {
        incrementCountOperation();
        return calculator.subtract(a, b);
    }

    /**
     * выполняет умножение чисел,
     * при вызове данного метода вызывается метод учета количества использований калькулятора
     * @param a первый множитель типа double
     * @param b второй множитель типа double
     * @return произведение двух чисел в виде double
     */
    @Override
    public double multiply(double a, double b) {
        incrementCountOperation();
        return calculator.multiply(a, b);
    }

    /**
     * выполняет деление чисел,
     * при вызове данного метода вызывается метод учета количества использований калькулятора
     * @param a делимое типа double
     * @param b делитель типа double
     * @return результат деления в виде double
     */
    @Override
    public double divide(double a, double b) {
        incrementCountOperation();
        return calculator.divide(a, b);
    }

    /**
     * выполняет возведение числа в степень,
     * при вызове данного метода вызывается метод учета количества использований калькулятора
     * @param a число типа double, которое нужно возвести в степень
     * @param b степень типа int, в которую нужно возвести число
     * @return результат возведения в степень в виде double
     */
    @Override
    public double pow(double a, int b) {
        incrementCountOperation();
        return calculator.pow(a, b);
    }

    /**
     * получает модуль числа,
     * при вызове данного метода вызывается метод учета количества использований калькулятора
     * @param x число типа double, модуль которого необходимо  получить
     * @return модуль числа в виде double
     */
    @Override
    public double abs(double x) {
        incrementCountOperation();
        return calculator.abs(x);
    }

    /**
     * выполняет извлечение квадратного корня из числа,
     * при вызове данного метода вызывается метод учета количества использований калькулятора
     * @param x число типа double, из которого нужно извлечь квадратный корень
     * @return результат извлечения квадратного корня в виде double
     */
    @Override
    public double sqrt(double x) {
        incrementCountOperation();
        return calculator.sqrt(x);
    }

}
