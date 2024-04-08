package visitor.accepters;

import visitor.visitors.Developer;

public class JavaCodeElement implements ProjectElement{
    @Override
    public void acceptDeveloper(Developer developer) {
        developer.visitJavaCodeElement(this);
    }
}
