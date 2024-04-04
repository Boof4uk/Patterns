package bridge.abstraction;

import bridge.implementations.Developer;

/**
 * Абстрактный класс, который необходим для создания
 */
public abstract class Program {
    protected Developer developer;

    public Program (Developer developer) {
        this.developer = developer;
    }

    public abstract void developProgram();
}
