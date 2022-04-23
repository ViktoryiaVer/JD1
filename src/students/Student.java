package students;


import java.text.DecimalFormat;

/**
 * класс со свойстами и методами студента
 */
public class Student {
    private int number;
    private String name;
    private int age;
    private double mark;
    private boolean partOlimp;
    private DecimalFormat df = new DecimalFormat("#.##");

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

    public String getName() {
        return name;
    }


    public int getAge() {
        return age;
    }


    public double getMark() {
        return mark;
    }

    public boolean isPartOlimp() {
        return partOlimp;
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
}
