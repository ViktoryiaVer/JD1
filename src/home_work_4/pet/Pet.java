package home_work_4.pet;

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
}
