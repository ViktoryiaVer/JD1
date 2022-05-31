package songRecommendationService.songService.dto;

import java.text.DecimalFormat;
import java.util.*;

public class Song {
    private String performer;
    private String name;
    private List<String> genres = new ArrayList<>();
    private List<String> moods  = new ArrayList<>();
    private int duration;

    public Song() {
    }

    public Song(String performer, String name, List<String> genres, List<String> moods, int duration) {
        this.performer = performer;
        this.name = name;
        this.genres = genres;
        this.moods = moods;
        this.duration = duration;
    }

    public String getPerformer() {
        return performer;
    }

    public String getName() {
        return name;
    }

    public List<String> getGenres() {
        return genres;
    }

    public List<String> getMoods() {
        return moods;
    }

    public int getDuration() {
        return duration;
    }

    public void setPerformer(String performer) {
        this.performer = performer;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGenres(List<String> genres) {
        this.genres = genres;
    }

    public void setMoods(List<String> moods) {
        this.moods = moods;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Song song = (Song) o;
        return duration == song.duration && Objects.equals(performer, song.performer) && Objects.equals(name, song.name) && Objects.equals(genres, song.genres) && Objects.equals(moods, song.moods);
    }

    @Override
    public int hashCode() {
        return Objects.hash(performer, name, genres, moods, duration);
    }

    @Override
    public String toString() {
        int durationInMinutes = this.duration / 60;
        int secondsLeft = this.duration - durationInMinutes * 60;
        DecimalFormat dF = new DecimalFormat( "00.##" );
        String durationString = dF.format(durationInMinutes) + ":" + dF.format(secondsLeft);
        return name + " - " + performer + " " + durationString;
    }
}
