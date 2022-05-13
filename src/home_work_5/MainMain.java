package home_work_5;

import home_work_5.searchEngines.EasySearch;
import home_work_5.searchEngines.RegExSearch;
import home_work_5.searchEngines.SearchEngineCaseInsensitive;
import home_work_5.searchEngines.SearchEnginePunctuationNormalizer;
import home_work_5.searchEngines.api.ISearchEngine;
import home_work_5.supplier.FormattedStringSupplier;
import home_work_5.supplier.StringFromFileSupplier;

import java.util.List;
import java.util.Map;
import java.util.Set;

import static home_work_5.StringOperations.*;

public class MainMain {
    public static void main(String[] args) {
        String path2 = "D:\\Computer Science\\Java_Basics\\JD1\\HomeWork\\src\\home_work_5\\resources\\Война и мир_книга.txt";
        String stringFromFile = new StringFromFileSupplier(path2).get();
        String formatted = new FormattedStringSupplier(stringFromFile).get();

        Set<String> strings = stringToSet(formatted);
        System.out.println(strings.size());

        Map<String,Integer> countedWords = stringToMap(formatted);
        System.out.println(countedWords);
        List<Map.Entry<String, Integer>> listMap = mapToList(countedWords);
        System.out.println(printTop(listMap,10));

        ISearchEngine searchEngine = new SearchEngineCaseInsensitive(new RegExSearch());
        //System.out.println(formatted);
        System.out.println(searchEngine.search(stringFromFile, "война"));

    }
}
