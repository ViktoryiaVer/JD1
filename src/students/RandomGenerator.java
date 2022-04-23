package students;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/**
 * класс с методами для получения рандомных значений разных типов данных
 */
public class RandomGenerator {
    private final ThreadLocalRandom random = ThreadLocalRandom.current();

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
    public String generateRandomName() {
        int leftLimit = 1040; // буква А 1072, если только маленькие буквы
        int rightLimit = 1103; // буква Я
        int targetStringLength = random.nextInt(3,10);
        StringBuilder buffer = new StringBuilder(targetStringLength);
        for (int i = 0; i < targetStringLength; i++) {
            int randomLimitedInt = leftLimit + (int)
                    (random.nextFloat() * (rightLimit - leftLimit + 1));
            buffer.append((char) randomLimitedInt);
        }
        return buffer.toString();
    }

    /**
     * получает рандомное имя из предложенных нормальных имен в массиве
     * @return рандомное имя типа String
     */
    public String generateRandomNormalName() {
        String[] names = {"Петя", "Аня", "Вася", "Соня",
                "Ира", "Паша", "Люся", "Катя", "Тимофей", "Илья", "Ярослав", "Маша",};

        Random rnd = new Random();
        List<String> freeNames = new ArrayList<>(List.of(names));
        return freeNames.remove(rnd.nextInt(freeNames.size()));

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

