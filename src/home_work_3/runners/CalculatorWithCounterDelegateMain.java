package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterAutoAgregation;
import home_work_3.calcs.additional.CalculatorWithCounterAutoComposite;
import home_work_3.calcs.simple.CalculatorWithMathExtends;


/**
 * класс с точкой входа для классов CalculatorWithCounterAutoComposite и CalculatorWithCounterAutoAgregation
 */
public class CalculatorWithCounterDelegateMain {
    public static void main(String[] args) {
        CalculatorWithCounterAutoComposite calc6 = new CalculatorWithCounterAutoComposite();

        double resultDelegate1 = calc6.addNumbers((calc6.addNumbers(4.1, calc6.multiplyNumbers(15d, 7d))),
                (calc6.exponentiateNumbers(calc6.getModulusOfNumber(calc6.divideNumbers(28d, 5d)), 2)));
        System.out.println("4.1 + 15 * 7 + (28 / 5) ^ 2 = " + resultDelegate1);
        System.out.println("Количество использований калькулятора = " + calc6.getCountOperation());

        CalculatorWithMathExtends calc7 = new CalculatorWithMathExtends();
        CalculatorWithCounterAutoAgregation calc8 = new CalculatorWithCounterAutoAgregation(calc7);
        double resultDelegate2 = calc8.addNumbers((calc8.addNumbers(4.1, calc8.multiplyNumbers(15d, 7d))),
                (calc8.exponentiateNumbers(calc8.getModulusOfNumber(calc8.divideNumbers(28d, 5d)), 2)));
        System.out.println("4.1 + 15 * 7 + (28 / 5) ^ 2 = " + resultDelegate2);
        System.out.println("Количество использований калькулятора = " + calc8.getCountOperation());
    }

}
