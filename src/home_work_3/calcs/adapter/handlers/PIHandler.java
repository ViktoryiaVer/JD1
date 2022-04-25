package home_work_3.calcs.adapter.handlers;

import home_work_3.calcs.adapter.handlers.api.IHandler;
import home_work_3.calcs.api.ICalculator;

import java.util.regex.Matcher;

/**
 * Класс обработки математических выражений в виде строки для добработки константы PI
 */
public class PIHandler extends PatternHandler implements IHandler {
    private final ICalculator calculator;
    public static final String PI_PATTERN = "PI|pi";
    private final int priority = 6;

    public PIHandler(ICalculator calculator) {
        super(PI_PATTERN);
        this.calculator = calculator;
    }

    /**
     * получает значение константы PI
     * @param matcher результат согласования регулярного выражения из строки (PI или pi)
     * @return значение константы PI в виде double
     */
    @Override
    protected double calculate(Matcher matcher) {
        return Math.PI;
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
