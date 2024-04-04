package decorator.wrappers;

import decorator.base.Developer;

public class TeamleadJavaDeveloper extends DeveloperDecorator {
    public TeamleadJavaDeveloper(Developer developer) {
        super(developer);
    }

    @Override
    public void writeCode() {
        super.writeCode();
        System.out.println("+ Doing teamlead work");
    }
}
