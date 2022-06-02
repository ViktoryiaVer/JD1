package collections_work.suppliers;

import java.util.concurrent.ThreadLocalRandom;
import java.util.function.Supplier;

public class PasswordFromRandomCharactersSupplier implements Supplier<String> {
    private final int from;
    private final int to;

    public PasswordFromRandomCharactersSupplier(int from, int to) {
        this.from = from;
        this.to = to;
    }

    @Override
    public String get() {
        ThreadLocalRandom random = ThreadLocalRandom.current();
        StringBuilder builder = new StringBuilder();
        int count = random.nextInt(from, to);

        for (int i = 0; i < count; i++) {
            builder.append((char)random.nextInt(33, 123));
        }

        return builder.toString();
    }
}
