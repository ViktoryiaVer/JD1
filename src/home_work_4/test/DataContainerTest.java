package home_work_4.test;

import home_work_4.DataContainer;
import home_work_4.comparator.ComparableComparator;
import home_work_4.pet.Pet;
import home_work_4.pet.comparator.PetComparatorName;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static home_work_4.DataContainer.sort;

public class DataContainerTest {
    @Test
    public void addOneElement() {
        DataContainer<Integer> container = new DataContainer<>(new Integer[]{1, 2, 3, null, null, null});
        Integer int1 = 777;
        int i = container.add(int1);

        Assertions.assertEquals(int1, container.get(i));
        Assertions.assertArrayEquals(new Integer[]{1, 2, 3, 777, null, null}, container.getItems());
    }

    @Test
    public void addNull() {
        DataContainer<Integer> container = new DataContainer<>(new Integer[]{1, 2, 3, null, null, null});
        Integer int1 = null;
        int i = container.add(int1);

        Assertions.assertEquals(-1, i);
        Assertions.assertArrayEquals(new Integer[]{1, 2, 3, null, null, null}, container.getItems());
    }

    @Test
    public void addOneElementAsSecond() {
        DataContainer<Integer> container = new DataContainer<>(new Integer[]{1, null, 3, null, null, null});
        Integer int1 = 777;
        int i = container.add(int1);

        Assertions.assertEquals(int1, container.get(i));
        Assertions.assertArrayEquals(new Integer[]{1, 777, 3, null, null, null}, container.getItems());
    }

    @Test
    public void addTwoElementsToTheEnd() {
        DataContainer<Integer> container = new DataContainer<>(new Integer[]{1, 2, 3});
        Integer int1 = 777;
        Integer int2 = 0;
        int i = container.add(int1);
        int i2 = container.add(int2);

        Assertions.assertEquals(int1, container.get(i));
        Assertions.assertEquals(int2, container.get(i2));
        Assertions.assertArrayEquals(new Integer[]{1, 2, 3, 777, 0}, container.getItems());
    }

    @Test
    public void addOneNegativeElementToEmptyArray() {
        DataContainer<Integer> container = new DataContainer<>(new Integer[]{});
        Integer int1 = -777;
        int i = container.add(int1);

        Assertions.assertEquals(int1, container.get(i));
        Assertions.assertArrayEquals(new Integer[]{-777}, container.getItems());
    }


    @Test
    public void getIndexOfSingleElement() {
        DataContainer<Integer> container = new DataContainer<>(new Integer[]{});
        container.add(999);

        Assertions.assertEquals(999, container.get(0));
    }

    @Test
    public void getIndexOfNonExistingElement() {
        DataContainer<Integer> container = new DataContainer<>(new Integer[]{999});

        Assertions.assertNull(container.get(1));
    }
    @Test
    public void getIndexNegative() {
        DataContainer<Integer> container = new DataContainer<>(new Integer[]{999});

        Assertions.assertNull(container.get(-10));
    }

    @Test
    public void deleteOneElementByIndex() {
        DataContainer<Integer> container = new DataContainer<>(new Integer[]{1, 2, 3, 777});

        Assertions.assertTrue(container.delete(3));
        Assertions.assertArrayEquals(new Integer[]{1, 2, 3}, container.getItems());
    }

    @Test
    public void deleteOneNonExistingElementByIndex() {
        DataContainer<Integer> container = new DataContainer<>(new Integer[]{1, 2, 3, 777});

        Assertions.assertFalse(container.delete(9));
        Assertions.assertArrayEquals(new Integer[]{1, 2, 3, 777}, container.getItems());
    }

    @Test
    public void deleteOneNotLastElementByIndex() {
        DataContainer<Integer> container = new DataContainer<>(new Integer[]{1, 2, 3, 777});

        Assertions.assertTrue(container.delete(2));
        Assertions.assertArrayEquals(new Integer[]{1, 2, 777}, container.getItems());
    }


