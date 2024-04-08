package observer;

/**
 * Интерфейс, который определяет для всех реализаций наблюдателя метод обработчик уведомлений
 * от наблюдаемого
 */
public interface Observer {
    void handleNotification(int temp, int pressure);
}
