package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterAutoAgregationInterface;
import home_work_3.calcs.simple.CalculatorWithMathCopy;

/**
 * класс с точкой входа для класса CalculatorWithCounterAutoAgregationInterface
 */
public class CalculatorWithCounterAutoCompositeInterfaceMain {
        public static void main(String[] args) {
            CalculatorWithMathCopy calc9 = new CalculatorWithMathCopy();
            CalculatorWithCounterAutoAgregationInterface calc10 = new CalculatorWithCounterAutoAgregationInterface(calc9);

            double resultDelegate3 = calc10.addNumbers((calc10.addNumbers(4.1, calc10.multiplyNumbers(15d, 7d))),
                    (calc10.exponentiateNumbers(calc10.getModulusOfNumber(calc10.divideNumbers(28d, 5d)), 2)));
            System.out.println("4.1 + 15 * 7 + (28 / 5) ^ 2 = "+ resultDelegate3);
            System.out.println("Количество использований калькулятора = " + calc10.getCountOperation());

        }
}
