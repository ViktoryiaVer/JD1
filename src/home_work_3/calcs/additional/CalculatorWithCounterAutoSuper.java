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
    public void incrementCountOperation() {
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
        return super.addNumbers(firstNumber, secondNumber);
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
        return super.subtractNumbers(firstNumber, secondNumber);
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
        return super.multiplyNumbers(firstNumber, secondNumber);
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
        return super.divideNumbers(firstNumber, secondNumber);
    }

    /**
     * выполняет возведение числа в степень,
     * использует библиотеку класса Math,
     * при вызове данного метода вызывается метод учета количества использований калькулятора
     * @param firstNumber число типа double, которое нужно возвести в степень
     * @param secondNumber степень типа int, в которую нужно возвести число
     * @return результат возведения в степень в виде double
     */
    @Override
    public double exponentiateNumbers(double firstNumber, int secondNumber) {
        incrementCountOperation();
        return super.exponentiateNumbers(firstNumber, secondNumber);
    }

    /**
     * получает модуль числа,
     * использует библиотеку класса Math,
     * при вызове данного метода вызывается метод учета количества использований калькулятора
     * @param number число типа double, модуль которого необходимо  получить
     * @return модуль числа в виде double
     */
    @Override
    public double getModulusOfNumber(double number) {
        incrementCountOperation();
        return super.getModulusOfNumber(number);
    }

    /**
     * выполняет извлечение квадратного корня из числа,
     * использует библиотеку класса Math,
     * при вызове данного метода вызывается метод учета количества использований калькулятора
     * @param x число типа double, из которого нужно извлечь квадратный корень
     * @return результат извлечения квадратного корня в виде double
     */
    @Override
    public double calculateSqrt(double x) {
        incrementCountOperation();
        return super.calculateSqrt(x);
    }
}
