package home_work_1.test;

import home_work_1.UserNameSwitch;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserNameSwitchTest {
    @Test
    public void welcomeNameVasya(){
        UserNameSwitch username1 = new UserNameSwitch();
        String welcomeString = username1.welcome("Вася");
        Assertions.assertEquals("Привет! Я тебя так долго ждал!", welcomeString);
    }
    @Test
    public void welcomeNameAnastasia(){
        UserNameSwitch username1 = new UserNameSwitch();
        String welcomeString = username1.welcome("Анастасия");
        Assertions.assertEquals("Я тебя так долго ждал!", welcomeString);
    }
    @Test
    public void welcomeSomeOtherName(){
        UserNameSwitch username1 = new UserNameSwitch();
        String welcomeString = username1.welcome("Коля");
        Assertions.assertEquals("Добрый день, а Вы кто?", welcomeString);
    }
}
