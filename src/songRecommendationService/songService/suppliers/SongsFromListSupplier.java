package songRecommendationService.songService.suppliers;

import songRecommendationService.songService.dto.Song;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class SongsFromListSupplier implements Supplier<List<Song>> {

    private final List<String> strings;

    public SongsFromListSupplier() {
        this.strings = new ArrayList<>(List.of("ДДТ - Это всё - рок, фолк - тренировка, весна - 300", "ДДТ - Что такое осень - рок - тренировка - 340",
                "Наутилус Помпилиус - Я хочу быть с тобой - лирика - лирическое - 245"));
    }

    public SongsFromListSupplier(List<String> strings) {
        this.strings = strings;
    }


    @Override
    public List<Song> get() {

        List<Song> songs = new ArrayList<>();
        for (String string : strings) {
            Song song = new Song();
            String [] parts = string.split(" - ");
            song.setPerformer(parts[0]);
            song.setName(parts[1]);

            String [] genres = parts[2].split(" *, *");
            for (String genre : genres) {
                song.getGenres().add(genre);
            }

            String [] moods = parts[3].split(" *, *");
            for (String mood : moods) {
                song.getMoods().add(mood);
            }

            song.setDuration(Integer.parseInt((parts[4])));
            songs.add(song);
        }
        return songs;
    }
}
