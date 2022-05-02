package students;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 * класс с методами для операций c данными
 */

public class DataService {

    /**
     * создает список объектов типа T
     * @param supplier реализация интерфейса Supplier для поулчения данных  с опеределенными характеристиками
     * @param amount количество объектов, которые должны быть добавлены в список
     * @param <T> обобщенный тип
     * @return список объектов класса Student
     */
    public static <T> List<T> createList(Supplier<T> supplier, int amount) {
        List<T> data = new ArrayList<>();

        for (int i = 0; i < amount; i++) {
            data.add(supplier.get());
        }
        return data;
    }

    /**
     * фильтрует список объектов типа T
     * @param students список объектов класса Student, который необходимо отфильтровать
     * @param filter реализация интерфейса Predicate с условием для фильтрации
     * @param <T> обобщенный тип
     * @return новый отфильтрованный список
     */
    public static <T> List<T> filter(List<T> students, Predicate<T> filter) {
        List<T> filteredData = new ArrayList<>();

        for(T item : students) {
            if(filter.test(item)){
                filteredData.add(item);
            }
        }
        return filteredData;
    }

    /**
     * считает средний возраст для объектов типа T extends Student
     * @param data список объектов типа T extends Student, средний возраст которых необходимо посчитать
     * @param <T> обобщенный тип
     * @return средний возраст типа int
     */
    public static <T extends Student> double calculateAverageAge(List<T> data) {
        if(data.size() == 0) {
            return 0;
        }
        int sumAge = 0;
        int amount = data.size();
        for(Student student : data) {
            sumAge+= student.getAge();
        }
        return (double) sumAge/amount;
    }

    /**
     * выводит в консоль ТОП объектов типа T
     * @param data список объектов типа T, для которых нужно вывести ТОП
     * @param count количество позиций для ТОПА типа int
     * @param <T> обобщенный тип
     */
    public static <T> void printTop(List <T> data, int count) {
        for(T item : data) {
            if(count-- <= 0) {
                break;
            }
            System.out.println(item);
        }

    }

    /**
     * выводит в консоль ТОП объектов типа T extends Student для каждого возраста студента
     * @param data список объектов типа T extends Student, для которых нужно вывести ТОП
     * @param count количество позиций для ТОПА типа int
     * @param <T> обобщенный тип
     */
    public static <T extends Student> void printTopForAge (List <T> data, int count) {
        int currentAge = 0;
        int counter = 0;
        for (T item : data) {
            if(currentAge != item.getAge()){
                counter = 0;
                currentAge = item.getAge();
                System.out.println("Топ-10 студентов по оценке для возраста " + currentAge + ":");
            }
            if(counter++ >= count){
                continue;
            }
            System.out.println(item);
        }
    }


}
