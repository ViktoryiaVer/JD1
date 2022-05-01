package home_work_2.test.loops;

import home_work_2.loops.TypeOverflow;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TypeOverflowTest {
    @Test
    public void exponentiateTillTypeOverflow3() {
        long[] resultAct = TypeOverflow.multiplyTillDataTypeOverflow(1, 3);
        long[] resultExpect = {4052555153018976267L, -6289078614652622815L};
        Assertions.assertArrayEquals(resultAct,resultExpect);

    }

    @Test
    public void exponentiateTillTypeOverflow188() {
        long[] resultAct = TypeOverflow.multiplyTillDataTypeOverflow(1, 188);
        long[] resultExpect = {1560496482665168896L, -1774566438301073408L};
        Assertions.assertArrayEquals(resultAct,resultExpect);

    }

    @Test
    public void exponentiateTillTypeOverflowNegative() {
        long[] resultAct = TypeOverflow.multiplyTillDataTypeOverflow(1, -19);
        long[] resultExpect = {799006685782884121L, 3265617043834753317L};
        Assertions.assertArrayEquals(resultAct,resultExpect);

    }

    @Test
    public void exponentiateTillTypeOverflowZero() {
        long[] resultAct = TypeOverflow.multiplyTillDataTypeOverflow(1, 0);
        long[] resultExpect = {0, 0};
        Assertions.assertArrayEquals(resultAct,resultExpect);

    }
    @Test
    public void exponentiateTillTypeOverflowLarge() {
        long[] resultAct = TypeOverflow.multiplyTillDataTypeOverflow(1, 15000);
        long[] resultExpect = {50625000000000000L, 3058492977908383744L};
        Assertions.assertArrayEquals(resultAct,resultExpect);

    }

}
