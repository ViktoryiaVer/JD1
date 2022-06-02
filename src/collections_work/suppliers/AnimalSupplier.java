package collections_work.suppliers;

import collections_work.dto.Animal;

import java.util.concurrent.ThreadLocalRandom;
import java.util.function.Supplier;

public class AnimalSupplier implements Supplier<Animal> {

    @Override
    public Animal get() {
        ThreadLocalRandom random = ThreadLocalRandom.current();
        return new Animal(random.nextInt(1,16), new NickFromArraySupplier().get());
    }
}
