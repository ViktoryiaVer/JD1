package home_work_2.arrays;
/**
 * класс для реализации интерфейса ArraysOperation при помощи while
 */
public class WhileOperation implements IArraysOperation {

    private StringBuilder sb = new StringBuilder();

    @Override
    public String printAllArrayElements(int[] arr) {
        int i = 0;
        while(i < arr.length) {
            sb = i< arr.length - 1 ? sb.append(arr[i]).append(" ") : sb.append(arr[i]);
            i++;
        }
        return String.valueOf(sb);
    }

    @Override
    public String printEverySecondElement(int[] arr) {
        int i = 0;
        while(i < arr.length) {
            if(i % 2 != 0) {
                sb = i< arr.length - 1 ? sb.append(arr[i]).append(" ") : sb.append(arr[i]);
            }
            i++;
        }
        return String.valueOf(sb);
    }

    @Override
    public String printElementsInReversedOrder(int[] arr) {
        int i = arr.length - 1;
        while(i>=0) {
            sb = i < arr.length - 1 ? sb.append(arr[i]).append(" ") : sb.append(arr[i]);
            i--;
        }
        return String.valueOf(sb);
    }
}
