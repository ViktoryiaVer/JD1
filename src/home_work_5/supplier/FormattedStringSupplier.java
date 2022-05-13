package home_work_5.supplier;

import java.util.function.Supplier;

public class FormattedStringSupplier implements Supplier<String> {
    private final String str;

    public FormattedStringSupplier(String str) {
        this.str = str;
    }

    @Override
    public String get() {
        String punctuation = "-\\s+|\\s+-|--|_|[^\\wа-яА-ЯЁё-]";
        String temp = str.replaceAll(punctuation," ");
        temp = temp.replaceAll("\\s{2,}", " ");

        return temp.trim();
    }
}
