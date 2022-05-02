package students;

import java.text.DecimalFormat;
import java.util.Objects;

/**
 * класс со свойстами и методами студента
 */
public class Student implements Comparable<Student>{
    private int number;
    private String name;
    private int age;
    private double mark;
    private boolean partOlimp;
    private final DecimalFormat df = new DecimalFormat("#.##");

    public Student() {
    }

    public Student (int number, String name, int age, double mark, boolean partOlimp) {
        this.number = number;
        this.name = name;
        this.age = age;
        this.mark = mark;
        this.partOlimp = partOlimp;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getMark() {
        return mark;
    }

    public void setMark(double mark) {
        this.mark = mark;
    }

    public boolean isPartOlimp() {
        return partOlimp;
    }

    public void setPartOlimp(boolean partOlimp) {
        this.partOlimp = partOlimp;
    }

    @Override
    public String toString() {
        return "Student{" +
                "number=" + number +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", mark=" + df.format(mark) +
                ", partOlimp=" + partOlimp +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        return this.getName().compareTo(o.getName());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return number == student.number && age == student.age && Double.compare(student.mark, mark) == 0 && partOlimp == student.partOlimp && Objects.equals(name, student.name) && Objects.equals(df, student.df);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, name, age, mark, partOlimp, df);
    }
}
