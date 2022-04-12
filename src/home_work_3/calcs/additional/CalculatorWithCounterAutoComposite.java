package home_work_3.calcs.additional;

import home_work_3.calcs.simple.CalculatorWithMathCopy;

/**
 * класс с учетом количества использований калькулятора и использующий композицию, задание 7
 */
public class CalculatorWithCounterAutoComposite {
    private CalculatorWithMathCopy calc;
    private long countOperation;

    public CalculatorWithCounterAutoComposite() {
        this.calc = new CalculatorWithMathCopy();
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
    public double addNumbers(double firstNumber, double secondNumber) {
        incrementCountOperation();
        return calc.addNumbers(firstNumber, secondNumber);
    }

    /**
     * выполняет вычитание чисел,
     * при вызове данного метода вызывается метод учета количества использований калькулятора
     * @param firstNumber уменьшаемое типа double
     * @param secondNumber вычитаемое типа double
     * @return разность двух чисел в виде double
     */
    public double subtractNumbers(double firstNumber, double secondNumber) {
        incrementCountOperation();
        return calc.subtractNumbers(firstNumber, secondNumber);
    }

    /**
     * выполняет умножение чисел,
     * при вызове данного метода вызывается метод учета количества использований калькулятора
     * @param firstNumber первый множитель типа double
     * @param secondNumber второй множитель типа double
     * @return произведение двух чисел в виде double
     */
    public double multiplyNumbers(double firstNumber, double secondNumber) {
        incrementCountOperation();
        return calc.multiplyNumbers(firstNumber, secondNumber);
    }

    /**
     * выполняет деление чисел,
     * при вызове данного метода вызывается метод учета количества использований калькулятора
     * @param firstNumber делимое типа double
     * @param secondNumber делитель типа double
     * @return результат деления в виде double
     */
    public double divideNumbers(double firstNumber, double secondNumber) {
        incrementCountOperation();
        return calc.divideNumbers(firstNumber, secondNumber);
    }

    /**
     * выполняет возведение числа в степень,
     * использует библиотеку класса Math,
     * при вызове данного метода вызывается метод учета количества использований калькулятора
     * @param firstNumber число типа double, которое нужно возвести в степень
     * @param secondNumber степень типа int, в которую нужно возвести число
     * @return результат возведения в степень в виде double
     */
    public double exponentiateNumbers(double firstNumber, int secondNumber) {
        incrementCountOperation();
        return calc.exponentiateNumbers(firstNumber, secondNumber);
    }

    /**
     * получает модуль числа,
     * использует библиотеку класса Math,
     * при вызове данного метода вызывается метод учета количества использований калькулятора
     * @param number число типа double, модуль которого необходимо  получить
     * @return модуль числа в виде double
     */
    public double getModulusOfNumber(double number) {
        incrementCountOperation();
        return calc.getModulusOfNumber(number);
    }

    /**
     * выполняет извлечение квадратного корня из числа,
     * использует библиотеку класса Math,
     * при вызове данного метода вызывается метод учета количества использований калькулятора
     * @param x число типа double, из которого нужно извлечь квадратный корень
     * @return результат извлечения квадратного корня в виде double
     */
    public double calculateSqrt(double x) {
        incrementCountOperation();
        return calc.calculateSqrt(x);
    }

}
