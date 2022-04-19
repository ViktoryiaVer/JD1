package home_work_3.calcs.adapter.handlers;

import home_work_3.calcs.adapter.handlers.api.IHandler;
import home_work_3.calcs.api.ICalculator;

import java.util.regex.Matcher;

public class PIHandler extends PatternHandler implements IHandler {
    private final ICalculator calculator;
    public static final String PI_PATTERN = "PI|pi";
    private final int priority = 6;

    public PIHandler(ICalculator calculator) {
        super(PI_PATTERN);
        this.calculator = calculator;
    }

    @Override
    protected double calculate(Matcher matcher) {
        return Math.PI;
    }

    @Override
    public int getPriority() {
        return this.priority;
    }
}
