package songRecommendationService.songService;

import songRecommendationService.songService.dto.Song;
import songRecommendationService.songService.predicates.GenrePredicate;
import songRecommendationService.songService.predicates.MoodPredicate;

import java.util.*;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class SongService {
    private List<Song> songList;


    public SongService() {
        this.songList = new ArrayList<>();
    }

    public SongService(List<Song> songList) {
        this.songList = songList;
    }

    public List<Song> getSongList() {
        return songList;
    }

    public void downloadSongList (Supplier<List<Song>> supplier) {
        this.songList = supplier.get();
    }

    public List<Song> filterSong(Predicate<Song> predicate) {
        List<Song> filteredSongs = new ArrayList<>();

        for (Song song : this.songList) {
            if(predicate.test(song)) {
                filteredSongs.add(song);
            }
        }
        return filteredSongs;
    }


    public Set<Song> getRecommendationSongs(String name, boolean filterGenre, boolean filterMood) {
        boolean wasFound = false;
        Set<Song> recommended = new HashSet<>();

        for (Song song : songList) {
            if(Objects.equals(song.getName(), name)) {
                recommended.add(song);
                wasFound = true;
                if(filterGenre) {
                    for (String genre : song.getGenres()) {
                        recommended.addAll(filterSong(new GenrePredicate(genre)));
                    }
                }
                if(filterMood) {
                    for (String mood : song.getMoods()) {
                        recommended.addAll(filterSong(new MoodPredicate(mood)));
                    }
                }
            }
        }
        if(!wasFound) {
            throw new IllegalArgumentException("Песни с таким названием у нас нет. Проверьте ввод");
        }
        return recommended;
    }
}
