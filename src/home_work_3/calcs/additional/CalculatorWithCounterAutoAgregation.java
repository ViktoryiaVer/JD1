package home_work_3.calcs.additional;

import home_work_3.calcs.simple.CalculatorWithMathCopy;
import home_work_3.calcs.simple.CalculatorWithMathExtends;
import home_work_3.calcs.simple.CalculatorWithOperator;

/**
 * класс с учетом количества использований калькулятора и использующий агрегацию, задание 7
 */
public class CalculatorWithCounterAutoAgregation {
    private CalculatorWithOperator calc1;
    private CalculatorWithMathCopy calc2;
    private CalculatorWithMathExtends calc3;
    private long countOperation;

    public CalculatorWithCounterAutoAgregation(CalculatorWithOperator calc) {
        this.calc1 = calc;
    }
    public CalculatorWithCounterAutoAgregation(CalculatorWithMathCopy calc) {
        this.calc2 = calc;
    }
    public CalculatorWithCounterAutoAgregation(CalculatorWithMathExtends calc) {
        this.calc3 = calc;
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
        if(calc1 != null) {
            return calc1.addNumbers(firstNumber, secondNumber);
        } else if(calc2 != null) {
            return calc2.addNumbers(firstNumber, secondNumber);
        } else  {
            return calc3.addNumbers(firstNumber, secondNumber);
        }
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
        if(calc1 != null) {
            return calc1.subtractNumbers(firstNumber, secondNumber);
        } else if(calc2 != null) {
            return calc2.subtractNumbers(firstNumber, secondNumber);
        } else  {
            return calc3.subtractNumbers(firstNumber, secondNumber);
        }
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
        if(calc1 != null) {
            return calc1.multiplyNumbers(firstNumber, secondNumber);
        } else if(calc2 != null) {
            return calc2.multiplyNumbers(firstNumber, secondNumber);
        } else  {
            return calc3.multiplyNumbers(firstNumber, secondNumber);
        }
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
        if(calc1 != null) {
            return calc1.divideNumbers(firstNumber, secondNumber);
        } else if(calc2 != null) {
            return calc2.divideNumbers(firstNumber, secondNumber);
        } else  {
            return calc3.divideNumbers(firstNumber, secondNumber);
        }
    }

    /**
     * выполняет возведение числа в степень,
     * при вызове данного метода вызывается метод учета количества использований калькулятора
     * @param firstNumber число типа double, которое нужно возвести в степень
     * @param secondNumber степень типа int, в которую нужно возвести число
     * @return результат возведения в степень в виде double
     */
    public double exponentiateNumbers(double firstNumber, int secondNumber) {
        incrementCountOperation();
        if (calc1 != null) {
            return calc1.exponentiateNumbers(firstNumber, secondNumber);
        } else if (calc2 != null) {
            return calc2.exponentiateNumbers(firstNumber, secondNumber);
        } else {
            return calc3.exponentiateNumbers(firstNumber, secondNumber);
        }
    }

    /**
     * получает модуль числа,
     * при вызове данного метода вызывается метод учета количества использований калькулятора
     * @param number число типа double, модуль которого необходимо  получить
     * @return модуль числа в виде double
     */
    public double getModulusOfNumber(double number) {
        incrementCountOperation();
        if (calc1 != null) {
            return calc1.getModulusOfNumber(number);
        } else if (calc2 != null) {
            return calc2.getModulusOfNumber(number);
        } else {
            return calc3.getModulusOfNumber(number);
        }
    }

    /**
     * выполняет извлечение квадратного корня из числа,
     * при вызове данного метода вызывается метод учета количества использований калькулятора
     * @param x число типа double, из которого нужно извлечь квадратный корень
     * @return результат извлечения квадратного корня в виде double
     */
    public double calculateSqrt(double x) {
        incrementCountOperation();
        if (calc1 != null) {
            return calc1.calculateSqrt(x);
        } else if (calc2 != null) {
            return calc2.calculateSqrt(x);
        } else {
            return calc3.calculateSqrt(x);
        }
    }

}
