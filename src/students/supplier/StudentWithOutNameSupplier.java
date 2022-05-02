package students.supplier;

import students.Student;

import java.util.concurrent.ThreadLocalRandom;
import java.util.function.Supplier;

public class StudentWithOutNameSupplier implements Supplier<Student> {

    private final ThreadLocalRandom rnd = ThreadLocalRandom.current();

    @Override
    public Student get() {
        Student s = new Student();
        s.setNumber(1);
        s.setAge(rnd.nextInt(7, 18));
        s.setMark(rnd.nextDouble(10));
        s.setPartOlimp(rnd.nextBoolean());

        return s;
    }
}