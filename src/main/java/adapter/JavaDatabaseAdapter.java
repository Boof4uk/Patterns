package adapter;

/**
 * Класс адаптера, с которым сможет работать клиентский код
 * -Реализуем интерфейс, с которым умеет работать клиентский код
 * -Экстендим класс, с которым должен работать клиентский код
 * -Реализуем методы интерфейса так, чтобы добавить в них необходимое поведение
 * из класса, с которым должен работать клиентский код
 */
public class JavaDatabaseAdapter extends JavaCrudApplication implements DataBase {
    @Override
    public void selectData() {
        readObject();
    }

    @Override
    public void saveData() {
        saveObject();
    }

    @Override
    public void deleteData() {
        deleteObject();
    }

    @Override
    public void updateData() {
        updateObject();
    }
}
