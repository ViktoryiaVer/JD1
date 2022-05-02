package students.predicate;

import students.Student;

import java.util.function.Predicate;

public class StudentMarkGreater implements Predicate<Student> {

    private final int mark;

    public StudentMarkGreater(int mark) {
        this.mark = mark;
    }

    @Override
    public boolean test(Student item) {
        return item.getMark() > mark;
    }
}