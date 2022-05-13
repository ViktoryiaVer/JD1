package home_work_5.searchEngines;

import home_work_5.searchEngines.api.ISearchEngine;

public class SearchEngineCaseInsensitive implements ISearchEngine {
    private final ISearchEngine searchEngine;

    public SearchEngineCaseInsensitive(ISearchEngine searchEngine) {
        this.searchEngine = searchEngine;
    }

    public ISearchEngine getSearchEngine() {
        return searchEngine;
    }

    @Override
    public long search(String text, String word) {
        text = getLowerCaseString(text);
        word = getLowerCaseString(word);

        return searchEngine.search(text, word);
    }

    private String getLowerCaseString(String str) {
        return str.toLowerCase();
    }
}
