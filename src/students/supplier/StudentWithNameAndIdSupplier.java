package students.supplier;

import students.Student;

import java.util.concurrent.ThreadLocalRandom;
import java.util.function.Supplier;

public class StudentWithNameAndIdSupplier implements Supplier<Student> {

    private int createCount = 0;
    private final ThreadLocalRandom rnd = ThreadLocalRandom.current();

    private final Supplier<String> names;

    public StudentWithNameAndIdSupplier(Supplier<String> names) {
        this.names = names;
    }

    @Override
    public Student get() {
        Student s = new Student();
        s.setNumber(++createCount);
        s.setName(names.get());
        s.setAge(rnd.nextInt(7, 17));
        s.setMark(rnd.nextDouble(10));
        s.setPartOlimp(rnd.nextBoolean());

        return s;
    }
}