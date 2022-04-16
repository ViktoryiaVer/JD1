package home_work_3.calcs.additional;

import home_work_3.calcs.simple.CalculatorWithMathExtends;

/**
 * класс с учетом количества использований калькулятора (учет выполняется автоматически при вызове методом калькулятора), задание 6
 */
public class CalculatorWithCounterAutoSuper extends CalculatorWithMathExtends {
    private long countOperation;


    /**
     * увеличивает значение счетчика использований оператора на 1
     */
    private void incrementCountOperation() {
        countOperation++;
    }

    /**
     * возвращает количество использований калькулятора в виде long (геттер для поля countOperation)
     * @return количество использований калькулятора в виде long
     */
    public long getCountOperation() {
        return countOperation;
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
        return super.add(a, b);
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
        return super.subtract(a, b);
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
        return super.multiply(a, b);
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
        return super.divide(a, b);
    }

    /**
     * выполняет возведение числа в степень,
     * использует библиотеку класса Math,
     * при вызове данного метода вызывается метод учета количества использований калькулятора
     * @param a число типа double, которое нужно возвести в степень
     * @param b степень типа int, в которую нужно возвести число
     * @return результат возведения в степень в виде double
     */
    @Override
    public double pow(double a, int b) {
        incrementCountOperation();
        return super.pow(a, b);
    }

    /**
     * получает модуль числа,
     * использует библиотеку класса Math,
     * при вызове данного метода вызывается метод учета количества использований калькулятора
     * @param x число типа double, модуль которого необходимо  получить
     * @return модуль числа в виде double
     */
    @Override
    public double abs(double x) {
        incrementCountOperation();
        return super.abs(x);
    }

    /**
     * выполняет извлечение квадратного корня из числа,
     * использует библиотеку класса Math,
     * при вызове данного метода вызывается метод учета количества использований калькулятора
     * @param x число типа double, из которого нужно извлечь квадратный корень
     * @return результат извлечения квадратного корня в виде double
     */
    @Override
    public double sqrt(double x) {
        incrementCountOperation();
        return super.sqrt(x);
    }
}
