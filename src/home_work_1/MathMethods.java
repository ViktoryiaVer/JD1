package home_work_1;

import java.util.Scanner;
import static java.lang.Math.*;

public class MathMethods {
    public static void main(String[] args) {
        int userNumber1 = 0, userNumber2 = 0;
        // Осуществляется и обрабатывается ввод чисел с клавиатуры
        System.out.println("Введите два числа через пробел:");
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        String[] parts = userInput.split(" ");
        userNumber1 = Integer.parseInt(parts[0]);
        userNumber2 = Integer.parseInt(parts[1]);

        // вычисляется сумма двух чисел и выводится в консоль
        int sum = addExact(userNumber1, userNumber2);
        System.out.println(userNumber1 + " + " + userNumber2 + " = "  + sum);

        // определяется максимальное число и выводится в консоль
        int max = max(userNumber1, userNumber2);
        System.out.println("Максимальное число  - " + max);

        // выполняется произведение двух чисел и выводится в консоль
        long product = multiplyExact(userNumber1, userNumber2);
        System.out.println(userNumber1 + " * " + userNumber2 + " = "  + product);

        // возведение первого числа в степень второго и вывод результата в консоль
        double power = pow(userNumber1, userNumber2);
        System.out.println(userNumber1 + " в степени " + userNumber2 + " = " + (int) power);

        // извлечение квадратного корня из первого числа
        double square = sqrt(userNumber1);

        // вывод результата с округлением
        System.out.println("Квадратный корень из " + userNumber1 + " с округлением = " + round(square));

        // получение рандомного числа от 0 до 20 и вывод его в консоль
        int randomNumber = (int) (Math.random () * 20);
        System.out.println("Смотрите, какое классное рандомное число от 0 до 20: " + randomNumber);
    }
}
