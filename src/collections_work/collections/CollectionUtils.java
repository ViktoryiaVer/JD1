package collections_work.collections;

import collections_work.dto.Animal;
import collections_work.dto.Person;
import collections_work.suppliers.AnimalSupplier;
import collections_work.suppliers.PersonSupplier;

import java.util.Collection;
import java.util.Iterator;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class CollectionUtils {

    private static <T> void fillCollection(Integer amount, Collection<T> collection, Supplier<T> supplier) {
        Stream.generate(supplier)
                .limit(amount)
                .forEach(collection::add); // forEach((a) -> collection.add(a)) - вариант с лямбдой
    }

    public static void fillCollectionWithPerson(Collection<Person> collection, Integer amount) {
        Supplier<Person> supplier = new PersonSupplier();
        fillCollection(amount, collection,supplier);
    }

    public static void fillCollectionWithAnimal(Collection<Animal> collection, Integer amount) {
        Supplier<Animal> supplier = new AnimalSupplier();
        fillCollection(amount, collection, supplier);
    }

    public static <T> void iterateCollection(Collection<T> collection) {
        Iterator<T> iterator = collection.iterator();

        while(iterator.hasNext()) {
            iterator.next();
        }
    }

    public static <T> void clearCollection(Collection<T> collection) {
        Iterator<T> iterator = collection.iterator();

        while(iterator.hasNext()) {
            iterator.next();
            iterator.remove();
        }
    }

}
