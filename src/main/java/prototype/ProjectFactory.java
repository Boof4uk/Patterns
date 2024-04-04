package prototype;

/**
 * Класс фабрики которая выдает новый объект, по шаблону, который передали в конструктор
 * -Определяем поле объекта, которыйнадо будет клонировать
 * -Определяем конструктор, который на вход будет принимать конкретный объект,
 * чьи копии ему делать.
 * -Реализуем метод, который будет вызывать метод клонирования у указанного объекта и взвращать
 * новый склонированный объект


 * Чтобы не делать приведение объектов в клиентском коде, реализуем фабрику, которая будет
 * принимать объект для копирования в конструкторе и при вызове cloneProject будет отдавать приведенный
 * скопированный объект
 */
public class ProjectFactory {
    private Project project;

    ProjectFactory(Project project) {
        this.project = project;
    }

    public Project cloneProject() {
        return (Project) project.copy();
    }
}
