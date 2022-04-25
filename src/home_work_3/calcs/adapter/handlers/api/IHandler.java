package home_work_3.calcs.adapter.handlers.api;

/**
 * Интерфейс для обработки математических выражений в виде String
 */
public interface IHandler {
    String handle (String str);

    /**
     * получает приоритет операции
     * @return приоритет операции типа int
     */
    int getPriority();
}
