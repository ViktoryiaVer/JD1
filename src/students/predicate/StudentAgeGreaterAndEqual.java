package students.predicate;

import students.Student;

import java.util.function.Predicate;

public class StudentAgeGreaterAndEqual implements Predicate<Student> {

    private final int age;

    public StudentAgeGreaterAndEqual(int age) {
        this.age = age;
    }

    @Override
    public boolean test(Student item) {
        return item.getAge() >= age;
    }
}
