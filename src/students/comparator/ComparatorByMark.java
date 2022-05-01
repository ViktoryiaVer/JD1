package students.comparator;

import students.Student;
import java.util.Comparator;

/**
 * класс с имплементацией интерфейса Comparator для сортировки студентов по оценке
 */
public class ComparatorByMark implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return Double.compare(o1.getMark(), o2.getMark());
    }

}
