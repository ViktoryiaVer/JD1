package home_work_5;

import home_work_5.comparator.ListComparatorByKey;
import home_work_5.comparator.ListComparatorByValue;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringOperations {

    public static Set<String> stringToSet(String str) {
        Set<String> strings = new HashSet<>();
        String pattern = "(\\s*)(\\S+)(\\s*)";
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(str);
        while(m.find()) {
            strings.add(m.group(2));
        }
        return strings;
        //return new HashSet<>(Arrays.asList(str.split(" "))); // не оптимальный способ
    }

    public static Map<String, Integer> stringToMap(String str) {
        Map<String, Integer> countedWords= new HashMap<>();
        String pattern = "(\\s*)(\\S+)(\\s*)";
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(str);
        while(m.find()) {
            String word = m.group(2);
            countedWords.putIfAbsent(word,0);
            countedWords.put(word,countedWords.get(word)+1);
        }
        return countedWords;

    }

    public static String printTop(List<Map.Entry<String,Integer>> entryList, int count) {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, Integer> entry : entryList) {
            if(count-- <= 0) {
                break;
            }
            sb.append(entry.getKey()).append(" - ").append(entry.getValue());
            if(count!= 0) {
                sb.append("\n");
            }
        }
        return String.valueOf(sb);
    }

    public static List<Map.Entry<String,Integer>> mapToList(Map<String,Integer> map) {
        List<Map.Entry<String,Integer>> mapAsList = new ArrayList<>(map.entrySet());
        mapAsList.sort(new ListComparatorByValue().reversed().thenComparing(new ListComparatorByKey()));
        return mapAsList;
    }
}
