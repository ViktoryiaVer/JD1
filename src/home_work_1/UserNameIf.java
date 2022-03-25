package home_work_1;

import java.util.Scanner;

public class UserNameIf {
    public static void main(String[] args) {
        System.out.println("Введите Ваше имя:");
        // осуществляется и обрабатывается ввод чисел с клавиатуры
        Scanner scanner = new Scanner(System.in);
        String userName = scanner.nextLine();

        // обработка вариантов ввода
        if ("вася".equalsIgnoreCase(userName)) {
            System.out.println("Привет!\nЯ тебя так долго ждал");
        }
        if ("анастасия".equalsIgnoreCase(userName)) {
            System.out.println("Я тебя так долго ждал");
        }
        if (!"вася".equalsIgnoreCase(userName) && !"анастасия".equalsIgnoreCase(userName)) {
            System.out.println("Добрый день, а Вы кто?");
        }
    }
}
