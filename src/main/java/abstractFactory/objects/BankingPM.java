package abstractFactory.objects;

public class BankingPM implements ProjectManager {
    @Override
    public void manageProject() {
        System.out.println("managing banking project");
    }
}
