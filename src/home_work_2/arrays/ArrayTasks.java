package home_work_2.arrays;

import home_work_2.utils.ArraysUtils;


/**
 * класс с методами для решения различных задач по массивам - задание 2.4
 */
public class ArrayTasks {
    public static void main(String[] args) {

        int [] arr = ArraysUtils.arrayRandom(50, 100); // получение массива случайных чисел

        // вызов метода для получения всех четных положительных элементов массива и печать результата
        int sum = sumEvenPositiveElements(arr);
        System.out.println("Сумма всех четных положительных элементов массива = " + sum);

        // вызов метода для получения максимального из элементов массива с четными индексами и печать результата
        int maxValue = findMaxElementWithEvenIndex(arr);
        System.out.println("Максимальный из элементов массива с четными индексами = " + maxValue);

        // вызов метода для получения всех элементов массива меньше средного арифметического и печать результата
        int [] underAverageElements = calculateAverageReturnAllSmaller(arr);
        System.out.println("Все элементы массива меньше среднего арифметического:");
        for(int number : underAverageElements) {
            System.out.printf("%-5d", number);
        }
        System.out.println();

        // вызов метода для получения двух минимальных элементов массива и печать результата
        MinElements minTwoEl = findTwoMinElements(arr);
        System.out.println("Два элемента с минимальным значением:\n" + minTwoEl.first + "\t" + minTwoEl.second);

        // создание переменных для задания интервала
        int x = 5;
        int y = 9;
        // вызов метода для удаления элементов в определенном интервале и печать результата
        int [] arrAfterDeletion = deleteElementsInInterval(x, y, arr);
        System.out.println("Массив после удаления элементов в интервале от " + x + " до " + y + " :");
        for(int number : arrAfterDeletion) {
            System.out.printf("%-5d", number);
        }
        System.out.println();
        // вызов метода для получения суммы цифр массива и печать результата
        int sumOfDigits = calculateSumOfDigitsInArray(arr);
        System.out.println("Сумма всех цифр в массиве = " + sumOfDigits);
    }

    /**
     * считает сумму четных положительных элементов массива
     * @param array массив чисел, для которых нужно посчитать сумму четных положительных элементов
     * @return результат сложения четных положительных элементов в виде числа
     */

    public static int sumEvenPositiveElements (int [] array) {
        int sum = 0;
        for(int element : array) {
            if(element > 0 && element % 2 == 0) {
                sum+=element;
            }
        }
        return sum;
    }

    /**
     * находит максимальный элемент массива с четным индексом
     * @param array массив чисел, в котором нужно найти максимальный элемент с четным индексом
     * @return максимальный элемент с четным индексом в виде числе
     */

    public static int findMaxElementWithEvenIndex (int [] array) {
        int max = 0;
        for(int i =0; i< array.length; i++) {
            max = i % 2 == 0 && array[i] > max ? array[i] : max;
        }
        return max;
    }

    /**
     * высчитывает среднее арифметическое для элементов массива и возвращает элементы меньше него
     * @param arr массив чисел, для которого нужно вернуть элементы меньше средного арифметического
     * @return элементы массива ниже среднего арифметического в виде массива чисел
     */

    public static int[] calculateAverageReturnAllSmaller (int [] arr) {
        float sum = 0;
        for(int number : arr) {
            sum += number;
        }
        float average = sum / arr.length;
        int underAverageAmount = 0;
        for (int number : arr) {
            if(number < average) {
                underAverageAmount++;
            }
        }
        int[] underAverageAsArray = new int [underAverageAmount];
        int underAverageCount = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] < average) {
                underAverageAsArray[underAverageCount] = arr[i];
                underAverageCount++;
            }
        }
        return underAverageAsArray;
    }

    /**
     * находит два элемента с минимальным значением в массиве
     * @param array массив, для которого нужно найти два минимальные элемента
     * @return 2 минимальных элемента в виде объекта класса MinElements
     */
    public static MinElements findTwoMinElements (int [] array) {
        int min1 = array[0] < array[1] ? array[0] : array[1];
        int min2 = min1 == array[0] ? array[1] : array[0];

        for(int i = 2; i < array.length; i++) {
            int temp = min2;
            if(array[i] < min1) {
                temp = min1;
                min1 = array[i];
            } else if(array[i] < min2) {
                min2 = array[i];
            }
            if(temp < min2) {
                min2 = temp;
            }
        }
        // создание нового объекта класса MinElements для возврата значения двух минимальных элементов массива
        MinElements minElInArr = new MinElements(min1, min2);
        return minElInArr;
    }

    /**
     * удаляет из массива элементы со значением в определенном интервале (включительно)
     * смещает оставшиеся элементы массива влево на количество удаленных элементов
     * заполняет удаленные элементы нулями
     * @param a начальное число интвервала для удаления
     * @param b конечное число интервала для удаления
     * @param arr массив, элементы которого нужно удалить
     * @return массив, в котором вместо удаленных элементов находятся нули
     */
    public static int[] deleteElementsInInterval (int a, int b, int [] arr) {
        int shift = 0;
        for(int i = 0; i < arr.length - shift; i++) {
            if(arr[i] >=a && arr[i] <= b) {
                for(int j = i; j < arr.length - 1 - shift; j++) {
                    arr[j] = arr[j+1];
                }
                arr[arr.length -1 - shift] = 0;
                shift++;
            }
            if(arr[i] >=a && arr[i] <= b) {
                i--;
            }
        }
        return arr;
    }

    /**
     * считает сумму цифр массива
     * @param arr массив, сумму цифр которого нужно посчитать
     * @return результат сложения всех цифр массива в виде числа
     */
    public static int calculateSumOfDigitsInArray (int [] arr) {
        int sum = 0;
        int digit;
        for(int i = 0; i < arr.length; i++) {
            while(arr[i] % 10 != 0) {
                digit = arr[i] % 10;
                sum += digit;
                arr[i] /= 10;
            }
        }
        return sum;
    }
}
