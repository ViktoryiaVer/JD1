package home_work_3.calcs.adapter.handlers;

import home_work_3.calcs.adapter.CalculatorStringAdapter;
import home_work_3.calcs.adapter.handlers.api.IHandler;
import home_work_3.calcs.api.ICalculator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 * Класс обработки математических выражений в виде строки для обработки выражений в скобках
 */
public class BracketsHandler implements IHandler {
    private final ICalculator calculator;
    public static final String OBR_PATTERN = "\\(";
    public static final String CLBR_PATTERN = "\\)";
    private final Pattern pattern;
    private final int priority = 5;

    public BracketsHandler(ICalculator calculator) {
        this.pattern = Pattern.compile("(.*)" + "(" + OBR_PATTERN + ".+"  + CLBR_PATTERN + ")+" + "(.*)");
        this.calculator = calculator;
    }

    /**
     * обрабатывает и вызывает методы для подсчета математического выражения в виде String,
     * находит в строке скобки и выражение в них,
     * создает новый объект адаптера, чтобы обработать и посчитать выражения внутри скобок
     * @param str строка, которую необходимо обработать
     * @return результат выражения в скобках в виде String
     */
    @Override
    public String handle(String str) {
        boolean isMatch;
        do {
            Matcher matcher = this.pattern.matcher(str);
            isMatch = matcher.find();
            if(isMatch) {
                CalculatorStringAdapter calc = new CalculatorStringAdapter();
                String withoutBr = matcher.group(2).substring(1,matcher.group(2).length()-1);
                String strTemp = String.valueOf(calc.calculateString(withoutBr));
                str = str.replace(matcher.group(2),strTemp);
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
