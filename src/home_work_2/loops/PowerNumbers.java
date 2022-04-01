package home_work_2.loops;
import java.util.Scanner;
/**
 * в классе находится решение задания 1.3 - возведение одного числа в степень второго, которые вводятся пользователем
 */
public class PowerNumbers {
    public static void main(String[] args) {

        Scanner question1 = new Scanner(System.in);
        System.out.println("Введите положительное или отрицательное дробное число:");

        // цикл, в котором проверяется корректность ввода первого числа, и который продолжается до тех пор, пока ввод не будет правильным
        while(!question1.hasNext("-*\\d+[.,]\\d+")) {
            System.out.println("Вы ввели целое число! Введите дробное число.");
            question1.next();
        }
        double firstNumber = question1.nextDouble(); // присваиваем корректно введенное число переменной

        Scanner question2 = new Scanner(System.in);
        System.out.println("Введите положительное целое число:");

        // цикл, в котором проверяется корректность ввода первого числа, и который продолжается до тех пор, пока ввод не будет правильным
        while((question2.hasNext("\\d+[.,]\\d+")) || (question2.hasNext("-\\d+"))) {
            System.out.println("Проверьте ввод! Число должно быть целым и положительным!");
            question2.next();
        }
        int secondNumber = question2.nextInt(); // присваиваем корректно введенное число переменной

        // цикл, в котором выполняется возведение первого числа в степень второго
        double powResult = 1;
        for(int i = 1; i <= secondNumber; i++) {
            powResult *= firstNumber;
        }
        // печать результата в отформатированном виде
        System.out.printf("%.1f ^ %d = %.1f%n",firstNumber,secondNumber, powResult);

    }
}
