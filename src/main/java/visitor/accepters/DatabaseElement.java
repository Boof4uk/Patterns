package visitor.accepters;

import visitor.visitors.Developer;

/**
 * Имплементируем интерфейс ассептера
 * -реализуем метод ассепт:
 * принмает визитора
 * вызываем на нем метод, который обработает переданный (текущий) объект ассептера
 */
public class DatabaseElement implements ProjectElement{
    @Override
    public void acceptDeveloper(Developer developer) {
        developer.visitDatabaseElement(this);
    }
}
