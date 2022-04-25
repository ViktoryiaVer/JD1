package home_work_3.calcs.adapter.handlers;

import home_work_3.calcs.adapter.handlers.api.IHandler;
import home_work_3.calcs.api.ICalculator;

import java.util.regex.Matcher;

/**
 * Класс обработки математических выражений в виде строки для сложения чисел
 */
public class AddHandler extends PatternHandler implements IHandler {
    private final ICalculator calculator;
    public static final String ADD_PATTERN = " *\\+ *";
    private final int priority = 1;

    public AddHandler(ICalculator calculator) {
        super(NUMBER_PATTERN + ADD_PATTERN + NUMBER_PATTERN);
        this.calculator = calculator;
    }

    /**
     * считает математическое выражение сложения
     * @param matcher результат согласования регулярного выражения из строки (два операнда и оператор)
     * @return результат сложения типа double
     */
    @Override
    protected double calculate(Matcher matcher) {
        String operand1 = matcher.group(1);
        String operand2 = matcher.group(3);
        return calculator.add(Double.parseDouble(operand1), Double.parseDouble(operand2));
    }

    /**
     * получает приоритет операции
     * @return приоритет операции типа int
     */
    @Override
    public int getPriority() {
        return this.priority;
    }
}
