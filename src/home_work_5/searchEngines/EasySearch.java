package home_work_5.searchEngines;

import home_work_5.searchEngines.api.ISearchEngine;
import home_work_5.supplier.FormattedStringSupplier;

import java.util.function.Supplier;

public class EasySearch implements ISearchEngine {

    @Override
    public long search(String text, String word) {
        //Supplier<String> supplier = new FormattedStringSupplier(text);
        //text = supplier.get();

        int index = 0;
        long count = 0;

        while(index!= -1) {
            index = text.indexOf(word, index);

            if(index!=-1) {
                char next = index + word.length() >= text.length()-1 ?  0 : text.charAt(index + word.length());
                char last = index != 0? text.charAt(index-1) : 0;

                if((!isWordSymbol(next) || next == 0) && ((!isWordSymbol(last) || last == 0))) {
                    count++;
                }

                index += word.length()+1;
            }
        }

        return count;
    }

    public static boolean isWordSymbol(char ch) {
        return Character.isLetterOrDigit(ch) || ch == '-';
    }
}
