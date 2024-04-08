package proxy;

/**
 * Класс реального объекта, который весит много памяти
 * - В конструкторе класса специально вставлен метод, который типа тратит много ресурсов,
 * чтобы показать, что его инициализация ресурсоемкая операция
 */
public class RealProject implements Project{
    private String url;

    RealProject(String url) {
        this.url = url;
        load();
    }

    public void load() {
        for(int i = 0; i < 10; i++) {
            System.out.println("Project is loading from " + url + " " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
    }
    @Override
    public void run() {
        System.out.println("Project is running");
    }
}
