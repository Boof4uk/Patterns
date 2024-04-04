package factoryMethod.factories;

import factoryMethod.objects.Developer;
import factoryMethod.objects.JavaDeveloper;

/**
 * Конкретная реализация фабрики
 * -Реализует метод интерфейса  для получения конкретных объектов
 */
public class JavaDeveloperFactory implements DeveloperFactory {

    @Override
    public Developer createDeveloper() {
        return new JavaDeveloper();
    }
}
