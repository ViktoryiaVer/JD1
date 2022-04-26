package home_work_4.pet;

import java.util.Objects;

/**
 * класс для тестирования методов сортировки
 */
public class Pet {
    private String name;
    private int age;

    public Pet(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * геттер для поля name
     * @return поле name
     */
    public String getName() {
        return name;
    }

    /**
     * геттер для поля age
     * @return поле age
     */
    public int getAge() {
        return age;
    }
    /**
     * выводит содержимое полей объекта Pet
     * @return значения полей объекта Pet в виде строки
     */
    @Override
    public String toString() {
        return "Pet{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    /**
     * сравнивает объект Pet с другим объектом
     * @param o объект, с которым сравнивается текущий объект
     * @return true, если объекты равны, false, если объекты не равны
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pet pet = (Pet) o;
        return age == pet.age && Objects.equals(name, pet.name);
    }

    /**
     * получает хэшкод объекта Pet (на основе полей name, age)
     * @return хэшкод объекта Pet (на основе полей name, age)
     */
    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
