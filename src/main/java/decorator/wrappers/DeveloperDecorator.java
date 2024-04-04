package decorator.wrappers;

import decorator.base.Developer;

/**
 * Базовый шаблон декоратора, по которому будут создаваться конкретный его реализации
 * -Определяем поле объекта, который будем декорировать
 * -Имплементируем ТОТ ЖЕ интерфейс, что и тип объекта
 * -Реализуем конструктор, который будет принимать этот объект от клиентского кода.
 * -Реализуем метод этого интерфейса: на полученном базовом-объекте вызываем
 * реализованный метод интерфейса (почти что рекурсия)

 */
public class DeveloperDecorator implements Developer {
    private Developer developer;

    public DeveloperDecorator(Developer developer) {
        this.developer = developer;
    }

    @Override
    public void writeCode() {
        developer.writeCode();
    }

}
