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
        ICalculator calc = new CalculatorWithCounterAutoDecorator(new CalculatorWithMemoryDecorator(new CalculatorWithMathExtends()));

        double div = calc.divide(28, 5);
        double pow = calc.pow(div, 2);
        double multi = calc.multiply(15, 7);
        double add = calc.add(pow, multi);
        double result = calc.add(4.1, add);

        System.out.println("4.1 + 15 * 7 + (28 / 5) ^ 2 = " + result);

        if(calc instanceof CalculatorWithCounterAutoDecorator) {
            CalculatorWithCounterAutoDecorator calcWithCount = (CalculatorWithCounterAutoDecorator) calc;
            System.out.println("Количество использований калькулятора = " +calcWithCount.getCountOperation());
            if((calcWithCount.getCalculator()) instanceof CalculatorWithMemoryDecorator) {
                CalculatorWithMemoryDecorator calcWithMemory = (CalculatorWithMemoryDecorator) calcWithCount.getCalculator();
                calcWithMemory.setLastOperationResult();
                System.out.println("Последнее сохраненное значение в памяти: " + calcWithMemory.getLastOperationResult());
            }

        }
    }
}
