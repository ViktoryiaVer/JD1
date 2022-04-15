package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorStringExpression;
import home_work_3.calcs.simple.CalculatorWithMathExtends;

public class CalculatorStringExpressionMain {
    public static void main(String[] args) {
        CalculatorStringExpression calc = new CalculatorStringExpression(new CalculatorWithMathExtends());
        String expression =  "1 - 2 + 5";
        System.out.println(calc.processExpression(expression));

    }
}
