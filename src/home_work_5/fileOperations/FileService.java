package home_work_5.fileOperations;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileService {
    private static final Scanner console = new Scanner(System.in);

    private File file;

    /**
     * получает путь к файлу из консоли
     * @return путь к файле типа String
     */
    public String getFilePathFromConsole() {
        String path;
        do {
            System.out.println("Введите путь к папке с книгами");

            path = console.nextLine();
            this.file = new File(path);
        } while(!this.file.isDirectory());
        return path;
    }

    /**
     * получает массив обхектов типа File
     * @return массив обхектов типа File
     */
    public File[] getFileArray() {
        return this.file.listFiles();
    }

    /**
     * перечисляет файлы в директории: если файлов в директории нет, то пользователь получает соответствующее сообщение
     */
    public void listFilesInDirectory() {
        if((this.getFileArray() != null ? this.getFileArray().length : 0) == 0) {
            System.out.println("В Вашей папке нет файлов.");
            return;
        }

        System.out.println("В Вашей папке находятся следующие книги:");

        for (File file1 : this.getFileArray()) {
            System.out.println(file1.getName());
        }
    }

    /**
     * записывает результаты поисков в файл
     * @param str результаты поисков в виде String
     */
    public void writeResultsInFile(String str) {
        String pathForResults = "D:\\Computer Science\\Java_Basics\\JD1\\HomeWork\\src\\home_work_5\\resources\\result.txt";
        try (FileWriter fileWriter = new FileWriter(pathForResults)) {
            try {
                fileWriter.write(str);
            } catch (IOException ex){
                System.out.println("Ошибка при записи файла");
            }
        } catch (IOException ex){
            System.out.println("Ошибка при создании файла: " + ex.getMessage());
        }
    }
}
