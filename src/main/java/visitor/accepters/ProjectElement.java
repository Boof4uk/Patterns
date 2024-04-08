package visitor.accepters;

import visitor.visitors.Developer;

/**
 * Создаем интерфейс для принимающих
 * -определяем метод принимающий посетителя
 */
public interface ProjectElement {
    void acceptDeveloper(Developer developer);
}
