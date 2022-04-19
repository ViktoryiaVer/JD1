package home_work_3.calcs.adapter;

import home_work_3.calcs.adapter.handlers.*;
import home_work_3.calcs.adapter.handlers.api.IHandler;
import home_work_3.calcs.api.ICalculator;
import home_work_3.calcs.simple.CalculatorWithMathExtends;

import java.util.LinkedList;
import java.util.List;

/**
 * класс-адаптер для подсчета математического выражения в виде строки
 */

public class CalculatorStringAdapter {
    private final ICalculator calculator;

    private final List<IHandler> listHandler = new LinkedList<>();

    public CalculatorStringAdapter() {
        this.calculator = new CalculatorWithMathExtends();
        listHandler.add(new MultiplyHandler(this.calculator));
        listHandler.add(new AddHandler(this.calculator));
        listHandler.add(new SubtractHandler(this.calculator));
        listHandler.add(new DivideHandler(this.calculator));
        listHandler.add(new PowHandler(this.calculator));
        listHandler.add(new AbsHandler(this.calculator));
        listHandler.add(new BracketsHandler(this.calculator));
        listHandler.add(new PIHandler(this.calculator));
        listHandler.add(new EHandler(this.calculator));
        listHandler.sort((a, b) -> b.getPriority() - a.getPriority());
    }

    /**
     * счмтает математическое выражение в виде строки
     * @param str строка с математическим выражением
     * @return результат вычисления в виде double
     */
    public double calculateString (String str) {
        for (IHandler handler : listHandler) {
            str = handler.handle(str);
        }
        return Double.parseDouble(str);
    }

}
