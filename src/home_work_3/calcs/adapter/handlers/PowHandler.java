package home_work_3.calcs.adapter.handlers;

import home_work_3.calcs.adapter.handlers.api.IHandler;
import home_work_3.calcs.api.ICalculator;

import java.util.regex.Matcher;

/**
 * Класс обработки математических выражений в виде строки для возведения числа в степень другого числа
 */
public class PowHandler extends PatternHandler implements IHandler {
    private final ICalculator calculator;
    public static final String POW_PATTERN = " *\\^ *";
    private final int priority = 3;

    public PowHandler(ICalculator calculator) {
        super(NUMBER_PATTERN + POW_PATTERN + NUMBER_PATTERN);
        this.calculator = calculator;
    }

    /**
     * считает математическое выражение возведения в степень
     * @param matcher результат согласования регулярного выражения из строки (два операнда и оператор)
     * @return результат врзведения в степень в виде double
     */
    @Override
    protected double calculate(Matcher matcher) {
        String operand1 = matcher.group(1);
        String operand2 = matcher.group(3);
        return calculator.pow(Double.parseDouble(operand1), Integer.parseInt(operand2));
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
