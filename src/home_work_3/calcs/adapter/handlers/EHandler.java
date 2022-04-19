package home_work_3.calcs.adapter.handlers;

import home_work_3.calcs.adapter.handlers.api.IHandler;
import home_work_3.calcs.api.ICalculator;

import java.util.regex.Matcher;

public class EHandler extends PatternHandler implements IHandler {
    private final ICalculator calculator;
    public static final String E_PATTERN = "E|e";
    private final int priority = 6;

    public EHandler(ICalculator calculator) {
        super(E_PATTERN);
        this.calculator = calculator;
    }

    @Override
    protected double calculate(Matcher matcher) {
        return Math.E;
    }

    @Override
    public int getPriority() {
        return this.priority;
    }
}
