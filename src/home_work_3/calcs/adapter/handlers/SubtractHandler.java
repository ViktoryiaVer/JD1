package home_work_3.calcs.adapter.handlers;

import home_work_3.calcs.adapter.handlers.api.IHandler;
import home_work_3.calcs.api.ICalculator;

import java.util.regex.Matcher;

public class SubtractHandler extends PatternHandler implements IHandler {
    private final ICalculator calculator;
    public static final String SUBTRACT_PATTERN = " *\\- *";
    private final int priority = 1;

    public SubtractHandler(ICalculator calculator) {
        super(NUMBER_PATTERN + SUBTRACT_PATTERN + NUMBER_PATTERN);
        this.calculator = calculator;
    }

    @Override
    protected double calculate(Matcher matcher) {
        String operand1 = matcher.group(1);
        String operand2 = matcher.group(3);
        return calculator.subtract(Double.parseDouble(operand1), Double.parseDouble(operand2));
    }

    @Override
    public int getPriority() {
        return this.priority;
    }
}
