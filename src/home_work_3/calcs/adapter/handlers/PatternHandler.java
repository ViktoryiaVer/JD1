package home_work_3.calcs.adapter.handlers;

import home_work_3.calcs.adapter.handlers.api.IHandler;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class PatternHandler implements IHandler {

    public static final String NUMBER_PATTERN = "(-?\\d+(\\.\\d+){0,1})";
    private final Pattern pattern;

    public PatternHandler(String regex) {
        this.pattern = Pattern.compile(regex);
    }



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
    protected abstract double calculate(Matcher matcher);
}
