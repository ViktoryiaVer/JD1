package home_work_5.runners;

import home_work_5.textOperations.core.TextHandler;

/**
 * класс с точкой входа для для объектов и методов классов из пакета textOperations
 */

public class TextHandlerMain {
    public static void main(String[] args) {
        String path2 = "D:\\Computer Science\\Java_Basics\\JD1\\HomeWork\\src\\home_work_5\\resources\\warAndPeace\\Война и мир_книга.txt";
        TextHandler textHandler = new TextHandler();
        int wordsCount = textHandler.countWordsInText(path2);
        System.out.println("Количество слов в книге: " + wordsCount);

        System.out.println("Топ слов в книге:\n" + textHandler.printTopWordsInText(path2,10));
    }
}
