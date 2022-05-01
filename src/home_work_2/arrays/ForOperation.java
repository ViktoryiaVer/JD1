package home_work_2.arrays;
/**
 * класс для реализации интерфейса ArraysOperation при помощи for
 */
public class ForOperation implements IArraysOperation {

    private StringBuilder sb = new StringBuilder();

    @Override
    public String printAllArrayElements(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            sb = i< arr.length - 1 ? sb.append(arr[i]).append(" ") : sb.append(arr[i]);
        }
        return String.valueOf(sb);
    }

    @Override
    public String printEverySecondElement(int[] arr) {
        for(int i = 0; i< arr.length; i++) {
            if(i % 2 != 0) {
                sb = i< arr.length - 1 ? sb.append(arr[i]).append(" ") : sb.append(arr[i]);
            }
        }
        return String.valueOf(sb);
    }

    @Override
    public String printElementsInReversedOrder(int[] arr) {
        for(int i = arr.length - 1; i >= 0 ; i--) {
            sb = i< arr.length - 1 ? sb.append(arr[i]).append(" ") : sb.append(arr[i]);
        }
        return String.valueOf(sb);
    }
}
