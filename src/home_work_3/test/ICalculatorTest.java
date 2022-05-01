package home_work_3.test;

import home_work_3.calcs.additional.CalculatorWithCounterAutoDecorator;
import home_work_3.calcs.additional.CalculatorWithCounterAutoSuper;
import home_work_3.calcs.additional.CalculatorWithCounterClassic;
import home_work_3.calcs.additional.CalculatorWithMemoryDecorator;
import home_work_3.calcs.api.ICalculator;
import home_work_3.calcs.simple.CalculatorWithMathCopy;
import home_work_3.calcs.simple.CalculatorWithMathExtends;
import home_work_3.calcs.simple.CalculatorWithOperator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ICalculatorTest {
    @Test
    public void calculateWithCalculatorWithOperator() {
        ICalculator calc = new CalculatorWithOperator();
        double resultExp = 4.1 + 15 * 7 + Math.pow((28d / 5d),2);
        double div = calc.divide(28, 5);
        double pow = calc.pow(div, 2);
        double multi = calc.multiply(15, 7);
        double add = calc.add(pow, multi);
        double resultAct = calc.add(4.1, add);
        Assertions.assertEquals(resultExp, resultAct);
    }

    @Test
    public void calculateWithCalculatorWithMathCopy() {
        ICalculator calc = new CalculatorWithMathCopy();
        double resultExp = 4.1 + 15 * 7 + Math.pow((28d / 5d),2);
        double div = calc.divide(28, 5);
        double pow = calc.pow(div, 2);
        double multi = calc.multiply(15, 7);
        double add = calc.add(pow, multi);
        double resultAct = calc.add(4.1, add);
        Assertions.assertEquals(resultExp, resultAct);
    }

    @Test
    public void calculateWithCalculatorWithMathExtends() {
        ICalculator calc = new CalculatorWithMathExtends();
        double resultExp = 4.1 + 15 * 7 + Math.pow((28d / 5d),2);
        double div = calc.divide(28, 5);
        double pow = calc.pow(div, 2);
        double multi = calc.multiply(15, 7);
        double add = calc.add(pow, multi);
        double resultAct = calc.add(4.1, add);
        Assertions.assertEquals(resultExp, resultAct);
    }

    @Test
    public void calculateWithCalculatorWithCounterClassic() {
        ICalculator calc = new CalculatorWithCounterClassic();
        double resultExp = 4.1 + 15 * 7 + Math.pow((28d / 5d),2);
        double div = calc.divide(28, 5);
        double pow = calc.pow(div, 2);
        double multi = calc.multiply(15, 7);
        double add = calc.add(pow, multi);
        double resultAct = calc.add(4.1, add);
        Assertions.assertEquals(resultExp, resultAct);
    }

    @Test
    public void calculateWithCalculatorWithCounterAutoSuper() {
        ICalculator calc = new CalculatorWithCounterAutoSuper();
        double resultExp = 4.1 + 15 * 7 + Math.pow((28d / 5d),2);
        double div = calc.divide(28, 5);
        double pow = calc.pow(div, 2);
        double multi = calc.multiply(15, 7);
        double add = calc.add(pow, multi);
        double resultAct = calc.add(4.1, add);
        Assertions.assertEquals(resultExp, resultAct);
    }

    @Test
    public void calculateWithCalculatorWithCounterAutoDecorator() {
        ICalculator calc = new CalculatorWithCounterAutoDecorator(new CalculatorWithOperator());
        double resultExp = 4.1 + 15 * 7 + Math.pow((28d / 5d),2);
        double div = calc.divide(28, 5);
        double pow = calc.pow(div, 2);
        double multi = calc.multiply(15, 7);
        double add = calc.add(pow, multi);
        double resultAct = calc.add(4.1, add);
        Assertions.assertEquals(resultExp, resultAct);
    }

    @Test
    public void calculateWithCalculatorWithMemoryDecorator() {
        ICalculator calc = new CalculatorWithMemoryDecorator(new CalculatorWithMathCopy());
        double resultExp = 4.1 + 15 * 7 + Math.pow((28d / 5d),2);
        double div = calc.divide(28, 5);
        double pow = calc.pow(div, 2);
        double multi = calc.multiply(15, 7);
        double add = calc.add(pow, multi);
        double resultAct = calc.add(4.1, add);
        Assertions.assertEquals(resultExp, resultAct);
    }
}
