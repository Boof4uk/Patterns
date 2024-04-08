package visitor;

import visitor.accepters.FullProject;
import visitor.visitors.Developer;
import visitor.visitors.JuniorDeveloper;
import visitor.visitors.SeniorDeveloper;

public class App {
    public static void main(String[] args) {
        FullProject fullProject = new FullProject();
        Developer senior = new SeniorDeveloper();
        Developer junior = new JuniorDeveloper();
        fullProject.acceptDeveloper(senior);
    }
}
