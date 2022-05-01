package home_work_1;


import home_work_1.api.ICommunicationPrinter;

public class UserNameIf implements ICommunicationPrinter {

    @Override
    public String welcome(String name) {
        if("вася".equalsIgnoreCase(name)) {
            return "Привет! Я тебя так долго ждал";
        }
        if("анастасия".equalsIgnoreCase(name)) {
            return "Я тебя так долго ждал";
        }
        return "Добрый день, а Вы кто?";
    }
}
