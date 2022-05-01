package students;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

/**
 * класс с методами для получения рандомных значений разных типов данных
 */
public class RandomGenerator {
    private final ThreadLocalRandom random = ThreadLocalRandom.current();
    private static final String[] namesStringArray = {"Петя", "Аня", "Вася", "Соня",
            "Ира", "Паша", "Люся", "Катя", "Тимофей", "Илья", "Ярослав", "Маша"};

    /**
     * получает рандомное целое число от 7 до 17 включительно
     * @return рандомное число типа int
     */
    public int generateRandomAge() {
        return random.nextInt(7,18);
    }

    /**
     * получает рандомное имя в виде набора символов русского алфавита
     * @return рандомное имя типа String
     */
    public String generateRandomSymbolsName() {
        int leftLimit = 1040; // буква А 1072, если только маленькие буквы
        int rightLimit = 1103; // буква Я
        int targetStringLength = random.nextInt(3,10);
        StringBuilder buffer = new StringBuilder(targetStringLength);
        for (int i = 0; i < targetStringLength; i++) {
            buffer.append((char)random.nextInt(leftLimit,rightLimit));
        }
        return buffer.toString();
    }

    /**
     * получает рандомное имя из предложенных нормальных имен,
     * @return рандомное имя типа String
     */
    public String generateRandomNormalName() {
        return getRandomNameFromList(List.of(namesStringArray));

    }

    /**
     * генерирует рандомное имя, полученное из файла
     * @param path путь к файлу
     * @return имя типа String
     */
    public String generateRandomNameFromFile(String path) {
        return getRandomNameFromList(getNamesFromFile(path));

    }
    /**
     * получает рандомное имя из списка имен
     * @param list список, из которого необходимо получить рандомное имя
     * @return имя типа String
     */
    public String getRandomNameFromList(List<String> list) {
        int size = list.size();
        return list.get(random.nextInt(size));
    }

    /**
     * читает файл и добавляет строки из него в список
     * @param filePath путь к файлу, который необходимо прочитать
     * @return список строк, находящихся в файле
     */
    public List<String> getNamesFromFile(String filePath) {
        List<String> namesList = null;
        try {
            Charset charset = StandardCharsets.UTF_8;
            namesList = new ArrayList<>(Files.readAllLines(Paths.get(filePath), charset));
        }
        catch(IOException e) {
            System.out.println("Произошла ошибка!");
        }
        if(namesList != null) {
            return namesList;
        }
        return null;
    }

    /**
     * получает рандомное вещественное число от 0 до 10
     * @return рандомное число типа double
     */
    public double generateRandomMark() {
        return random.nextDouble(0.0,10.0);
    }

    /**
     * получает рандомное значение boolean
     * @return рандомное значение boolean
     */
    public boolean generateRandomPart() {
        return random.nextBoolean();
    }
}

