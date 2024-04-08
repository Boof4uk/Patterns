package state;

public class App {
    public static void main(String[] args) {
        Student student = new Student();
        student.setActivityState(new Sleeping());

        for(int i = 0; i < 10; i++) {
            System.out.println(i);
            student.changeActivity();
        }
    }
}
