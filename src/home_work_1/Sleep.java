package home_work_1;

import java.util.Scanner;

public class Sleep {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Сейчас рабочий день?");
        boolean weekday = console.nextBoolean();
        System.out.println("Сейчас у вас отпуск?");
        boolean vacation = console.nextBoolean();

        boolean sleep = sleepIn(weekday, vacation);
        System.out.println(answerToPrint(sleep));
    }

    public static boolean sleepIn(boolean weekday, boolean vacation) { // выполнение метода
        if(!weekday || vacation) {
            return true;
        } else {
            return false;
        }
    }
    public static String answerToPrint(boolean sleep) {
        if(sleep) {
            return "Да, можно еще поспать!";
        }
        return "Ну нет, спать нельзя, пора на работу!";
    }
}
