package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterClassic;

/**
 * класс с точкой входа для класса CalculatorWithCounterClassic (задание 5.5)
 */

public class CalculatorWithCounterClassicMain {
    public static void main(String[] args) {
        CalculatorWithCounterClassic calc4 = new CalculatorWithCounterClassic();

        double resultMathExtend  = calc4.addNumbers((calc4.addNumbers(4.1, calc4.multiplyNumbers(15d, 7d))),
                (calc4.exponentiateNumbers(calc4.getModulusOfNumber(calc4.divideNumbers(28d, 5d)),2)));
        calc4.incrementCountOperation();
        calc4.incrementCountOperation();
        calc4.incrementCountOperation();
        calc4.incrementCountOperation();
        calc4.incrementCountOperation();
        calc4.incrementCountOperation();
        System.out.println("4.1 + 15 * 7 + (28 / 5) ^ 2 = " + resultMathExtend);
        System.out.println("Количество использований калькулятора = " + calc4.getCountOperation());
    }
}
