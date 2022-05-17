package home_work_5.searchEngines;

import home_work_5.searchEngines.api.ISearchEngine;

public class SearchEngineCaseNormalizer implements ISearchEngine {

    private final ISearchEngine searchEngine;

    public SearchEngineCaseNormalizer(ISearchEngine searchEngine) {
        this.searchEngine = searchEngine;
    }

    public ISearchEngine getSearchEngine() {
        return searchEngine;
    }

    /**
     * осуществляет поиск слова в тексте, учитывая словоформы слова как одного слова
     * (пока только для существительных первого склонения)
     * @param text текст типа String, в котором необходимо найти слово
     * @param word слово типа String, которое необходимо найти
     * @return количество совпадений типа long с учетом падежей одного слова
     */
    @Override
    public long search(String text, String word) {
        if(word.length() > 1) {
            String wordWithoutEnding = word.replaceAll("[аяыиуоейю]$", "");
            text = text.replaceAll(wordWithoutEnding + "[аяыиуоейю]", word);
        }

        return searchEngine.search(text, word);
    }
}
