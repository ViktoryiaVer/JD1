package home_work_1.test;

import home_work_1.UserNameIf;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserNameIfTest {
    @Test
    public void welcomeNameVasya(){
        UserNameIf username1 = new UserNameIf();
        String welcomeString = username1.welcome("Вася");
        Assertions.assertEquals("Привет! Я тебя так долго ждал", welcomeString);
    }
    @Test
    public void welcomeNameAnastasia(){
        UserNameIf username1 = new UserNameIf();
        String welcomeString = username1.welcome("Анастасия");
        Assertions.assertEquals("Я тебя так долго ждал", welcomeString);
    }
    @Test
    public void welcomeSomeOtherName(){
        UserNameIf username1 = new UserNameIf();
        String welcomeString = username1.welcome("Федя");
        Assertions.assertEquals("Добрый день, а Вы кто?", welcomeString);
    }
}
