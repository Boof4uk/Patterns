package templateMethod;

/**
 * Абстрактный родительский класс
 * -Реализует метод с общим поведением для подклассов
 * -Определяет метод, который будет использоваться в общем методе
 * но реализация его остается на стороне подкласса
 */
public abstract class WebsiteTemplate {
    public void showContent() {
        System.out.println("Общая часть подклассов");
        showSpecificContent();
        System.out.println("Общая часть подклассов");
    }
    public abstract void showSpecificContent();
}
