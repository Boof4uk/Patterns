package state;

/**
 * Реализация состояния
 */
public class Eating implements ActivityState{
    @Override
    public void doActivity() {
        System.out.println("Student eating");
    }
}
