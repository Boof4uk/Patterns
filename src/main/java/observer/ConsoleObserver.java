package observer;

/**
 * Конкретная реализация наблюдателя
 */
public class ConsoleObserver implements Observer {

    @Override
    public void handleNotification(int temp, int pressure) {
        System.out.println("Температура и давление изменились: " + temp + ", " + pressure);
    }
}
