package prototype;

public class App {

    public static void main(String[] args) {
        Project master = new Project(1, "FirstProject", "FirstSourceCode");
        System.out.println(master);
        ProjectFactory projectFactory = new ProjectFactory(master);

        Project copyProject = projectFactory.cloneProject();
        System.out.println(copyProject);
    }
}
