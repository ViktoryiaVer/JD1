package home_work_3.calcs.additional;

import home_work_3.calcs.simple.CalculatorWithMathExtends;

/**
 * класс с учетом количества использований калькулятора (учет выполняется при вызове соответствующего метода), задание 5
 */

public class CalculatorWithCounterClassic extends CalculatorWithMathExtends {
    private long countOperation;

    /**
     * увеличивает значение счетчика использований оператора на 1
     */
    public void incrementCountOperation() {
        countOperation++;
    }

    /**
     * возвращает количество использований калькулятора в виде long (геттер для поля countOperation)
     * @return количество использований калькулятора в виде long
     */
    public long getCountOperation() {
        return countOperation;
    }

}
