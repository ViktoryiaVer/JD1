package songRecommendationService.songService.suppliers;

import songRecommendationService.songService.dto.Song;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class SongsFromFileSupplier implements Supplier<List<Song>> {
    private final String path;

    public SongsFromFileSupplier(String path) {
        this.path = path;
    }

    @Override
    public List<Song> get() {
        List<String> strings = new ArrayList<>();
        try(BufferedReader reader = new BufferedReader(new FileReader(path))){
            String str;
            while((str = reader.readLine()) != null){
                strings.add(str);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден!");
        } catch (IOException e){
            System.out.println("Ошибка при чтении файла.");
        }
        return new SongsFromListSupplier(strings).get();
    }
}
