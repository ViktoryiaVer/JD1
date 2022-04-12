package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterAutoDecorator;
import home_work_3.calcs.additional.CalculatorWithMemoryDecorator;
import home_work_3.calcs.api.ICalculator;
import home_work_3.calcs.simple.CalculatorWithMathExtends;

/**
 * класс с точкой входа для классов CalculatorWithCounterAutoDecorator и CalculatorWithMemoryDecorator
 */

public class CalculatorDecoratorMain {
    public static void main(String[] args) {
        ICalculator calc13 = new CalculatorWithCounterAutoDecorator(new CalculatorWithMemoryDecorator(new CalculatorWithMathExtends()));
        double resultDec = calc13.addNumbers((calc13.addNumbers(4.1, calc13.multiplyNumbers(15d, 7d))),
                (calc13.exponentiateNumbers(calc13.getModulusOfNumber(calc13.divideNumbers(28d, 5d)), 2)));
        System.out.println("4.1 + 15 * 7 + (28 / 5) ^ 2 = " + resultDec);

        if(calc13 instanceof CalculatorWithCounterAutoDecorator) {
            System.out.println("Количество использований калькулятора = " +((CalculatorWithCounterAutoDecorator) calc13).getCountOperation());
            if(((CalculatorWithCounterAutoDecorator) calc13).getCalculator() instanceof CalculatorWithMemoryDecorator) {
                ((CalculatorWithMemoryDecorator) ((CalculatorWithCounterAutoDecorator) calc13).getCalculator()).setLastOperationResult();
                System.out.println("Последнее сохраненное значение в памяти: " + ((CalculatorWithMemoryDecorator) ((CalculatorWithCounterAutoDecorator) calc13).getCalculator()).getLastOperationResult());
            }

        }
    }
}
