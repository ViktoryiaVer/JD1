package home_work_2.arrays;

/**
 * класс для реализации интерфейса ArraysOperation при помощи do...while
 */
public class DoWhileOperation implements IArraysOperation {
    private StringBuilder sb = new StringBuilder();

    @Override
    public String printAllArrayElements(int[] arr) {
        if(arr.length == 0) {
            return "";
        }
        int i = 0;
        do {
            sb = i< arr.length - 1 ? sb.append(arr[i]).append(" ") : sb.append(arr[i]);
            i++;
        } while(i < arr.length);
        return String.valueOf(sb);
    }

    @Override
    public String printEverySecondElement(int[] arr) {
        if(arr.length == 0) {
            return "";
        }
        int i = 0;
        do {
            if(i % 2 != 0) {
                sb = i< arr.length - 1 ? sb.append(arr[i]).append(" ") : sb.append(arr[i]);
            }
            i++;
        } while(i < arr.length);
        return String.valueOf(sb);
    }

    @Override
    public String printElementsInReversedOrder(int[] arr) {
        if(arr.length == 0) {
            return "";
        }
        int i = arr.length - 1;
        do {
            sb = i< arr.length - 1 ? sb.append(arr[i]).append(" ") : sb.append(arr[i]);
            i--;
        } while(i>=0);
        return String.valueOf(sb);
    }
}
