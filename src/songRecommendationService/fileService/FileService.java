package songRecommendationService.fileService;

import songRecommendationService.songService.dto.PlayList;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileService {
    private final String path;

    public FileService() {
        this.path = "D:\\Computer Science";
    }

    public FileService(String path) {
        this.path = path;
    }

    public void writePlayListInFile(PlayList playList) {
        Scanner console = new Scanner(System.in);
        String filePath = this.path + "\\playlist.txt";
        try (FileWriter fileWriter = new FileWriter(filePath)) {
            try {
                fileWriter.write(playList.toString());
            } catch (IOException ex){
                System.out.println("Ошибка при записи файла");
            }
        } catch (IOException ex){
            System.out.println("Ошибка при создании файла: " + ex.getMessage());
        }
    }

}
