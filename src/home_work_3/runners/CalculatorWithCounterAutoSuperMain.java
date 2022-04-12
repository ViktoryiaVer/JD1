package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterAutoSuper;

/**
 * класс с точкой входа для класса CalculatorWithCounterAutoSuper (задание 6.5)
 */
public class CalculatorWithCounterAutoSuperMain {
    public static void main(String[] args) {
        CalculatorWithCounterAutoSuper calc5 = new CalculatorWithCounterAutoSuper();

        double resultMathExtend  = calc5.addNumbers((calc5.addNumbers(4.1, calc5.multiplyNumbers(15d, 7d))),
                (calc5.exponentiateNumbers(calc5.getModulusOfNumber(calc5.divideNumbers(28d, 5d)),2)));
        System.out.println("4.1 + 15 * 7 + (28 / 5) ^ 2 = " + resultMathExtend);
        System.out.println("Количество использований калькулятора = " + calc5.getCountOperation());
    }
}
