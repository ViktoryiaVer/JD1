package collections_work.runners;

import collections_work.collections.CollectionUtils;
import collections_work.comparators.AgeComparator;
import collections_work.comparators.NickComparator;
import collections_work.comparators.PasswordLengthComparator;
import collections_work.dto.Animal;
import collections_work.dto.Person;

import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.Consumer;


public class CollectionMain {

    public static void main(String[] args) {
        Integer amount = 1_000_000;

        List<Person> personLinkedList = new LinkedList<>();
        List<Animal> animalArrayList = new ArrayList<>();
        Set<Person> personHashSet = new HashSet<>();
        Set<Person> personTreeSet = new TreeSet<>(new PasswordLengthComparator().thenComparing(new NickComparator()).thenComparingInt(Person::hashCode));

        // заполнение коллекций
        long time1 = measureTime(personLinkedList, amount, CollectionUtils::fillCollectionWithPerson);
        printTime("заполнение LinkedList объектами Person", time1);
        long time2 = measureTime(animalArrayList, amount, CollectionUtils::fillCollectionWithAnimal);
        printTime("заполнение ArrayList объектами Animal", time2);
        long time3 = measureTime(personHashSet, amount, CollectionUtils::fillCollectionWithPerson);
        printTime("заполнение HashSet объектами Person", time3);
        long time4 = measureTime(personTreeSet, amount, CollectionUtils::fillCollectionWithPerson);
        printTime("заполнение TreeSet объектами Person", time4);

        // сортировка сортируемых коллекций средствами jdk
        long time5 = measureTime(Comparator.<Person,Integer>comparing((o) -> o.getPassword().length()).thenComparing(Person::getNick),personLinkedList::sort);
        printTime("сортировка LinkedList средствами JDK", time5);
        long time6 = measureTime(Comparator.comparing(Animal::getAge).thenComparing(Animal::getNick),animalArrayList::sort);
        printTime("сортировка ArrayList средствами JDK", time6);

        // сортировка сортируемых коллекций своим методом
        long time7 = measureTime(new PasswordLengthComparator().thenComparing(new NickComparator()),personLinkedList::sort);
        printTime("сортировка LinkedList своим методом", time7);
        long time8 = measureTime(new AgeComparator().thenComparing(new NickComparator()),animalArrayList::sort);
        printTime("сортировка ArrayList своим методом", time8);

        // итерирование коллекций при помощи итератора
        long time9 = measureTime(personLinkedList, CollectionUtils::iterateCollection);
        printTime("итерирование LinkedList при помощи итератора", time9);
        long time10 = measureTime(animalArrayList, CollectionUtils::iterateCollection);
        printTime("итерирование ArrayList при помощи итератора", time10);
        long time11 = measureTime(personHashSet, CollectionUtils::iterateCollection);
        printTime("итерирование HashSet при помощи итератора", time11);
        long time12 = measureTime(personTreeSet, CollectionUtils::iterateCollection);
        printTime("итерирование TreeSet при помощи итератора", time12);

        // итерирование коллекций при помощи обычного for
        long start1 = System.currentTimeMillis();
        for (int i = 0; i < personLinkedList.size(); i++) {
            personLinkedList.get(i);
        }
        long end1 = System.currentTimeMillis();
        printTime("итерирование LinkedList при помощи for", end1-start1);

        long start2 = System.currentTimeMillis();
        for (int i = 0; i < animalArrayList.size(); i++) {
            animalArrayList.get(i);
        }
        long end2 = System.currentTimeMillis();
        printTime("итерирование ArrayList при помощи for", end2-start2);

        //удаление элементов при помощи итератора
        long time13 = measureTime(personLinkedList, CollectionUtils::clearCollection);
        printTime("удаление элементов из LinkedList при помощи итератора", time13);
        long time14 = measureTime(animalArrayList, CollectionUtils::clearCollection);
        printTime("удаление элементов из ArrayList при помощи итератора", time14);
        long time15 = measureTime(personHashSet, CollectionUtils::clearCollection);
        printTime("удаление элементов из HashSet при помощи итератора", time15);
        long time16 = measureTime(personTreeSet, CollectionUtils::clearCollection);
        printTime("удаление элементов из TreeSet при помощи итератора", time16);

    }

    public static <T> long measureTime(Collection<T> collection, Integer amount, BiConsumer<Collection<T>,Integer> method) {
        long start = System.currentTimeMillis();
        method.accept(collection, amount);
        long end = System.currentTimeMillis();
        return end - start;
    }

    public static <T> long measureTime(T data, Consumer<T> method) {
        long start = System.currentTimeMillis();
        method.accept(data);
        long end = System.currentTimeMillis();
        return end - start;
    }

    public static void printTime(String str, long duration) {
        System.out.printf("Операция: %s - заняла %d миллисекунд\n",str, duration);
    }
}
