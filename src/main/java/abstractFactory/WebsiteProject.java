package abstractFactory;

import abstractFactory.factories.ProjectTeamFactory;
import abstractFactory.factories.WebsiteTeamFactory;

public class WebsiteProject {
    public static void main(String[] args) {
        ProjectTeamFactory projectTeamFactory = new WebsiteTeamFactory();

        System.out.println("Creating project...\n");
        projectTeamFactory.getDeveloper().writeCode();
        projectTeamFactory.getTester().testingCode();
        projectTeamFactory.getPM().manageProject();
    }
}
