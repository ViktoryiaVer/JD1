package home_work_1;

import java.util.Scanner;

public class UserNameIfElseIf {
    public static void main(String[] args) {
        System.out.println("Введите Ваше имя:");
        // Осуществляется и обрабатывается ввод чисел с клавиатуры
        Scanner scanner = new Scanner(System.in);
        String userName = scanner.nextLine();

        // обработка вариантов ввода
        if("вася".equalsIgnoreCase(userName)) {
            System.out.println("Привет!\nЯ тебя так долго ждал");
        } else if("анастасия".equalsIgnoreCase(userName)) {
                System.out.println("Я тебя так долго ждал");
        } else {
                System.out.println("Добрый день, а Вы кто?");
        }
    }
}
