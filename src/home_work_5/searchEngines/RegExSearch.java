package home_work_5.searchEngines;

import home_work_5.searchEngines.api.ISearchEngine;
import home_work_5.supplier.FormattedStringSupplier;

import java.util.function.Supplier;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExSearch implements ISearchEngine {
    @Override
    public long search(String text, String word) {
        //Supplier<String> supplier = new FormattedStringSupplier(text); если со вторым паттерном, то ок
        long count = 0;

        String pattern1 = "(\\b)" + word + "(\\b)";
        String pattern2 = "(\\b[^-]|^)" + word + "(\\b[^-])";

        Pattern p = Pattern.compile(pattern1);
        Matcher m = p.matcher(text);
        while(m.find()) {
           count++;
        }
        return count;
    }
}
