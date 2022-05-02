package students.supplier;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.function.Supplier;

public class RandomNameFromListSupplier implements Supplier<String> {
    private final List<String> names;

    private final ThreadLocalRandom rnd = ThreadLocalRandom.current();

    private final int from;
    private final int to;

    public RandomNameFromListSupplier(int from, int to) {
        this.from = from;
        this.to = to;
        this.names = new StringListFromFileSupplier().get();
    }

    public RandomNameFromListSupplier(List<String> names, int from, int to) {
        this.names = names;
        this.from = from;
        this.to = to;
    }

    @Override
    public String get() {
        int size = this.names.size();
        String name;
        do {
            name = this.names.get(rnd.nextInt(size));
        } while(name.length() < from || name.length() > to);
        return name;
    }
}
