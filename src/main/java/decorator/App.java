package decorator;

import decorator.base.Developer;
import decorator.base.JavaDeveloper;
import decorator.wrappers.SeniorJavaDeveloper;
import decorator.wrappers.TeamleadJavaDeveloper;

/**
 * -Используем общуу ссылку нужного объекта
 * -Новым объектом будет являться декоратор(потому что в своей цепочке он расширяе нужный
 * объект) в который мы передаем базовый объект, который требуется декорировать
 *
 */
public class App {
    public static void main(String[] args) {
        Developer dev1 = new TeamleadJavaDeveloper(new SeniorJavaDeveloper(new JavaDeveloper()));
        dev1.writeCode();
    }
}
