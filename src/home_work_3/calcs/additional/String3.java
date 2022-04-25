package home_work_3.calcs.additional;

import java.util.*;

public class String3 {
    public static void main(String[] args) {
        String expression = "1 - 2 + 5";

        String[] input = expression.split(" ");
        String[] arithmeticOperators = new String[]{"+", "-", "*", "/", "^"};

        LinkedList numbers = new LinkedList<String>();
        Stack operators = new Stack<String>();
        for (String item : input) {
            if (Arrays.stream(arithmeticOperators).anyMatch(item::equals)) {
                int priority = getPriority(item);

                if (operators.isEmpty() || priority > getPriority(String.valueOf(operators.peek()))) {
                    operators.push(item);
                } else {
                    while (!operators.isEmpty() && getPriority(String.valueOf(operators.peek())) > priority) {
                        numbers.add(operators.pop());
                    }

                    operators.push(item);
                }
            } else {
                numbers.add(item);
            }
        }

        while(!operators.isEmpty()) {
            numbers.add(operators.pop());
        }


        LinkedList<String> queue = new LinkedList<String>(numbers);
        Stack stack = new Stack<String>();

        String currentElement = queue.poll();

        while (queue.stream().count() >= 0) {
            if (!Arrays.stream(arithmeticOperators).anyMatch(currentElement::equals)) {
                stack.push(currentElement);
                currentElement = queue.poll();
            } else {

                double a = Double.parseDouble(String.valueOf(stack.pop()));
                double b = Double.parseDouble(String.valueOf(stack.pop()));

                double result = calculateResult(currentElement,a,b);

                stack.push(String.valueOf(result));
                if (!queue.isEmpty())
                    currentElement = queue.poll();
                else
                    break;
            }
        }
        double finalResult = Double.parseDouble(String.valueOf(stack.pop()));
        System.out.println(finalResult);

    }



    public static int getPriority(String oper) {
        switch(oper)  {
            case "+" :
            case "-" :
                return 0;
            case "*" :
            case "/" :
                return 1;
            case "^" :
                return 2;
            default :
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
