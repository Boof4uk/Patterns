package factoryMethod.factories;

import factoryMethod.objects.Developer;

/**
 * Интерфейс, определяющий фабричный метод по производству объектов определенного типа
 */
public interface DeveloperFactory {
    public Developer createDeveloper();
}
