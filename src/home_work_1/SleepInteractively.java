package home_work_1;

import java.util.Scanner;

public class SleepInteractively {
    public static void main(String[] args) {
        // Осуществляется и обрабатывается ввод ответов с клавиатуры
        System.out.println("Можно ли Вам еще поспать? Ответьте на пару вопросов!");
        System.out.println("Вам надо на работу?");
        Scanner scanner = new Scanner(System.in);
        String userInput1 = scanner.nextLine();
        System.out.println("У Вас отпуск?");
        String userInput2 = scanner.nextLine();

        // интерпретация ввода с клавиатуры
        boolean isWorkday = "да".equalsIgnoreCase(userInput1);
        boolean isHoliday = "да".equalsIgnoreCase(userInput2);
        boolean isValidAnswer1 = "да".equalsIgnoreCase(userInput1) || "нет".equalsIgnoreCase(userInput1);
        boolean isValidAnswer2 = "да".equalsIgnoreCase(userInput2) || "нет".equalsIgnoreCase(userInput2);

        // обработка некорректных или нелогичных ответов
        if((isWorkday && isHoliday) || (!isWorkday && !isHoliday) || (!isValidAnswer1 || !isValidAnswer2)) {
            System.out.println("Что-то ответы у Вас непонятные. Идите отдохните и вернитесь позже!");
        }
        else {
            // вызов метода sleepIn и присваивание возвращаемоего значения
            boolean isSleepPossible = sleepIn(isWorkday, isHoliday);
            // интерпретация возвращаемого значения метода
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
