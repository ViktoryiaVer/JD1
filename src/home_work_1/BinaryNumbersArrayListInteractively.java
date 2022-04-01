package home_work_1;

import java.util.ArrayList;
import java.util.Scanner;

public class BinaryNumbersArrayListInteractively {
    public static void main(String[] args) {
        // ввод и обработка ввода с клавиатуры
        System.out.println("Введите число для преобразование в восьмибитовое двоичное число");
        Scanner scanner = new Scanner(System.in);
        byte userNumber = scanner.nextByte();
        // вызов метода и присваивание возвращаемого значения
        String binaryNumber = toBinaryString(userNumber);
        System.out.println(binaryNumber); // вывод результата в консоль
    }

    public static String toBinaryString (byte number) {
        byte numberPositive;

        // преобразование отрицательного числа при вводе в положительное
        if(number < 0 && number !=-128) {
            numberPositive = (byte) -number;
        } else if(number == -128) { // отдельное условие для обработки -128 (костыль, да)
            numberPositive = 127;
        } else {
            numberPositive = number;
        }

        ArrayList <Byte> numbers = new ArrayList<>(); // создание нового объекта класса ArrayList

        // положительное число делится 8 раз на 2, остаток добавляется в массив чисел
        // это первый этап преобразования числа из десятичной системы в двоичную
        for (int i = 0; i < 8; i++) {
            byte remainder;
            remainder = (byte) (numberPositive % 2);
            numberPositive /= 2;
            numbers.add(remainder);
        }
        // дополнительный код для отрицательных чисел
        if(number < 0) {
            for (int i = 7; i >= 0; i--) {
                byte invertedNumber = (byte) (numbers.get(i) == 1 ? 0 : 1);
                numbers.set(i, invertedNumber); // на выходе из цикла получается массив интвертированных чисел
            }

            // цикл для добавления 1 к интвертированному числу для отрицательных чисел >-128
            if(number !=-128) {
                boolean continueCycle = true;
                int index = 0;
                while (continueCycle) {
                    int currentNumber = numbers.get(index);
                    numbers.set(index, (byte) (currentNumber == 0 ? 1 : 0));
                    if (currentNumber == 0) {
                        continueCycle = false;
                    }
                    index++;
                }
            }
        }
        // проход массива с конца и добавление каждого числа в строку, чтобы в итоге получить двоичное представление
        // исходного числа. это второй этап преобразования
        StringBuilder sb = new StringBuilder();  // создание нового объекта класса StringBuilder
        for (int i = 7; i >= 0; i--) {
            sb.append((numbers.get(i)));
        }
        return String.valueOf(sb); // возвращение строкового значения класса StringBuilder - двоичного представления исходного числа
    }
}
