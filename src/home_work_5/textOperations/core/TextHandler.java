package home_work_5.textOperations.core;

import home_work_5.textOperations.api.IStringHandler;
import home_work_5.textOperations.supplier.StringFromFileSupplier;

import java.util.*;

/**
 * класс с методами для работы с текстом
 */
public class TextHandler implements IStringHandler {

    /**
     * считает слова в тексте из файла
     * @param path путь файла типа String, в котором необходимо подсчитать слова
     * @return количество слов типа int в тексте
     */
    public int countWordsInText(String path) {
        String textFromFile = new StringFromFileSupplier(path).get();
        String formatted = deletePunctuationAndExtraWhitespaces(textFromFile);

        SetStringHandler setHandler = new SetStringHandler();
        setHandler.createCollectionFromString(formatted);
        return setHandler.getStrings().size();
    }

    /**
     * получает для печати ТОП слов из текста
     * @param path путь файла типа String, в тексте которого необходимо определить и вывести ТОП слов
     * @param count количество слов типа int для ТОПа
     * @return ТОП слов типа String для последующей печати
     */
    public String printTopWordsInText(String path, int count) {
        String textFromFile = new StringFromFileSupplier(path).get();
        String formatted = deletePunctuationAndExtraWhitespaces(textFromFile);

        MapHandler mapHandler = new MapHandler();
        mapHandler.createCollectionFromString(formatted);

        List<Map.Entry<String, Integer>> mapAsList =  mapHandler.mapToSortedList();
        return topToPrint(mapAsList, count);
    }

    /**
     * формирует ТОП для печати
     * @param entryList список типа List<Map.Entry<String,Integer>>, позиции которого необходимо вернуть для печати
     * @param count количество позиций типа int для ТОПа
     * @return ТОП для печати типа String
     */
    private String topToPrint(List<Map.Entry<String, Integer>> entryList, int count) {
        StringBuilder sb = new StringBuilder();

        for (Map.Entry<String, Integer> entry : entryList) {
            if(count-- <= 0) {
                break;
            }
            sb.append(entry.getKey()).append(" - ").append(entry.getValue());
            if(count!= 0) {
                sb.append("\n");
            }
        }
        return String.valueOf(sb);
    }
}
