package home_work_5.textOperations.api;

/**
 * интерфейс для обработки строк
 */
public interface IStringHandler {

    /**
     * удаляет знаки пунктуации и лишние пробельные символы из строки
     * @param str строка типа String, из которой необходимо удалить нежелательные символы
     * @return обработанная строка без лишних символов типа String
     */
    default String deletePunctuationAndExtraWhitespaces(String str) {
        String punctuation = "-\\s+|\\s+-|--|_|[^\\wа-яА-ЯЁёÄäÜüÖöß-]";
        str = str.replaceAll(punctuation," ");
        str = str.replaceAll("\\s{2,}", " ");
        return str.trim();
    }
}
