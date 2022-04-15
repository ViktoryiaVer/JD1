package home_work_3.calcs.additional;

import home_work_3.calcs.api.ICalculator;
import java.util.LinkedList;
import java.util.Stack;

public class CalculatorStringExpression {
    private static final String arithmeticOperators = "+-*/^()";
    private ICalculator calculator;

    public CalculatorStringExpression(ICalculator calc) {
        this.calculator = calc;
    }

    public double processExpression(String str) {
        String[] input = getTokens(str);
        LinkedList<String> postfixNumbers = analyzeTokens(input);
        return getResult(postfixNumbers);
    }

    public String[] getTokens(String str) {
        return str.split(" ");
    }

    public LinkedList<String> analyzeTokens(String[] tokens) {

        LinkedList<String> numbers;
        numbers = new LinkedList<>();
        Stack<String> operators = new Stack<>();
        for (String item : tokens) {
            if (arithmeticOperators.contains(item)) {
                int priority = getPriority(item);

                if (operators.isEmpty() || priority > getPriority(operators.peek())) {
                    operators.push(item);
                } else if (item.equals("(")) {
                    operators.push(item);
                } else if (item.equals(")")) {
                    while (!operators.empty()) {
                        if (operators.peek().equals("(")) {
                            operators.pop();
                            break;
                        } else {
                            numbers.add(operators.pop());
                        }
                    }
                } else {
                    while (!operators.isEmpty() && getPriority((operators.peek())) > priority) {
                        numbers.add(operators.pop());
                    }
                    operators.push(item);
                }
            } else {
                numbers.add(item);
            }
        }
        while (!operators.isEmpty()) {
            numbers.add(operators.pop());
        }
        return numbers;
    }

    public double getResult(LinkedList<String> numbers) {
        LinkedList<String> queue = new LinkedList<>(numbers);
        Stack<String> stack = new Stack<>();

        String currentElement = queue.poll();

        while (true) {
            assert currentElement != null;
            if (!arithmeticOperators.contains(currentElement)) {
                stack.push(currentElement);
                currentElement = queue.poll();
            } else {

                double a = Double.parseDouble(String.valueOf(stack.pop()));
                double b = Double.parseDouble(String.valueOf(stack.pop()));

                double result = calculateResult(currentElement, a, b);

                stack.push(String.valueOf(result));
                if (!queue.isEmpty())
                    currentElement = queue.poll();
                else {
                    break;
                }
            }
        }
        return Double.parseDouble(String.valueOf(stack.pop()));
    }

    public int getPriority(String operator) {
        switch (operator) {
            case "+":
            case "-":
                return 1;
            case "*":
            case "/":
                return 2;
            case "^":
                return 3;
            default:
                return 0;
        }
    }

    public double calculateResult(String str, double a, double b) {
        double result = 0;

        switch (str) {
            case "+":
                result = calculator.addNumbers(a, b);
                break;
            case "-":
                result = calculator.subtractNumbers(b, a);
                break;
            case "*":
                result = calculator.multiplyNumbers(a, b);
                break;
            case "/":
                result = calculator.divideNumbers(b, a);
                break;
            case "^":
                result = calculator.exponentiateNumbers(b, (int) a);
                break;
        }
        return result;
    }

}
