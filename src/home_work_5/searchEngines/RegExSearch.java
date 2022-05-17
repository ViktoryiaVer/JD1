package home_work_5.searchEngines;

import home_work_5.searchEngines.api.ISearchEngine;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * класс с реализацией интерфейса ISearchEngine: поиск осуществляется при помощи класса Matcher
 */

public class RegExSearch implements ISearchEngine {

    private int patternModifier;

    public void setPatternModifier(int patternModifier) {
        this.patternModifier = patternModifier;
    }

    /**
     * осуществляет поиск при помощи класса Matcher
     * @param text текст типа String, в котором необходимо найти слово
     * @param word слово типа String, которое необходимо найти
     * @return количество совпадений типа long
     */
    @Override
    public long search(String text, String word) {
        long count = 0;
        String pattern = "\\b" + word + "\\b"; // паттерн с учетом границ слов

        String pattern2 = "(?:\\A|[^\\wа-яА-ЯЁёÄäÜüÖöß-])" + "(" + word + ")" + "(\\b)";  //паттерн с учетом - перед словом

        Pattern pattern1 = Pattern.compile(pattern2, this.patternModifier);
        Matcher m = pattern1.matcher(text);

        while(m.find()) {
           count++;
        }
        return count;
    }
}
