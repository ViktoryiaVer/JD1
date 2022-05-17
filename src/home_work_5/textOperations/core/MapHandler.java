package home_work_5.textOperations.core;

import home_work_5.textOperations.api.ICollectionHandler;
import home_work_5.textOperations.comparator.ListComparatorByKey;
import home_work_5.textOperations.comparator.ListComparatorByValue;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * класс с методами для работы с Map<String, Integer>
 */
public class MapHandler implements ICollectionHandler {
    private final Map<String, Integer> stringIntegerMap;

    public MapHandler() {
        this.stringIntegerMap = new HashMap<>();
    }

    /**
     * наполняет поле stringIntegerMap данными из строки
     * @param str строка типа Sting, на основе которой необходимо создать Map
     */
    @Override
    public final void createCollectionFromString(String str) {
        String pattern = "(\\s*)(\\S+)(\\s*)";
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(str);

        while(m.find()) {
            String word = m.group(2);
            this.stringIntegerMap.putIfAbsent(word, 0);
            this.stringIntegerMap.put(word,this.stringIntegerMap.get(word)+1);
        }
    }

    /**
     * копирует ключи и значения из поля stringIntegerMap, помещает их в объект типа List<Map.Entry<String,Integer>>
     * и сортирует его сначала по значению, а затем по ключу
     * @return отсортированный список типа List<Map.Entry<String, Integer>>
     */
    public List<Map.Entry<String, Integer>> mapToSortedList() {
        List<Map.Entry<String, Integer>> mapAsList = new ArrayList<>(this.stringIntegerMap.entrySet());
        mapAsList.sort(new ListComparatorByValue().reversed().thenComparing(new ListComparatorByKey()));
        return mapAsList;
    }

}
