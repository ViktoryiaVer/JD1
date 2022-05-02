package students.supplier;

import java.util.concurrent.ThreadLocalRandom;
import java.util.function.Supplier;

public class RusNameFromRandomCharacterSupplier implements Supplier<String> {

    private final ThreadLocalRandom rnd = ThreadLocalRandom.current();

    private final int from;
    private final int to;

    public RusNameFromRandomCharacterSupplier(int from, int to) {
        this.from = from;
        this.to = to;
    }

    @Override
    public String get() {
        StringBuilder builder = new StringBuilder();
        int count = rnd.nextInt(from, to);

        for (int i = 0; i < count; i++) {
            builder.append((char)rnd.nextInt(1072, 1103));
        }

        return builder.toString();
    }
}
