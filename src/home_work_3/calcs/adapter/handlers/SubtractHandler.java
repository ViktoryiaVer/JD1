package home_work_3.calcs.adapter.handlers;

import home_work_3.calcs.adapter.handlers.api.IHandler;
import home_work_3.calcs.api.ICalculator;

import java.util.regex.Matcher;

/**
 * Класс обработки математических выражений в виде строки для вычитания чисел
 */
public class SubtractHandler extends PatternHandler implements IHandler {
    private final ICalculator calculator;
    public static final String SUBTRACT_PATTERN = " *\\- *";
    private final int priority = 1;

    public SubtractHandler(ICalculator calculator) {
        super(NUMBER_PATTERN + SUBTRACT_PATTERN + NUMBER_PATTERN);
        this.calculator = calculator;
    }

    /**
     * считает математическое выражение вычитания
     * @param matcher результат согласования регулярного выражения из строки (два операнда и оператор)
     * @return результат вычитания типа double
     */
    @Override
    protected double calculate(Matcher matcher) {
        String operand1 = matcher.group(1);
        String operand2 = matcher.group(3);
        return calculator.subtract(Double.parseDouble(operand1), Double.parseDouble(operand2));
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
