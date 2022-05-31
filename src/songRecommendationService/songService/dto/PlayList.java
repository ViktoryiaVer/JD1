package songRecommendationService.songService.dto;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class PlayList {
    private final String name;
    private final String description;
    private final List<Song> songList;

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }


    public PlayList(String name, String description) {
        this.name = name;
        this.description = description;
        songList = new ArrayList<>();
    }


    public void  addToPlayList(Song song) {
        songList.add(song);
    }

    public void  addToPlayList(Collection<Song> list) {
        songList.addAll(list);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.name).append(" - ").append(this.description).append("\n");

        int counter = 0;
        for (Song song : songList) {
            sb.append(++counter).append(". ").append(song).append("\n");
        }
        return sb.toString();
    }
}
