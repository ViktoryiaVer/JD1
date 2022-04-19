package home_work_3.calcs.adapter;

/**
 * класс для проверки строки с математическим выражением на невалидные символы
 */
public class StringExpressionChecker {
    private static final String SYMBOLS_PATTERN = "([\\d-+*/^|()]*[PI|pi]*[E|e]*[.,]*)*";

    /**
     * проверяет, все ли символы в строке валидны
     * @param str строка, которую необходимо проверить
     * @return true, если все символы корректны, false, если есть невалидные символы
     */
    public boolean hasCorrectSymbols(String str) {
        return str.replaceAll(" +", "").matches(SYMBOLS_PATTERN);
    }


}
