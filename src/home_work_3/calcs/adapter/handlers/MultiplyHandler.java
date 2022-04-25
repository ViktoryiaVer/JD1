package home_work_3.calcs.adapter.handlers;

import home_work_3.calcs.adapter.handlers.api.IHandler;
import home_work_3.calcs.api.ICalculator;

import java.util.regex.Matcher;

/**
 * Класс обработки математических выражений в виде строки для умножения чисел
 */
public class MultiplyHandler extends PatternHandler implements IHandler {
    private final ICalculator calculator;
    public static final String MULTI_PATTERN = " *\\* *";
    private final int priority = 2;

    public MultiplyHandler(ICalculator calculator) {
        super(NUMBER_PATTERN + MULTI_PATTERN + NUMBER_PATTERN);
        this.calculator = calculator;
    }

    /**
     * считает математическое выражение умножения
     * @param matcher результат согласования регулярного выражения из строки (два операнда и оператор)
     * @return результат умножения в виде double
     */
    @Override
    protected double calculate(Matcher matcher) {
        String operand1 = matcher.group(1);
        String operand2 = matcher.group(3);
        return calculator.multiply(Double.parseDouble(operand1), Double.parseDouble(operand2));
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
