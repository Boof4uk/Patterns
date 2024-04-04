package abstractFactory.factories;

import abstractFactory.objects.*;

/**
 * Реализация фабрики
 * -Реализуем методы для получения различных функциональных объектов из одной логической группы
 *
 */
public class BankingTeamFactory implements ProjectTeamFactory {

    @Override
    public Developer getDeveloper() {
        return new JavaDeveloper();
    }

    @Override
    public Tester getTester() {
        return new QATester();
    }

    @Override
    public ProjectManager getPM() {
        return new BankingPM();
    }
}
