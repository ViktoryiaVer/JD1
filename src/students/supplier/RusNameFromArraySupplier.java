package students.supplier;

import java.util.function.Supplier;

public class RusNameFromArraySupplier implements Supplier<String> {
    private static final String[] names = new String[]{
            "Аарон",
            "Абдул",
            "Абдулла",
            "Август",
            "Августа",
            "Августин",
            "Августина",
            "Авдей",
            "Авдотья",
            "Авелина",
            "Авигея",
            "Авраам",
            "Аврора",
            "Автандил",
            "Агата",
            "Агафон",
            "Агафья",
            "Аглая",
            "Агнесса",
            "Агния",
            "Агриппина",
            "Адам",
            "Аделаида",
            "Аделина",
            "Аделия",
            "Адольф",
            "Адриана",
            "Аза",
            "Азалия",
            "Айгуль",
            "Айлин",
            "Айнур",
            "Акакий",
            "Аким",
            "Аксель",
            "Аксиния",
            "Аксинья",
            "Акулина",
            "Алан",
            "Алевтина",
            "Александр",
            "Александра"
    };

    private final Supplier<String> namesSupplier;

    public RusNameFromArraySupplier(int from, int to) {
        this.namesSupplier = new StringFromArraySupplier(names, from, to);
    }

    @Override
    public String get() {
        return namesSupplier.get();
    }

}
