package students;

import students.comparator.ComparatorByMark;
import students.comparator.ComparatorByName;
import students.comparator.CompareByAge;

import java.util.List;

public class StudentMain {
    public static void main(String[] args) {
        StudentService service = new StudentService();
        List<Student> students =  service.createRandomStudentList(10_000);

        List<Student> filteredStudents = service.getFilteredAgeMark(students,12,8);

        int average = service.calculateAverageAge(filteredStudents);
        System.out.println("Средний возраст студентов от 12 лет с оценкой выше 8: " + average);

        filteredStudents.sort(new ComparatorByName<>());
        System.out.println("Топ-10 студентов по имени: ");
        service.printTop(filteredStudents, 10);

        filteredStudents.sort(new ComparatorByMark());
        System.out.println("Топ-10 студентов по оценке: ");
        service.printTop(filteredStudents, 10);

        filteredStudents.sort(new CompareByAge().thenComparing(new ComparatorByMark()));
        System.out.println("Топ-10 студентов по оценке в каждом возрасте:");
        service.printTopForAge(filteredStudents,10);
    }


}
