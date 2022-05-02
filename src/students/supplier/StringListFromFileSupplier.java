package students.supplier;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class StringListFromFileSupplier implements Supplier<List<String>> {
    private final String path;

    private static List<String> names;

    public StringListFromFileSupplier() {
        this.path = "D:\\Computer Science\\Java_Basics\\JD1\\HomeWork\\src\\students\\resources\\names.txt";
    }

    public StringListFromFileSupplier(String path) {
        this.path = path;
    }


    @Override
    public List<String> get() {
        try {
            Charset charset = StandardCharsets.UTF_8;
            names = new ArrayList<>(Files.readAllLines(Paths.get(this.path), charset));
        }
        catch(IOException e) {
            System.out.println("Произошла ошибка!");
        }
        return names;
    }
}
