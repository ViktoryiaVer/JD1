package students.supplier;

import java.util.concurrent.ThreadLocalRandom;
import java.util.function.Supplier;

public class StringFromArraySupplier implements Supplier<String> {
    private final ThreadLocalRandom rnd = ThreadLocalRandom.current();

    private final String[] names;
    private final int from;
    private final int to;

    public StringFromArraySupplier(String[] names, int from, int to) {
        this.names = names;
        this.from = from;
        this.to = to;
    }

    @Override
    public String get() {
        String name;
        do {
            name = names[rnd.nextInt(names.length)];
        } while (name.length() < from || name.length() > to);

        return name;
    }
}