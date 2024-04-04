package bridge.implementations;

import bridge.implementations.Developer;

public class JavascriptDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("JavaScript dev write frontend code");
    }
}
