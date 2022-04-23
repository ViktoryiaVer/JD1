package students.comparator;

import students.Student;
import java.util.Comparator;

/**
 * класс с имплементацией интерфейса Comparator для сортировки студентов по оценке
 */
public class ComparatorByMark implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        if(o2.getMark()> o1.getMark())
            return 1;
        else if(o2.getMark()< o1.getAge())
            return -1;
        else
            return 0;
    }

}
