package home_work_4;

import home_work_4.comparator.ComparableComparator;
import home_work_4.pet.Pet;
import home_work_4.pet.comparator.PetComparatorAge;
import home_work_4.pet.comparator.PetComparatorName;

import java.util.Arrays;

import static home_work_4.DataContainer.sort;

public class DataContainerMain {
    public static void main(String[] args) {
        DataContainer<String> container = new DataContainer<>(new String[0]);

        //задание 4
        int index1 = container.add("Привет");
        container.add("Как дела");
        container.add("Работаю");
        container.add("Давай потом");
        container.add("Нет, давай сейчас!");
        container.add("Мне бежать пора, прости:(");
        container.add("Не звони мне больше!");

        // задание 5, 7, 8
        container.delete(index1); // удаляем Привет
        container.delete(container.get(index1)); // удаляем Как дела
        System.out.println((container.get(index1))); //Работаю

        // задание 6, 9, 10
        System.out.println("Элементы до сортировки: " + Arrays.toString(container.getItems()));
        container.sort(new ComparableComparator<>());
        System.out.println("Элементы после сортировки: " + container);

        // вариант с передачей реализации Comparator без создания отдельного класса и с использованием более NPI-friendly версии
        //container.sort(Comparator.nullsLast(Comparator.comparing(String -> String)));

        // задание 11
        DataContainer<Integer> container2 = new DataContainer<>(new Integer[]{10, 15, 40, 3, -1});
        System.out.println("Элементы до сортировки: " + Arrays.toString(container2.getItems()));
        sort(container2);
        System.out.println("Элементы после сортировки: " + container2);

        // задание 12
        Pet[] pets = new Pet[] {new Pet("Шарик", 1), new Pet("Мурзик", 2), new Pet("Рыжик", 1)};
        DataContainer<Pet> container3 = new DataContainer<>(pets);

        System.out.println("Элементы до сортировки: " + Arrays.toString(container3.getItems()));

        sort(container3, new PetComparatorName().thenComparing(new PetComparatorAge()));
        System.out.println("Элементы после сортировки: " + container3);

        // вариант с передачей реализации Comparator без создания отдельного класса и с использованием более NPI-friendly версии
        // sort(container3, Comparator.nullsLast(Comparator.comparing(String -> String)));

        // задание 13
        for (Pet pet : container3) {
            System.out.println(pet);
        }
    }
}
