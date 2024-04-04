package abstractFactory.objects;

public class WebsitePM implements ProjectManager {
    @Override
    public void manageProject() {
        System.out.println("Managing website project");
    }
}
