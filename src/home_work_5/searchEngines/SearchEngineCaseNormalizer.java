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

    @Override
    public long search(String text, String word) {
        return searchEngine.search(text, word);
    }

}
