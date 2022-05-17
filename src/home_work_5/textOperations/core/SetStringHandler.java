package home_work_5.textOperations.core;

import home_work_5.textOperations.api.ICollectionHandler;

import java.util.HashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * класс с методами для работы с Set<String>
 */
public class SetStringHandler implements ICollectionHandler {
    private final Set<String> strings;

    public SetStringHandler() {
        this.strings = new HashSet<>();
    }

    public Set<String> getStrings() {
        return strings;
    }

    /**
     * наполняет поле strings данными из строки
     * @param str строка типа Sting, на основе которой необходимо создать коллекцию
     */
    @Override
    public final void createCollectionFromString(String str) {

        String pattern = "(\\s*)(\\S+)(\\s*)";
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(str);

        while(m.find()) {
            this.strings.add(m.group(2));
        }
    }
}
