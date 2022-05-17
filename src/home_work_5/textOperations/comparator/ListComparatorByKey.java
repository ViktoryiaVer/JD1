package home_work_5.textOperations.comparator;

import java.util.Comparator;
import java.util.Map;

/**
 * класс с реализацией Comparator для сортировки Map.Entry<String, Integer> по ключу
 */

public class ListComparatorByKey implements Comparator<Map.Entry<String, Integer>> {
    @Override
    public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
        return o1.getKey().compareTo(o2.getKey());
    }
}
