package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterAutoAgregation;
import home_work_3.calcs.additional.CalculatorWithCounterAutoComposite;
import home_work_3.calcs.simple.CalculatorWithMathCopy;
import home_work_3.calcs.simple.CalculatorWithMathExtends;
import home_work_3.calcs.simple.CalculatorWithOperator;


/**
 * класс с точкой входа для классов CalculatorWithCounterAutoComposite и CalculatorWithCounterAutoAgregation
 */
public class CalculatorWithCounterDelegateMain {
    public static void main(String[] args) {
        CalculatorWithCounterAutoComposite calcComp = new CalculatorWithCounterAutoComposite();

        double div = calcComp.divide(28, 5);
        double pow = calcComp.pow(div, 2);
        double multi = calcComp.multiply(15, 7);
        double add = calcComp.add(pow, multi);
        double result = calcComp.add(4.1, add);

        System.out.println("4.1 + 15 * 7 + (28 / 5) ^ 2 = " + result);
        System.out.println("Количество использований калькулятора = " + calcComp.getCountOperation());


        CalculatorWithCounterAutoAgregation calcAgr1 = new CalculatorWithCounterAutoAgregation(new CalculatorWithOperator());
        div = calcAgr1.divide(28, 5);
        pow = calcAgr1.pow(div, 2);
        multi = calcAgr1.multiply(15, 7);
        add = calcAgr1.add(pow, multi);
        result = calcAgr1.add(4.1, add);

        System.out.println("4.1 + 15 * 7 + (28 / 5) ^ 2 = " + result);
        System.out.println("Количество использований калькулятора = " + calcAgr1.getCountOperation());

        CalculatorWithCounterAutoAgregation calcAgr2 = new CalculatorWithCounterAutoAgregation(new CalculatorWithMathCopy());
        div = calcAgr2.divide(28, 5);
        pow = calcAgr2.pow(div, 2);
        multi = calcAgr2.multiply(15, 7);
        add = calcAgr2.add(pow, multi);
        result = calcAgr2.add(4.1, add);

        System.out.println("4.1 + 15 * 7 + (28 / 5) ^ 2 = " + result);
        System.out.println("Количество использований калькулятора = " + calcAgr2.getCountOperation());

        CalculatorWithCounterAutoAgregation calcAgr3 = new CalculatorWithCounterAutoAgregation(new CalculatorWithMathExtends());
        div = calcAgr3.divide(28, 5);
        pow = calcAgr3.pow(div, 2);
        multi = calcAgr3.multiply(15, 7);
        add = calcAgr3.add(pow, multi);
        result = calcAgr3.add(4.1, add);

        System.out.println("4.1 + 15 * 7 + (28 / 5) ^ 2 = " + result);
        System.out.println("Количество использований калькулятора = " + calcAgr3.getCountOperation());

    }

}
