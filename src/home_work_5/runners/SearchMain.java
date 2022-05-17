package home_work_5.runners;

import home_work_5.searchEngines.EasySearch;

import home_work_5.searchEngines.RegExSearch;
import home_work_5.searchEngines.SearchEngineCaseInsensitive;
import home_work_5.searchEngines.SearchEnginePunctuationNormalizer;
import home_work_5.searchEngines.api.ISearchEngine;
import home_work_5.textOperations.supplier.StringFromFileSupplier;

/**
 * класс с точкой входа для объектов и методов классов из пакета searchEngines
 */

public class SearchMain {
    public static void main(String[] args) {
        String path = "D:\\Computer Science\\Java_Basics\\JD1\\HomeWork\\src\\home_work_5\\resources\\warAndPeace\\Война и мир_книга.txt";
        String stringFromFile = new StringFromFileSupplier(path).get();

        String word1 = "война";
        String word2 = "и";
        String word3 = "мир";

        // считаем слова, используя EasySearch (c учетом регистра)
        ISearchEngine easySearch = new EasySearch();

        System.out.println(word1 + " - "  + easySearch.search(stringFromFile, word1));
        System.out.println(word2 + " - "  + easySearch.search(stringFromFile, word2));
        System.out.println(word3 + " - "  + easySearch.search(stringFromFile, word3));

        // считаем слова, используя RegExSearch (c учетом регистра)
        ISearchEngine regExSearch = new RegExSearch();

        System.out.println(word1 + " - "  + regExSearch.search(stringFromFile, word1));
        System.out.println(word2 + " - "  + regExSearch.search(stringFromFile, word2));
        System.out.println(word3 + " - "  + regExSearch.search(stringFromFile, word3));

        // считаем слова, используя декоратор SearchEnginePunctuationNormalizer и EasySearch (c учетом регистра)
        ISearchEngine punctuationNormalizerEasy = new SearchEnginePunctuationNormalizer(easySearch);

        System.out.println(word1 + " - "  + punctuationNormalizerEasy.search(stringFromFile, word1));
        System.out.println(word2 + " - "  + punctuationNormalizerEasy.search(stringFromFile, word2));
        System.out.println(word3 + " - "  + punctuationNormalizerEasy.search(stringFromFile, word3));

        // считаем слова, используя декоратор SearchEnginePunctuationNormalizer и RegExSearch (c учетом регистра)
        ISearchEngine punctuationNormalizerReg = new SearchEnginePunctuationNormalizer(regExSearch);

        System.out.println(word1 + " - "  + punctuationNormalizerReg.search(stringFromFile, word1));
        System.out.println(word2 + " - "  + punctuationNormalizerReg.search(stringFromFile, word2));
        System.out.println(word3 + " - "  + punctuationNormalizerReg.search(stringFromFile, word3));

        // считаем слова, используя декоратор SearchEngineCaseInsensitive и EasySearch (без учета регистра)
        ISearchEngine searchEngineCaseInsEasy = new SearchEngineCaseInsensitive(easySearch);

        System.out.println(word1 + " - "  + searchEngineCaseInsEasy.search(stringFromFile, word1));
        System.out.println(word2 + " - "  + searchEngineCaseInsEasy.search(stringFromFile, word2));
        System.out.println(word3 + " - "  + searchEngineCaseInsEasy.search(stringFromFile, word3));

        // считаем слова, используя декоратор SearchEngineCaseInsensitive и RegExSearch (без учета регистра)
        ISearchEngine searchEngineCaseInsReg = new SearchEngineCaseInsensitive(regExSearch);

        System.out.println(word1 + " - "  + searchEngineCaseInsReg.search(stringFromFile, word1));
        System.out.println(word2 + " - "  + searchEngineCaseInsReg.search(stringFromFile, word2));
        System.out.println(word3 + " - "  + searchEngineCaseInsReg.search(stringFromFile, word3));

        // считаем слова, используя декораторы SearchEngineCaseInsensitive, SearchEnginePunctuationNormalizer и EasySearch (без учета регистра)
        ISearchEngine searchEngineCaseInsPunctEasy = new SearchEngineCaseInsensitive(punctuationNormalizerEasy);

        System.out.println(word1 + " - "  + searchEngineCaseInsPunctEasy.search(stringFromFile, word1));
        System.out.println(word2 + " - "  + searchEngineCaseInsPunctEasy.search(stringFromFile, word2));
        System.out.println(word3 + " - "  + searchEngineCaseInsPunctEasy.search(stringFromFile, word3));

        // считаем слова, используя декораторы SearchEngineCaseInsensitive, SearchEnginePunctuationNormalizer и RegExSearch (без учета регистра)
        ISearchEngine searchEngineCaseInsPunctReg = new SearchEngineCaseInsensitive(punctuationNormalizerReg);

        System.out.println(word1 + " - "  + searchEngineCaseInsPunctReg.search(stringFromFile, word1));
        System.out.println(word2 + " - "  + searchEngineCaseInsPunctReg.search(stringFromFile, word2));
        System.out.println(word3 + " - "  + searchEngineCaseInsPunctReg.search(stringFromFile, word3));
    }
}
