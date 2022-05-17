package home_work_5.runners;

import home_work_5.fileOperations.FileService;
import home_work_5.searchEngines.EasySearch;
import home_work_5.searchEngines.api.ISearchEngine;
import home_work_5.textOperations.supplier.StringFromFileSupplier;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * класс с точкой входа и методами для работы с файлами
 */
public class FileMain {
    private static final Scanner console = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        FileService service = new FileService();
        String pathFromUser = service.getFilePathFromConsole();
        File[] files = service.getFileArray();

        String answer;

        do {
            service.listFilesInDirectory();
            String bookPath = getBookFromUser(files);

            if(bookPath == null) {
                return;
            }

            do {
                String word = getWord();

                String textFromFile = String.valueOf(new StringFromFileSupplier(bookPath).get());
                ISearchEngine searchEngine = new EasySearch();
                long count = searchEngine.search(textFromFile, word);


                sb.append(bookPath.replace(pathFromUser + "\\", "")).append(" - ").append(word).append(" - ").append(count).append("\n");

                answer = getChosenAction();

            } while ("1".equals(answer));
        } while(!"3".equals(answer));

        service.writeResultsInFile(String.valueOf(sb));

    }

    /**
     * получает файл-книгу из консоли из перечня файлов
     * @param files массив объектов типа File, из которых необходимо выбрать один
     * @return путь к выбранному файлу типа String
     */
    public static String getBookFromUser(File[] files) {
        System.out.println("Выберите файл, в котором Вы хотите найти слово");
        String book = console.nextLine();

        String bookPath = null;
        boolean wasFound = false;
        for(File file1 : files) {
            if(book.equals(file1.getName())) {
                bookPath = file1.getAbsolutePath();
                wasFound = true;
                break;
            }
        }

        if(!wasFound) {
            System.out.println("Такой книги в папке нет.");
        }
        return bookPath;
    }

    /**
     * получает слово для поиска из консоли
     * @return слово для поиска типа String
     */
    public static String getWord() {
        System.out.println("Выберите слово, которое Вы хотите найти в книге:");
        return console.nextLine();
    }

    /**
     * получает номер действия пользователя из консоли
     * @return номер действия типа String
     */
    public static String getChosenAction() {
        System.out.println("Выберите действие: 1 - ввести слово для поиска; 2 - вернуться к выбору файла; 3 - выйти");
        return console.nextLine();
    }
}
