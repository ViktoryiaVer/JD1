package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithMemory;
import home_work_3.calcs.simple.CalculatorWithMathCopy;

/**
 * класс с точкой входа для класса CalculatorWithMemory
 */
public class CalculatorWithMemoryMain {
    public static void main(String[] args) {
        CalculatorWithMemory calc = new CalculatorWithMemory(new CalculatorWithMathCopy());

        calc.divide(28,5);
        calc.setLastOperationResult();

        calc.pow(calc.getLastOperationResult(), 2);
        calc.setLastOperationResult();

        calc.add(calc.multiply(15,7),calc.getLastOperationResult());
        calc.setLastOperationResult();

        calc.add(4.1, calc.getLastOperationResult());
        calc.setLastOperationResult();

        System.out.println("4.1 + 15 * 7 + (28 / 5) ^ 2 = " + calc.getLastOperationResult());
    }
}
