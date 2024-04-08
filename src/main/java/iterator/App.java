package iterator;

public class App {
    public static void main(String[] args) {
        String[]skills = {"Java", "Spring", "Kafka"};
        JavaDeveloper javaDeveloper = new JavaDeveloper("Vova", skills);

        Iterator iterator = javaDeveloper.getIterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
}
