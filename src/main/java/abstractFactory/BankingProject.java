package abstractFactory;

import abstractFactory.factories.BankingTeamFactory;
import abstractFactory.factories.ProjectTeamFactory;

/**
 * Клиентский код. ТЕперь не нужно создавать объекты. Каждая фабрика знает, какие специальные объекты
    она может дать
 */
public class BankingProject {
    public static void main(String[] args) {
        ProjectTeamFactory projectTeamFactory = new BankingTeamFactory();

        System.out.println("Creating project...\n");
        projectTeamFactory.getDeveloper().writeCode();
        projectTeamFactory.getTester().testingCode();
        projectTeamFactory.getPM().manageProject();
    }
}
