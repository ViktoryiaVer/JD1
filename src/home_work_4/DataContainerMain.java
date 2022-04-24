package home_work_4;

import static home_work_4.DataContainer.sort;

public class DataContainerMain {
    public static void main(String[] args) {
        DataContainer<String> container = new DataContainer<>(new String[0]);

        //задание 4
        int index1 = container.add("Привет");
        int index2 = container.add("Как дела");
        int index3 = container.add("Работаю");
        int index4 = container.add("Давай потом");
        int index5 = container.add("Нет, давай сейчас!");
        int index6 = container.add("Мне бежать пора, прости:(");
        int index7 = container.add("Не звони мне больше!");

        //задание 5
        String text1 = container.get(index1);
        String text2 = container.get(index2);
        String text3 = container.get(index3);
        String text4 = container.get(index4);
        String text5 = container.get(index5);
        String text6 = container.get(index6);
        String text7 = container.get(index7);

        System.out.println((text1)); //Привет
        System.out.println((text2)); //Как дела
        System.out.println((text3)); //Работаю
        System.out.println((text4)); //Давай потом
        System.out.println((text5)); //Нет, давай сейчас!
        System.out.println((text6)); //Мне бежать пора, прости...
        System.out.println((text7)); //Не звони мне больше!

        // задание 6
        //String[] data = container.getItems();

        // задание 7, 8
        container.delete(text1); // удаляем Привет
        container.delete(index1); // удаляем Как дела
        System.out.println((container.get(index1))); //Работаю

        // задание 9, 10
        container.sort(new StringComparator());
        System.out.println(container);
        // вариант с передачей реализации Comparator без создания отдельного класса и с использованием более NPI-friendly версии
        // container.sort(Comparator.nullsFirst(Comparator.comparing(String -> String)));

        // задание 11
        sort(container);

        // задание 12
        sort(container, new StringComparator());
        // вариант с передачей реализации Comparator без создания отдельного класса и с использованием более NPI-friendly версии
        // sort(container, Comparator.nullsFirst(Comparator.comparing(String -> String)));

        // задание 13
        for(String s : container) {
            System.out.println(s);
        }
    }
}
