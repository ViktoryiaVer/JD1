package home_work_5.test;

import home_work_5.searchEngines.EasySearch;
import home_work_5.searchEngines.SearchEngineCaseNormalizer;
import home_work_5.searchEngines.SearchEnginePunctuationNormalizer;
import home_work_5.searchEngines.api.ISearchEngine;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SearchEngineCaseNormalizerTest {
    private final ISearchEngine searchEngine = new SearchEngineCaseNormalizer(new  SearchEnginePunctuationNormalizer(new EasySearch()));


    @Test
    public void searchCommaWhitespaceSeparated() {
        String text = "привет, как дела!\n";
        String word1 = "привет";
        String word2 = "как";
        String word3 = "дела";

        Assertions.assertEquals(1,searchEngine.search(text,word1));
        Assertions.assertEquals(1,searchEngine.search(text,word2));
        Assertions.assertEquals(1,searchEngine.search(text,word3));
    }

    @Test
    public void searchCommaSeparatedAndNotSplit() {
        String text = "привет,какдела!\n";
        String word1 = "привет";
        String word2 = "какдела";
        String word3 = "как";

        Assertions.assertEquals(1,searchEngine.search(text,word1));
        Assertions.assertEquals(1,searchEngine.search(text,word2));
        Assertions.assertEquals(0,searchEngine.search(text,word3));
    }

    @Test
    public void searchSemicolonSeparatedAndNotSplit() {
        String text = "привет;какдела!\n";
        String word1 = "привет";
        String word2 = "какдела";
        String word3 = "как";

        Assertions.assertEquals(1,searchEngine.search(text,word1));
        Assertions.assertEquals(1,searchEngine.search(text,word2));
        Assertions.assertEquals(0,searchEngine.search(text,word3));
    }

    @Test
    public void searchSeveralNonWordSymbols() {
        String text = "как дела!.Что делаешь?";
        String word1 = "что";
        String word2 = "какдела";
        String word3 = "как";

        Assertions.assertEquals(0,searchEngine.search(text,word1));
        Assertions.assertEquals(0,searchEngine.search(text,word2));
        Assertions.assertEquals(1,searchEngine.search(text,word3));
    }

    @Test
    public void searchDashSeparatedAndNotWholeWord() {
        String text = "Привет-привет Привет -привет";
        String word1 = "Привет-привет";
        String word2 = "риве";

        Assertions.assertEquals(1,searchEngine.search(text,word1));
        Assertions.assertEquals(0,searchEngine.search(text,word2));

    }

    @Test
    public void searchOrdinalConjunction() {
        String text = "4-х\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "один и 1\n";
        String word1 = "4-х";
        String word2 = "1";
        String word3 = "и";

        Assertions.assertEquals(1,searchEngine.search(text,word1));
        Assertions.assertEquals(1,searchEngine.search(text,word2));
        Assertions.assertEquals(1,searchEngine.search(text,word3));

    }

    @Test
    public void searchSameCaseWords() {
        String text = "бабушка бабушке бабушку";
        String word1 = "бабушка";
        String word2 = "баб";

        Assertions.assertEquals(3,searchEngine.search(text,word1));
        Assertions.assertEquals(0,searchEngine.search(text,word2));
    }

    @Test
    public void searchNumbers() {
        String text = "13 16_11111111 1 3";
        String word1 = "1";
        String word2 = "13";

        Assertions.assertEquals(1,searchEngine.search(text,word1));
        Assertions.assertEquals(1,searchEngine.search(text,word2));
    }

    @Test
    public void searchTwoWordsWordsInSong() {
        String text = "[Songtext zu „Ohne Dich“]\n" +
                "\n" +
                "[Strophe 1]\n" +
                "Ich werde in die Tannen gehen\n" +
                "Dahin wo ich sie zuletzt gesehen\n" +
                "Doch der Abend wirft ein Tuch aufs Land\n" +
                "Und auf die Wege hinterm Waldesrand\n" +
                "Und der Wald er steht so schwarz und leer\n" +
                "Weh mir, oh weh, Und die Vögel singen nicht mehr\n" +
                "\n" +
                "[Refrain]\n" +
                "Ohne dich kann ich nicht sein, Ohne dich\n" +
                "Mit dir bin ich auch allein, Ohne dich\n" +
                "Ohne dich zähl ich die Stunden ohne dich\n" +
                "Mit dir stehen die Sekunden, Lohnen nicht\n" +
                "[Strophe 2]\n" +
                "Auf den Ästen in den Gräben\n" +
                "Ist es nun still und ohne Leben\n" +
                "Und das Atmen fällt mir ach so schwer\n" +
                "Weh mir, oh weh, und die Vögel singen nicht mehr\n" +
                "\n" +
                "[Refrain]\n" +
                "Ohne dich kann ich nicht sein, Ohne dich\n" +
                "Mit dir bin ich auch allein, Ohne dich (Ohne dich)\n" +
                "Ohne dich zähl ich die Stunden ohne dich\n" +
                "Mit dir stehen die Sekunden, Lohnen nicht\n" +
                "Ohne dich\n" +
                "Ohne dich\n" +
                "\n" +
                "[Bridge]\n" +
                "Und das Atmen fällt mir ach so schwer\n" +
                "Weh mir, oh weh, Und die Vögel singen nicht mehr\n" +
                "\n" +
                "[Refrain]\n" +
                "Ohne dich kann ich nicht sein, Ohne dich\n" +
                "Mit dir bin ich auch allein, Ohne dich (Ohne dich)\n" +
                "Ohne dich zähl ich die Stunden ohne dich\n" +
                "Mit dir stehen die Sekunden, Lohnen nicht\n" +
                "Ohne dich\n" +
                "\n" +
                "[Outro]\n" +
                "Ohne dich\n" +
                "Ohne dich\n" +
                "Ohne dich\n" +
                "Ohne dich";

        String word1 = "Ohne Dich";
        String word2 = "Ohne dich";
        String word3 = "ohne dich";
        String word4= "fällt";

        Assertions.assertEquals(1,searchEngine.search(text,word1));
        Assertions.assertEquals(21,searchEngine.search(text,word2));
        Assertions.assertEquals(3,searchEngine.search(text,word3));
        Assertions.assertEquals(2,searchEngine.search(text,word4));
    }

    @Test
    public void searchOnySameSymbols() {
        String text = "уууууууууууууууу аааааааааааааааааааа ыыыыыыыыыыыыыыыы нушо";
        String word1 = "у";
        String word2 = "а";
        String word3 = "ы";

        Assertions.assertEquals(0,searchEngine.search(text,word1));
        Assertions.assertEquals(0,searchEngine.search(text,word2));
        Assertions.assertEquals(0,searchEngine.search(text,word3));
    }

    @Test
    public void searchOnlyNotSplitWords() {
        String text = "вызнаетеазачемэтипробелывообщебезнихтоженормжиетсязубдаю";
        String word1 = "вы";
        String word2 = "зачем";
        String word3 = "пробелы";

        Assertions.assertEquals(0,searchEngine.search(text,word1));
        Assertions.assertEquals(0,searchEngine.search(text,word2));
        Assertions.assertEquals(0,searchEngine.search(text,word3));
    }

    @Test
    public void searchSeveralSimilarWords() {
        String text = "    \"Карл у Клары украл кораллы, а Клара у Карла украла кларнет. Если бы Карл у Клары " +
                "не украл кораллы, то Клара у Карла не украла б кларнет\";\n";

        String word1 = "Карл";
        String word2 = "Клара";

        Assertions.assertEquals(4,searchEngine.search(text,word1));
        Assertions.assertEquals(4,searchEngine.search(text,word2));
    }
}
