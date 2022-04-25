package home_work_3.calcs.adapter.handlers;

import home_work_3.calcs.adapter.handlers.api.IHandler;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * абстрактный класс для обработки математических выражений типа String
 */
public abstract class PatternHandler implements IHandler {

    public static final String NUMBER_PATTERN = "(-?\\d+(\\.\\d+){0,1})";
    private final Pattern pattern;

    public PatternHandler(String regex) {
        this.pattern = Pattern.compile(regex);
    }


    /**
     * обрабатывает и вызывает методы для подсчета математического выражения в виде String,
     * @param str строка, которую необходимо обработать
     * @return результат вычисления в виде String
     */
    @Override
    public final String handle(String str) {
        boolean isMatch;
        do {
            Matcher matcher = this.pattern.matcher(str);
            isMatch = matcher.find();
            if(isMatch) {
                double result = calculate(matcher);
                do {
                    str = str.replace(matcher.group(), String.valueOf(result));
                } while(str.contains(matcher.group()));
            }
        } while(isMatch);
        return str;
    }

    /**
     * абстрактный метод для подсчета математических выражений
     * @param matcher результат согласования регулярного выражения из строки
     * @return результат вычисления выражения
     */
    protected abstract double calculate(Matcher matcher);
}
