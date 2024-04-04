package adapter;

/**
 * Класс, который должен использовать клиентский код, но он не умеет :(
 */
public class JavaCrudApplication {
    public void readObject() {
        System.out.println("Читает объект");
    }
    public void saveObject() {
        System.out.println("Сохраняет объект");
    }
    public void deleteObject() {
        System.out.println("Удаляет объект");
    }
    public void updateObject() {
        System.out.println("Обновляет объект");
    }
}
