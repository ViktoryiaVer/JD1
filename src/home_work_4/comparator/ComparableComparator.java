package home_work_4.comparator;

import java.util.Comparator;

/**
 * класс с реализацией интерфейса Comparator для T extends Comparable
 */
public class ComparableComparator<T extends Comparable<T>> implements Comparator<T> {
    @Override
    public int compare(T o1, T o2) {
        if(o1 == null && o2 == null) {
            return 0;
        }
        if(o1 == null) {
            return 1;
        }
        if(o2 == null) {
            return -1;
        }
        return o1.compareTo(o2);
    }
}
