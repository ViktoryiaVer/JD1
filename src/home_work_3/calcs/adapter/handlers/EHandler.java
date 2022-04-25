package home_work_3.calcs.adapter.handlers;

import home_work_3.calcs.adapter.handlers.api.IHandler;
import home_work_3.calcs.api.ICalculator;

import java.util.regex.Matcher;

/**
 * Класс обработки математических выражений в виде строки для добработки константы E
 */
public class EHandler extends PatternHandler implements IHandler {
    private final ICalculator calculator;
    public static final String E_PATTERN = "E|e";
    private final int priority = 6;

    public EHandler(ICalculator calculator) {
        super(E_PATTERN);
        this.calculator = calculator;
    }

    /**
     * получает значение константы E
     * @param matcher результат согласования регулярного выражения из строки (E или e)
     * @return значение константы E в виде double
     */
    @Override
    protected double calculate(Matcher matcher) {
        return Math.E;
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
