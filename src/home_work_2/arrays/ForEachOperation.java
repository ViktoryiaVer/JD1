package home_work_2.arrays;


/**
 * класс для реализации интерфейса ArraysOperation при помощи for each
 */
public class ForEachOperation implements IArraysOperation {

    private  StringBuilder sb = new StringBuilder();

    @Override
    public String printAllArrayElements(int[] arr) {
        int i = 0;
        for(int number : arr) {
            sb = i < arr.length - 1 ? sb.append(number).append(" ") : sb.append(number);
            i++;
        }
        return String.valueOf(sb);
    }

    @Override
    public String printEverySecondElement(int[] arr) {
        int i = 0;
        for(int number : arr) {
            if(i % 2 !=0) {
                sb = i < arr.length - 1 ? sb.append(number).append(" ") : sb.append(number);
            }
            i++;
        }
        return String.valueOf(sb);
    }

    @Override
    public String printElementsInReversedOrder(int[] arr) {
        int i = 0;
        for(int number: arr){
            sb = i < arr.length - 1 ? sb.append(number).append(" ") : sb.append(number);
            i++;
        }
        return String.valueOf(sb);
    }
}
