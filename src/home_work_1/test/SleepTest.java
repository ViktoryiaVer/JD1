package home_work_1.test;

import home_work_1.Sleep;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SleepTest {
    @Test
    public void checkSleepForVacation() {
        boolean isWeekday = false;
        boolean isVacation = true;
        boolean sleep1 = Sleep.sleepIn(isWeekday, isVacation);
        Assertions.assertTrue(sleep1);
    }
    @Test
    public void answerToPrintForVacation() {
        String answer = Sleep.answerToPrint(true);
        Assertions.assertEquals("Да, можно еще поспать!", answer);
    }

    @Test
    public void checkSleepForWorkday() {
        boolean isWeekday = true;
        boolean isVacation = false;
        boolean sleep1 = Sleep.sleepIn(isWeekday,isVacation);
        Assertions.assertFalse(sleep1);
    }
    @Test
    public void answerToPrintForWorkday() {
        String answer = Sleep.answerToPrint(false);
        Assertions.assertEquals("Ну нет, спать нельзя, пора на работу!", answer);
    }
}
