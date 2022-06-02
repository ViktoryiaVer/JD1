package collections_work.suppliers;

import collections_work.dto.Person;

import java.util.function.Supplier;

public class PersonSupplier implements Supplier<Person> {

    @Override
    public Person get() {
        return new Person(new NickFromArraySupplier().get(),new PasswordFromRandomCharactersSupplier(5, 11).get());
    }

}
