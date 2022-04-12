package home_work_3.runners;

import home_work_3.calcs.simple.CalculatorWithOperator;

/**
 * класс с точкой входа для класса CalculatorWithOperator (задание 2.5)
 */
public class CalculatorWithOperatorMain {
    public static void main(String[] args) {
        CalculatorWithOperator calc1 = new CalculatorWithOperator();

        double resultOperator  = calc1.addNumbers((calc1.addNumbers(4.1, calc1.multiplyNumbers(15, 7))),
                (calc1.exponentiateNumbers(calc1.getModulusOfNumber(calc1.divideNumbers(28d, 5d)),2)));
        System.out.println("4.1 + 15 * 7 + (28 / 5) ^ 2 = " +resultOperator);
    }
}
