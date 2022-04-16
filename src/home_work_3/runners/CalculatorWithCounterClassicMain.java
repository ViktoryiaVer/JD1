package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterClassic;

/**
 * класс с точкой входа для класса CalculatorWithCounterClassic (задание 5.5)
 */

public class CalculatorWithCounterClassicMain {
    public static void main(String[] args) {
        CalculatorWithCounterClassic calc = new CalculatorWithCounterClassic();

        double div = calc.divide(28, 5);
        calc.incrementCountOperation();

        double pow = calc.pow(div, 2);
        calc.incrementCountOperation();

        double multi = calc.multiply(15, 7);
        calc.incrementCountOperation();

        double add = calc.add(pow, multi);
        calc.incrementCountOperation();

        double result = calc.add(4.1, add);
        calc.incrementCountOperation();

        System.out.println("4.1 + 15 * 7 + (28 / 5) ^ 2 = " + result);
        System.out.println("Количество использований калькулятора = " + calc.getCountOperation());
    }
}
