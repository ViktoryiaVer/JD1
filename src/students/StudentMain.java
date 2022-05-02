package students;

import home_work_4.comparator.ComparableComparator;
import students.comparator.ComparatorByMark;
import students.comparator.CompareByAge;
import students.predicate.StudentAgeGreaterAndEqual;
import students.predicate.StudentMarkGreater;
import students.supplier.RandomNameFromListSupplier;
import students.supplier.StudentWithNameAndIdSupplier;

import java.util.List;
import java.util.function.Predicate;
import java.util.function.Supplier;

import static students.DataService.*;

public class StudentMain {
    public static void main(String[] args) {
        Supplier<Student> supplier = new StudentWithNameAndIdSupplier(new RandomNameFromListSupplier(3, 10));
        List<Student> students =  createList(supplier, 10_000);
        Predicate<Student> filter = new StudentAgeGreaterAndEqual(12)
                .and(new StudentMarkGreater(8));

        List<Student> filteredStudents = filter(students, filter);

        double average = calculateAverageAge(filteredStudents);
        System.out.println("Средний возраст студентов от 12 лет с оценкой выше 8: " + average);

        filteredStudents.sort(new ComparableComparator<>());
        System.out.println("Топ-10 студентов по имени: ");
        printTop(filteredStudents, 10);

        filteredStudents.sort(new ComparatorByMark().reversed());
        System.out.println("Топ-10 студентов по оценке: ");
        printTop(filteredStudents, 10);

        filteredStudents.sort(new CompareByAge().thenComparing(new ComparatorByMark().reversed()));
        System.out.println("Топ-10 студентов по оценке в каждом возрасте:");
        printTopForAge(filteredStudents,10);
    }


}
