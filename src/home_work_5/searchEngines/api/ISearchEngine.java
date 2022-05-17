package home_work_5.searchEngines.api;

/**
 * интерфейс с методом для поиска слов в тексте
 */

public interface ISearchEngine {
    /**
     * осуществляет поиск слова в тексте
     * @param text текст типа String, в котором необходимо найти слово
     * @param word слово типа String, которое необходимо найти
     * @return количество совпадений в тексте типа long
     */
    long search(String text, String word);
}
