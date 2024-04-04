package decorator.wrappers;

import decorator.base.Developer;

/**
 * Этот класс является конкретной реализацией декоратора
 * -Экстендим базовый класс декоратора
 * -Реализуем конструктор, который будет принимать базовый объект от клиентского кода
 * и передавать его базовому классу декоратору
 * -Переопределяем уже переопределенный метод базового класса декоратора и
 * добавляем дополнительное поведение.
 */
public class SeniorJavaDeveloper extends DeveloperDecorator {
    public SeniorJavaDeveloper(Developer developer) {
        super(developer);
    }

    @Override
    public void writeCode() {
        super.writeCode();
        System.out.println("+ Doing senior work...");
    }
}