    @Test
    public void deleteOneElement() {
        DataContainer<Integer> container = new DataContainer<>(new Integer[]{1, 2, 3, 777});

        Assertions.assertTrue(container.delete((Integer)777));
        Assertions.assertArrayEquals(new Integer[]{1, 2, 3}, container.getItems());
    }

    @Test
    public void deleteOneNonExistingElement() {
        DataContainer<Integer> container = new DataContainer<>(new Integer[]{1, 2, 3, 777});

        Assertions.assertFalse(container.delete((Integer)111));
        Assertions.assertArrayEquals(new Integer[]{1, 2, 3, 777}, container.getItems());
    }

    @Test
    public void deleteOneNotLastElement() {
        DataContainer<Integer> container = new DataContainer<>(new Integer[]{1, 2, 3, 777, 3});

        Assertions.assertTrue(container.delete(3));
        Assertions.assertArrayEquals(new Integer[]{1, 2, 3,3}, container.getItems());
    }


    @Test
    public void sortIntegerWithComparator() {
        DataContainer<Integer> container = new DataContainer<>(new Integer[]{1, -5, 10, 777, 13});
        container.sort(new ComparableComparator<>());
        Assertions.assertArrayEquals(new Integer[]{-5, 1, 10, 13, 777}, container.getItems());
    }

    @Test
    public void sortIntegerWithComparatorReversed() {
        DataContainer<Integer> container = new DataContainer<>(new Integer[]{1, 0, 0, 777, 777});
        container.sort(new ComparableComparator<Integer>().reversed());
        Assertions.assertArrayEquals(new Integer[]{777, 777, 1, 0, 0}, container.getItems());
    }


    @Test
    public void sortStringWithDataContainer() {
        DataContainer<String> container = new DataContainer<>(new String[]{"Привет", "Как дела?", " ", "Работаю", "Пока"});
        DataContainer.sort(container);
        Assertions.assertArrayEquals(new String[]{" ", "Как дела?",  "Пока", "Привет", "Работаю"}, container.getItems());
    }

    @Test
    public void sortStringWithDataContainerEmpty() {
        DataContainer<String> container = new DataContainer<>(new String[]{});
        container.sort(new ComparableComparator<>());
        Assertions.assertArrayEquals(new String[]{}, container.getItems());
    }


    @Test
    public void sortPetWithDataContainerAndComp() {
        Pet[] pets = new Pet[] {new Pet("Шарик", 1), new Pet("Мурзик", 2), new Pet("Рыжик", 1)};
        DataContainer<Pet> container = new DataContainer<>(pets);
        sort(container, new PetComparatorName());
        Pet[] sortedPetsExp = {new Pet("Мурзик", 2), new Pet("Рыжик", 1), new Pet("Шарик", 1)};
        Assertions.assertArrayEquals(sortedPetsExp, container.getItems());
    }

    @Test
    public void sortPetWithDataContainerAndCompReversed() {
        Pet[] pets = new Pet[] {new Pet("Шарик", 1), new Pet("Мурзик", 2), new Pet("Рыжик", 1)};
        DataContainer<Pet> container = new DataContainer<>(pets);
        sort(container, new PetComparatorName().reversed());
        Pet[] sortedPetsExp = {new Pet("Шарик", 1), new Pet("Рыжик", 1), new Pet("Мурзик", 2)};
        Assertions.assertArrayEquals(sortedPetsExp, container.getItems());
    }


    @Test
    public void toStringWithNulls() {
        DataContainer<Integer> container = new DataContainer<>(new Integer[]{1, 2, 3, null, null});
        String toStrExp = "[1, 2, 3]";
        Assertions.assertEquals(toStrExp, container.toString());
    }

    @Test
    public void toStringWithNullsInTheMiddle() {
        DataContainer<Integer> container = new DataContainer<>(new Integer[]{1, null, 3, null, 5});
        String toStrExp = "[1, 3, 5]";
        Assertions.assertEquals(toStrExp, container.toString());
    }

    @Test
    public void toStringWithOnlyNull() {
        DataContainer<Integer> container = new DataContainer<>(new Integer[]{null});
        String toStrExp = "[]";
        Assertions.assertEquals(toStrExp, container.toString());
    }
}
