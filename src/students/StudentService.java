package students;

import java.util.ArrayList;
import java.util.List;

/**
 * класс с методами для операций со списками студентов
 */

public class StudentService {

    /**
     * создает список объектов класса Student с рандомными данными
     * @param amount количество объектов, которые должны быть добавлены в список
     * @return список объектов класса Student
     */
    public List<Student> createRandomStudentList(int amount) {
        List<Student> students = new ArrayList<>();
        RandomGenerator random = new RandomGenerator();

        for (int i = 0; i < amount; i++) {
            int number = i+1;
            students.add(new Student(number, random.generateRandomName(), random.generateRandomAge(),
                    random.generateRandomMark(), random.generateRandomPart()));
        }
        return students;
    }

    /**
     * фильтрует список объектов класса Student по возрасту и оценке
     * @param students список объектов класса Student, который необходимо отфильтровать
     * @param age возраст, с которого студенты должны попасть в отфильтрованный список
     * @param mark оценка, с которой студенты должны попасть в отфильтрованный список
     * @return новый отфильтрованный список
     */
    public List<Student> getFilteredAgeMark(List<Student> students, int age, double mark) {
        List<Student> filteredStudents = new ArrayList<>();

        for(Student student : students) {
            if(student.getAge() >= age && student.getMark() >= mark) {
                filteredStudents.add(student);
            }
        }
        return filteredStudents;
    }

    /**
     * считает средний возраст студентов
     * @param students список объектов класса Student, средний возраст которых необходимо посчитать
     * @return средний возраст типа int
     */
    public final int calculateAverageAge(List<Student> students) {
        int sumAge = 0;
        int amount = students.size();
        for(Student student : students) {
            sumAge+= student.getAge();
        }
        return sumAge/amount;
    }

    /**
     * выводит в консоль ТОП объектов класса Student
     * @param students список объектов класса Student, для которых нужно вывести ТОП
     * @param count количество позиций для ТОПА типа int
     */
    public void printTop(List <Student> students, int count) {
        int i = 0;
        for(Student filteredStudent : students) {
            System.out.println(filteredStudent);
            i++;

            if(i == count) {
                break;
            }
        }
    }

    /**
     * выводит в консоль ТОП объектов класса Student для каждого возраста студента
     * @param students список объектов класса Student, для которых нужно вывести ТОП
     * @param count количество позиций для ТОПА типа int
     */
    public void printTopForAge(List <Student> students, int count) {
        int currentAge = 0;
        int counter = 0;

        for(int j = 0; j < students.size(); j++) {
            int currentStudentAge = students.get(j).getAge();

            if(currentAge != students.get(j).getAge()) {
                currentAge = currentStudentAge;
                System.out.println("Топ-10 студентов по оценке для возраста " + currentAge + ":");
                counter = 0;
            }
            if(counter < count) {
                System.out.println(students.get(j));
                counter++;
            }
        }
    }


}
