package abstractFactory.factories;

import abstractFactory.objects.Developer;
import abstractFactory.objects.ProjectManager;
import abstractFactory.objects.Tester;

/**
 * Интерфейс фабрики, который определяет методы для получения объектов из одной логической группы
 */

public interface ProjectTeamFactory {
    public Developer getDeveloper();
    public Tester getTester();
    public ProjectManager getPM();
}

