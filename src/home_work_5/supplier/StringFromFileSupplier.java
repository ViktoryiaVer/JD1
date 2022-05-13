package home_work_5.supplier;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.function.Supplier;

import static java.lang.System.in;

public class StringFromFileSupplier implements Supplier<String> {
    private final String path;

    public StringFromFileSupplier(String path) {
        this.path = path;
    }

    public StringFromFileSupplier() {
        this.path = "D:\\Computer Science\\Java_Basics\\JD1\\HomeWork\\src\\home_work_5\\resources\\fragment.txt";
    }

    @Override
    public String get() {
        String text = "";
        try {
            Path path = Path.of(this.path);
            Charset charset = StandardCharsets.UTF_8;
            text = Files.readString(path, charset);
            in.close();
        }
        catch(IOException ex) {
            System.out.println("Ошибка чтения файла!");
        }
        return text;
    }
}
