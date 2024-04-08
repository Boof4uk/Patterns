package visitor.accepters;

import visitor.visitors.Developer;

public class TestElemente implements ProjectElement{
    @Override
    public void acceptDeveloper(Developer developer) {
        developer.visitTestCodeElement(this);
    }
}
