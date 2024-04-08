package observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Данный класс представляет за кем наблюдают
 * -Добавляем поля состояния, которые будут меняться
 * -добапвляем лист для хранения наблюдателей
 * -реализуем 3 метода:
 * добавить наблюдателя
 * удалить наблюдателя
 * уведомить наблюдателей(цикл, который перебирает всех наблюдателей и вызывает на них
 * соответствующий метод)
 * -Внедряем метод для уведомления наблюдателей в сеттер, который будет менять состояние
 */
public class MetioStation {
    private int temp = 0;
    private int pressure = 0;
    private List<Observer> observers = new ArrayList<>();

    void addObserver(Observer observer) {
        observers.add(observer);
    }
     void removeObserver(Observer observer) {
        observers.remove(observer);
     }

    void setTempPressure(int temp, int pressure) {
        this.temp = temp;
        this.pressure = pressure;
        notifyObservers();
    }

    private void notifyObservers() {
        for(Observer observer: observers) {
            observer.handleNotification(temp, pressure);
        }
    }


}
