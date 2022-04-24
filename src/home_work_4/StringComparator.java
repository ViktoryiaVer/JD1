package home_work_4;

import java.util.Comparator;

/**
 * класс с реализацией интерфейса Comparator для String
 */
public class StringComparator implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        if(o1 == null || o2 == null) {
            throw new NullPointerException("Обнаружена ячейка со значением null. Сортировка невозможна. Проверьте данные."); //TODO
        }
        return o1.compareTo(o2);
    }
}
