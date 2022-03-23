package home_work_1;

public class PhoneNumber {
    public static void main(String[] args) {
        int [] numbers = new int [] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        // вызов метода и присваивание возвращаемого значения
        String formattedPhoneNumber = createPhoneNumber(numbers);
        System.out.println(formattedPhoneNumber); // вывод отформатированного номера в консоль

    }
    public static String createPhoneNumber(int [] arr) {
        StringBuilder sb = new StringBuilder(); // создание нового объекта класса StringBuilder

        // цикл перебирает все элементы массива и добавляет отформатированные элементы в строку
        for(int i = 0; i < arr.length; i++) {
            if(i == 0 ) {
                sb.append("(");
            }
            sb.append((arr[i]));
            if(i ==2) {
                sb.append(") ");
            }
            if(i == 5) {
                sb.append("-");
            }
        }
        return String.valueOf(sb); // метод возвращает строковое значение
    }
}
