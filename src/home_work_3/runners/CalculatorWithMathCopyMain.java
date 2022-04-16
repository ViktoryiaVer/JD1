package home_work_3.runners;

import home_work_3.calcs.simple.CalculatorWithMathCopy;

/**
 * класс с точкой входа для класса CalculatorWithMathCopy (задание 3.3)
 */

public class CalculatorWithMathCopyMain {
    public static void main(String[] args) {
        CalculatorWithMathCopy calc = new CalculatorWithMathCopy();

        double div = calc.divide(28, 5);
        double pow = calc.pow(div, 2);
        double multi = calc.multiply(15, 7);
        double add = calc.add(pow, multi);
        double result = calc.add(4.1, add);

        System.out.println("4.1 + 15 * 7 + (28 / 5) ^ 2 = " + result);
    }
}
