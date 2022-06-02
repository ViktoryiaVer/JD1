package collections_work.suppliers;

import java.util.concurrent.ThreadLocalRandom;
import java.util.function.Supplier;

public class NickFromArraySupplier implements Supplier<String> {
    private final String[] nicks;

    public NickFromArraySupplier() {
        this.nicks = new String[] {"Василий", "Нюша", "Сева", "Григорий", "Дуся", "Перс", "Масяня", "Аврора",
        "Ихтиандр", "Кася", "Василина", "Серый", "Кит", "Псина"};
    }

    public NickFromArraySupplier(String[] nicks) {
        this.nicks = nicks;
    }


    @Override
    public String get() {
        ThreadLocalRandom random = ThreadLocalRandom.current();
        return this.nicks[random.nextInt(this.nicks.length)];
    }
}
