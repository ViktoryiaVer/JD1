package home_work_1;

import java.util.Scanner;

import static com.sun.tools.javac.util.StringUtils.toLowerCase;

public class UserNameSwitch {
    public static void main(String[] args) {
        System.out.println("Введите Ваше имя:");
        // Осуществляется и обрабатывается ввод чисел с клавиатуры
        Scanner scanner = new Scanner(System.in);
        String userName = scanner.nextLine();
        userName = toLowerCase(userName); //так ввод становится регистронезависимым

        // обработка вариантов ввода
        switch(userName) {
            case "вася" : {
                System.out.println("Привет!\nЯ тебя так долго ждал!");
                break;
            }
            case "анастасия" : {
                System.out.println("Я тебя так долго ждал!");
                break;
            }
            default : {
                System.out.println("Добрый день, а Вы кто?");
            }
        }
    }
}
