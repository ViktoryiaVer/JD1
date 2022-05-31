package songRecommendationService.songService.predicates;

import songRecommendationService.songService.dto.Song;

import java.util.Objects;
import java.util.function.Predicate;

public class MoodPredicate implements Predicate<Song> {
    private final String mood;

    public MoodPredicate(String mood) {
        this.mood = mood;
    }

    @Override
    public boolean test(Song song) {
        for (String mood : song.getMoods()) {
            if(Objects.equals(mood,this.mood)) {
                return true;
            }
        }
        return false;
    }
}
