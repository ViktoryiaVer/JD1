package songRecommendationService.songService.predicates;

import songRecommendationService.songService.dto.Song;

import java.util.Objects;
import java.util.function.Predicate;

public class GenrePredicate implements Predicate<Song> {
    private final String genre;

    public GenrePredicate(String genre) {
        this.genre = genre;
    }

    @Override
    public boolean test(Song song) {
        for (String genre : song.getGenres()) {
            if(Objects.equals(genre,this.genre)) {
                return true;
            }
        }
        return false;
    }
}
