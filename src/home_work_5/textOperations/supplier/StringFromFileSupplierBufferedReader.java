package home_work_5.textOperations.supplier;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.function.Supplier;

/**
 * класс с реализацией интерфейса Supplier для получение текста из файла в виде String при помощи BufferedReader
 */
public class StringFromFileSupplierBufferedReader implements Supplier<String> {
    private final String path;

    public StringFromFileSupplierBufferedReader(String path) {
        this.path = path;
    }

    /**
     * получает текст из файла
     * @return текст из файла в виде String
     */
    @Override
    public String get() {
        StringBuilder builder = new StringBuilder();

        try(BufferedReader reader = new BufferedReader(new FileReader(path))){
            String str;
            while((str = reader.readLine()) != null){
                builder.append(str).append("\n");
            }
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден!");
        } catch (IOException e){
            System.out.println("Ошибка при чтении файла.");
        }
        return builder.toString();
    }
}
