package bridge.implementations;

import bridge.implementations.Developer;

public class JavaDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Java dev write backend code");
    }
}
