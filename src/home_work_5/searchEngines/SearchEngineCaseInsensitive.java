package home_work_5.searchEngines;

import home_work_5.searchEngines.api.ISearchEngine;

import java.util.regex.Pattern;

/**
 * класс с реализацией интерфейса ISearchEngine: поиск осуществляется без учета регистра
 */

public class SearchEngineCaseInsensitive implements ISearchEngine {
    private final ISearchEngine searchEngine;

    public SearchEngineCaseInsensitive(ISearchEngine searchEngine) {
        this.searchEngine = searchEngine;
    }

    public ISearchEngine getSearchEngine() {
        return searchEngine;
    }

    /**
     * осуществляет поиск слова в тексте без учета регистра
     * если поле searchEngine хранит объект типа RegExSearch, передаются флаги для Pattern для поиска без учета регистра,
     * иначе - текст и слово приводятся к нижнему регистру
     * @param text текст типа String, в котором необходимо найти слово
     * @param word слово типа String, которое необходимо найти
     * @return количество совпадений типа long в тексте без учета регистра
     */
    @Override
    public long search(String text, String word) {

        if(searchEngine instanceof RegExSearch) {
            ((RegExSearch) searchEngine).setPatternModifier(Pattern.CASE_INSENSITIVE + Pattern.UNICODE_CASE);
        } else {
            text = text.toLowerCase();
            word = word.toLowerCase();
        }

        return searchEngine.search(text, word);
    }
}
