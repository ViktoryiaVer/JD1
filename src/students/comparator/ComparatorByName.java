package students.comparator;

import students.Student;

import java.util.Comparator;

/**
 * /**
 *  * класс с имплементацией интерфейса Comparator для сортировки студентов по имени
 * @param <T> универсальный тип, связанный с интерфейсом Comparable
 */

public class ComparatorByName<T extends Comparable<Student>> implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
