package home_work_3.runners;

import home_work_3.calcs.simple.CalculatorWithMathExtends;

/**
 * класс с точкой входа для класса CalculatorWithMathExtends (задание 4.4)
 */

public class CalculatorWithMathExtendsMain {
    public static void main(String[] args) {
        CalculatorWithMathExtends calc3 = new CalculatorWithMathExtends();

        double resultMathExtend  = calc3.addNumbers((calc3.addNumbers(4.1, calc3.multiplyNumbers(15d, 7d))),
                (calc3.exponentiateNumbers(calc3.getModulusOfNumber(calc3.divideNumbers(28d, 5d)),2)));
        System.out.println("4.1 + 15 * 7 + (28 / 5) ^ 2 = " + resultMathExtend);
    }
}
