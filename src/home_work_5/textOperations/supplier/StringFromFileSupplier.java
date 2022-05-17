package home_work_5.textOperations.supplier;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.function.Supplier;

/**
 * класс с реализацией интерфейса Supplier для получение текста из файла в виде String
 */
public class StringFromFileSupplier implements Supplier<String> {
    private final String path;

    public StringFromFileSupplier(String path) {
        this.path = path;
    }

    /**
     * получает текст из файла
     * @return текст из файла в виде String
     */
    @Override
    public String get() {
        StringBuilder builder = new StringBuilder();
        int c = -1;

        try(FileReader reader = new FileReader(path)){
            while ((c = reader.read()) != -1){
                builder.append((char) c);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден!");
        } catch (IOException e){
            System.out.println("Ошибка при чтении файла.");
        }
        return builder.toString();
    }
}
