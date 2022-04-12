package home_work_3.runners;

import home_work_3.calcs.simple.CalculatorWithMathCopy;

/**
 * класс с точкой входа для класса CalculatorWithMathCopy (задание 3.3)
 */

public class CalculatorWithMathCopyMain {
    public static void main(String[] args) {
        CalculatorWithMathCopy calc2 = new CalculatorWithMathCopy();

        double resultMath  = calc2.addNumbers((calc2.addNumbers(4.1, calc2.multiplyNumbers(15d, 7d))),
                (calc2.exponentiateNumbers(calc2.getModulusOfNumber(calc2.divideNumbers(28d, 5d)),2)));
        System.out.println("4.1 + 15 * 7 + (28 / 5) ^ 2 = " + resultMath);
    }
}
