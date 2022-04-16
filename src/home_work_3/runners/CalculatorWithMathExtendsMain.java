package home_work_3.runners;

import home_work_3.calcs.simple.CalculatorWithMathExtends;

/**
 * класс с точкой входа для класса CalculatorWithMathExtends (задание 4.4)
 */

public class CalculatorWithMathExtendsMain {
    public static void main(String[] args) {
        CalculatorWithMathExtends calc = new CalculatorWithMathExtends();

        double div = calc.divide(28, 5);
        double pow = calc.pow(div, 2);
        double multi = calc.multiply(15, 7);
        double add = calc.add(pow, multi);
        double result = calc.add(4.1, add);

        System.out.println("4.1 + 15 * 7 + (28 / 5) ^ 2 = " + result);
    }
}
