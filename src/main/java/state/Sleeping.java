package state;

public class Sleeping implements ActivityState{
    @Override
    public void doActivity() {
        System.out.println("Student sleeping");
    }
}
