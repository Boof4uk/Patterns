package proxy;

/**
 * Класс легковесного прокси объекта, который не инициализирует реальный, пока не обратятся
 * к методу, который инициализирует реальный объект.
 * -Импелементируем тот же интерфейс, что и реальный объект, чтобы иметь возможность в клиентском
 * коде вставить прокси там, где можно вставить реальный
 * -Определяем ссылку на реальный объект
 * -Создаем конструктор
 * -Переопределяем метод интерфейса так, что в нем создаем реальный объект и уже на нем вызываем
 * тот же метод.
 */
public class ProxyProject implements Project{
    private String url;
    private RealProject project;
    ProxyProject(String url) {
        this.url = url;
    }
    @Override
    public void run() {
        if (project == null) {
            project = new RealProject(url);
        }
        project.run();
    }
}
