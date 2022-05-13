package home_work_5.searchEngines;

import home_work_5.searchEngines.api.ISearchEngine;

public class SearchEnginePunctuationNormalizer implements ISearchEngine  {
    private final ISearchEngine searchEngine;

    public SearchEnginePunctuationNormalizer(ISearchEngine searchEngine) {
        this.searchEngine = searchEngine;
    }

    public ISearchEngine getSearchEngine() {
        return searchEngine;
    }

    @Override
    public long search(String text, String word) {
        text = normalizePunctuationInString(text);
        return searchEngine.search(text,word);
    }

    private String normalizePunctuationInString(String str) {
        String punctuation = "-\\s+|\\s+-|--|_|[^\\wа-яА-ЯЁё-]";
        String temp = str.replaceAll(punctuation," ");
        temp = temp.replaceAll("\\s{2,}", " ");
        return temp.trim();
    }
}
