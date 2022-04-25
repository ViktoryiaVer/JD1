package home_work_3.calcs.additional;

import java.util.LinkedList;
import java.util.Stack;

public class String4forExp {
    public static void main(String[] args) {
        String expression = "-1 ^ -3";

        String[] input = expression.split(" ");
        String arithmeticOperators = "+-*/^()|";

        LinkedList<String> numbers = new LinkedList<String>();
        Stack<String> operators = new Stack<>();
        for (String item : input) {
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
        double finalResult = Double.parseDouble(String.valueOf(stack.pop()));
        System.out.println(finalResult);

    }

    public static int getPriority(String operator) {
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

    public static double calculateResult(String str, double a, double b) {
        double result = 0;

        switch (str) {
            case "+":
                result = a + b;
                break;
            case "-":
                result = b - a;
                break;
            case "*":
                result = a * b;
                break;
            case "/":
                result = b / a;
                break;
            case "^":
                result = Math.pow(b, a);
                break;
        }
        return result;
    }

}
