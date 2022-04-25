package home_work_3.calcs.adapter.handlers;

import home_work_3.calcs.adapter.CalculatorStringAdapter;
import home_work_3.calcs.adapter.handlers.api.IHandler;
import home_work_3.calcs.api.ICalculator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Класс обработки математических выражений в виде строки для нахождения модуля числа
 */
public class AbsHandler implements IHandler {
    private final ICalculator calculator;
    public static final String ABS_PATTERN = "\\|";
    private final Pattern pattern;
    private final int priority = 4;

    public AbsHandler(ICalculator calculator) {
        this.pattern = Pattern.compile("(.*)" + "(" + ABS_PATTERN + ".+"  + ABS_PATTERN + ")+" + "(.*)");
        this.calculator = calculator;
    }

    /**
     * обрабатывает и вызывает методы для подсчета математического выражения в виде String,
     * находит в строке модуль,
     * создает новый объект адаптера, чтобы обработать и посчитать выражения внутри модуля
     * @param str строка, которую необходимо обработать
     * @return результат модуля числа в виде String
     */
    @Override
    public String handle(String str) {
        boolean isMatch;
        do {
            Matcher matcher = this.pattern.matcher(str);
            isMatch = matcher.find();
            if(isMatch) {
                CalculatorStringAdapter calc = new CalculatorStringAdapter();
                String withoutAbs = matcher.group(2).substring(1,matcher.group(2).length()-1);
                double temp = calc.calculateString(withoutAbs);
                temp = calculator.abs(temp);

                str = str.replace(matcher.group(2),String.valueOf(temp));
            }
        } while (isMatch);

        return str;
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

