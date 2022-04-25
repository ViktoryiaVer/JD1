package home_work_4.pet.comparator;

import home_work_4.pet.Pet;

import java.util.Comparator;

/**
 * класс с реализацией Comparator для сравнения Pet по возрасту
 */
public class PetComparatorAge implements Comparator<Pet> {
    @Override
    public int compare(Pet o1, Pet o2) {
        return  o2.getAge()-o1.getAge();
    }
}
