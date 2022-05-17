package home_work_5.searchEngines;

import home_work_5.searchEngines.api.ISearchEngine;

/**
 * класс с реализацией интерфейса ISearchEngine: поиск осуществляется при помощи метода indexOf
 */
public class EasySearch implements ISearchEngine {

    /**
     * осуществляет поиск при помощи метода indexOf
     * @param text текст типа String, в котором необходимо найти слово
     * @param word слово типа String, которое необходимо найти
     * @return количество совпадений типа long
     */
    @Override
    public long search(String text, String word) {

        int index = 0;
        long count = 0;

        while(index!= -1) {
            index = text.indexOf(word, index);

            if(index!=-1) {
                char next = index + word.length() >= text.length()-1 ?  0 : text.charAt(index + word.length());
                char last = index != 0? text.charAt(index-1) : 0;

                if((isNonWordSymbol(next) || next == 0) && ((isNonWordSymbol(last) || last == 0))) {
                    count++;
                }

                index += word.length()+1;
            }
        }
        return count;
    }

    /**
     * проверяет, является ли символ несловным
     * @param ch символ типа сhar, который необходимо проверить
     * @return true, если символ является несловным, false, если символ буква или цифра
     */
    private static boolean isNonWordSymbol(char ch) {
        return !Character.isLetterOrDigit(ch) && ch != '-';
    }
}
