package songRecommendationService.runners;

import songRecommendationService.fileService.FileService;
import songRecommendationService.songService.SongService;
import songRecommendationService.songService.dto.PlayList;
import songRecommendationService.songService.dto.Song;
import songRecommendationService.songService.suppliers.SongsFromFileSupplier;

import java.util.Set;

public class SongRecommendationServiceMain {
    public static void main(String[] args) {
        SongService service = new SongService();
        service.downloadSongList(new SongsFromFileSupplier("D:\\Computer Science\\Java_Basics\\SongList.txt"));

        Set<Song> recommended = service.getRecommendationSongs("Это всё", true, true);
        for (Song song : recommended) {
            System.out.println(song);
        }

        PlayList playList = new PlayList("мой плейлист", "просто так");
        playList.addToPlayList(recommended);

        FileService fileService = new FileService("D:\\\\Computer Science\\\\Java_Basics");
        fileService.writePlayListInFile(playList);
    }
}
