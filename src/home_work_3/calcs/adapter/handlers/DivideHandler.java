package home_work_3.calcs.adapter.handlers;

import home_work_3.calcs.adapter.handlers.api.IHandler;
import home_work_3.calcs.api.ICalculator;

import java.util.regex.Matcher;

public class DivideHandler extends PatternHandler implements IHandler {
    private final ICalculator calculator;
    public static final String DIVIDE_PATTERN = " *\\/ *";
    private final int priority = 2;

    public DivideHandler(ICalculator calculator) {
        super(NUMBER_PATTERN + DIVIDE_PATTERN + NUMBER_PATTERN);
        this.calculator = calculator;
    }

    @Override
    protected double calculate(Matcher matcher) {
        String operand1 = matcher.group(1);
        String operand2 = matcher.group(3);
        return calculator.divide(Double.parseDouble(operand1), Double.parseDouble(operand2));
    }

    @Override
    public int getPriority() {
        return this.priority;
    }
}
