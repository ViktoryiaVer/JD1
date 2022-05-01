package home_work_1.test;

import home_work_1.UserNameIfElseIf;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserNameIfElseIfTest {
    @Test
    public void welcomeNameVasya(){
        UserNameIfElseIf username1 = new UserNameIfElseIf();
        String welcomeString = username1.welcome("Вася");
        Assertions.assertEquals("Привет! Я тебя так долго ждал", welcomeString);
    }
    @Test
    public void welcomeNameAnastasia(){
        UserNameIfElseIf username1 = new UserNameIfElseIf();
        String welcomeString = username1.welcome("Анастасия");
        Assertions.assertEquals("Я тебя так долго ждал", welcomeString);
    }
    @Test
    public void welcomeSomeOtherName(){
        UserNameIfElseIf username1 = new UserNameIfElseIf();
        String welcomeString = username1.welcome("Катя");
        Assertions.assertEquals("Добрый день, а Вы кто?", welcomeString);
    }
}
