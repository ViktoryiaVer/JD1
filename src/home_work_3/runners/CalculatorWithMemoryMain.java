package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithMemory;
import home_work_3.calcs.simple.CalculatorWithMathCopy;

/**
 * класс с точкой входа для класса CalculatorWithMemory
 */
public class CalculatorWithMemoryMain {
    public static void main(String[] args) {
        CalculatorWithMathCopy calc11 = new CalculatorWithMathCopy();
        CalculatorWithMemory calc12 = new CalculatorWithMemory(calc11);

        calc12.addNumbers((calc12.addNumbers(4.1, calc12.multiplyNumbers(15d, 7d))),
                (calc12.exponentiateNumbers(calc12.getModulusOfNumber(calc12.divideNumbers(28d, 5d)), 2)));
        System.out.println(calc12.getLastOperationResult());

    }
}
