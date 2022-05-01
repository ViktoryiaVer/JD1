package home_work_1.test;

import home_work_1.PhoneNumber;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PhoneNumberTest {
    @Test
    public void getFormattedPhoneNumberDifDigits() {
        int [] numbers = new int [] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        String formattedPhoneNumber = PhoneNumber.createPhoneNumber(numbers);
        Assertions.assertEquals("(123) 456-7890",formattedPhoneNumber);
    }
    @Test
    public void getFormattedPhoneNumberFrom0() {
        int [] numbers = new int [] {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        String formattedPhoneNumber = PhoneNumber.createPhoneNumber(numbers);
        Assertions.assertEquals("(000) 000-0000",formattedPhoneNumber);
    }
}
