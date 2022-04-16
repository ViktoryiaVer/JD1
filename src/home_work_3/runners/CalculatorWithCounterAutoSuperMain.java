package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterAutoSuper;

/**
 * класс с точкой входа для класса CalculatorWithCounterAutoSuper (задание 6.5)
 */
public class CalculatorWithCounterAutoSuperMain {
    public static void main(String[] args) {
        CalculatorWithCounterAutoSuper calc = new CalculatorWithCounterAutoSuper();

        double div = calc.divide(28, 5);
        double pow = calc.pow(div, 2);
        double multi = calc.multiply(15, 7);
        double add = calc.add(pow, multi);
        double result = calc.add(4.1, add);

        System.out.println("4.1 + 15 * 7 + (28 / 5) ^ 2 = " + result);
        System.out.println("Количество использований калькулятора = " + calc.getCountOperation());
    }
}
