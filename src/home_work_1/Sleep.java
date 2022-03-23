package home_work_1;

public class Sleep {
    public static void main(String[] args) {
        boolean isWorkday = false;
        boolean isHoliday = true;

        System.out.println("Можно ли мне еще поспать?");

        // обработка нелогичных ответов
        if(isWorkday && isHoliday || !isWorkday && !isHoliday){
            System.out.println("Что-то ответы у тебя непонятные. Идите отдохните и вернитесь позже!");
        }
        else {
            // вызов метода sleepIn и присваивание возвращаемоего значения
            boolean isSleepPossible = sleepIn(isWorkday, isHoliday);

            // интерпретация значения метода
            if(isSleepPossible) {
                System.out.println("Да, можно еше и поспать!");
            } else {
                System.out.println("Ну нет, спать нельзя, пора на работу!");
            }
        }
    }

    public static boolean sleepIn(boolean weekday, boolean vacation) { // выполнение метода
        if(!weekday || vacation) {
            return true;
        } else {
            return false;
        }
    }
}
