package home_work_1;


import home_work_1.api.ICommunicationPrinter;

public class UserNameSwitch implements ICommunicationPrinter {

    @Override
    public String welcome(String name) {
        switch(name) {
            case "Вася" : {
                return "Привет! Я тебя так долго ждал!";
            }
            case "Анастасия" : {
                return "Я тебя так долго ждал!";
            }
            default : {
                return "Добрый день, а Вы кто?";
            }
        }
    }
}
