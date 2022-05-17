package home_work_5.searchEngines;

import home_work_5.searchEngines.api.ISearchEngine;
import home_work_5.textOperations.api.IStringHandler;

public class SearchEnginePunctuationNormalizer implements ISearchEngine, IStringHandler {
    private final ISearchEngine searchEngine;

    public SearchEnginePunctuationNormalizer(ISearchEngine searchEngine) {
        this.searchEngine = searchEngine;
    }

    public ISearchEngine getSearchEngine() {
        return searchEngine;
    }

    /**
     * осуществляет поиск слова в тексте, при этом из строки удаляются знаки препинания и лишние пробельные знаки
     * @param text текст типа String, в котором необходимо найти слово
     * @param word слово типа String, которое необходимо найти
     * @return количество совпадений типа long
     */
    @Override
    public long search(String text, String word) {
        text = deletePunctuationAndExtraWhitespaces(text);
        return searchEngine.search(text, word);
    }
}
