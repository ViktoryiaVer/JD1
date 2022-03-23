package home_work_1;

import java.util.Scanner;

import static com.sun.tools.javac.util.StringUtils.toLowerCase;


public class UserNameIf {
    public static void main(String[] args) {
        System.out.println("Введите Ваше имя:");
        // осуществляется и обрабатывается ввод чисел с клавиатуры
        Scanner scanner = new Scanner(System.in);
        String userName = scanner.nextLine();
        userName = toLowerCase(userName); // так ввод становится регистронезависимым

        // обработка вариантов ввода
        if(userName.equals("вася")) {
            System.out.println("Привет!\nЯ тебя так долго ждал");
        } else {
            if(userName.equals("анастасия")) {
                System.out.println("Я тебя так долго ждал");
            } else {
                System.out.println("Добрый день, а Вы кто?");
            }
        }
    }
}
