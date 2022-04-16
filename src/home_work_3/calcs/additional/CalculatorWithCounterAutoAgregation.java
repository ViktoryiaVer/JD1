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
    public double add(double a, double b) {
        incrementCountOperation();
        if(calc1 != null) {
            return calc1.add(a, b);
        } else if(calc2 != null) {
            return calc2.add(a, b);
        } else  {
            return calc3.add(a, b);
        }
    }

    /**
     * выполняет вычитание чисел,
     * при вызове данного метода вызывается метод учета количества использований калькулятора
     * @param a уменьшаемое типа double
     * @param b вычитаемое типа double
     * @return разность двух чисел в виде double
     */
    public double subtract(double a, double b) {
        incrementCountOperation();
        if(calc1 != null) {
            return calc1.subtract(a, b);
        } else if(calc2 != null) {
            return calc2.subtract(a, b);
        } else  {
            return calc3.subtract(a, b);
        }
    }

    /**
     * выполняет умножение чисел,
     * при вызове данного метода вызывается метод учета количества использований калькулятора
     * @param a первый множитель типа double
     * @param b второй множитель типа double
     * @return произведение двух чисел в виде double
     */
    public double multiply(double a, double b) {
        incrementCountOperation();
        if(calc1 != null) {
            return calc1.multiply(a, b);
        } else if(calc2 != null) {
            return calc2.multiply(a, b);
        } else  {
            return calc3.multiply(a, b);
        }
    }

    /**
     * выполняет деление чисел,
     * при вызове данного метода вызывается метод учета количества использований калькулятора
     * @param a делимое типа double
     * @param b делитель типа double
     * @return результат деления в виде double
     */
    public double divide(double a, double b) {
        incrementCountOperation();
        if(calc1 != null) {
            return calc1.divide(a, b);
        } else if(calc2 != null) {
            return calc2.divide(a, b);
        } else  {
            return calc3.divide(a, b);
        }
    }

    /**
     * выполняет возведение числа в степень,
     * при вызове данного метода вызывается метод учета количества использований калькулятора
     * @param a число типа double, которое нужно возвести в степень
     * @param b степень типа int, в которую нужно возвести число
     * @return результат возведения в степень в виде double
     */
    public double pow(double a, int b) {
        incrementCountOperation();
        if (calc1 != null) {
            return calc1.pow(a, b);
        } else if (calc2 != null) {
            return calc2.pow(a, b);
        } else {
            return calc3.pow(a, b);
        }
    }

    /**
     * получает модуль числа,
     * при вызове данного метода вызывается метод учета количества использований калькулятора
     * @param x число типа double, модуль которого необходимо  получить
     * @return модуль числа в виде double
     */
    public double abs(double x) {
        incrementCountOperation();
        if (calc1 != null) {
            return calc1.abs(x);
        } else if (calc2 != null) {
            return calc2.abs(x);
        } else {
            return calc3.abs(x);
        }
    }

    /**
     * выполняет извлечение квадратного корня из числа,
     * при вызове данного метода вызывается метод учета количества использований калькулятора
     * @param x число типа double, из которого нужно извлечь квадратный корень
     * @return результат извлечения квадратного корня в виде double
     */
    public double sqrt(double x) {
        incrementCountOperation();
        if (calc1 != null) {
            return calc1.sqrt(x);
        } else if (calc2 != null) {
            return calc2.sqrt(x);
        } else {
            return calc3.sqrt(x);
        }
    }

}
