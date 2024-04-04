package adapter;

/**
 * Интерфейс, которым с которым умеет общаться клиентский код
 */
public interface DataBase {
    public void selectData();
    public void saveData();
    public void deleteData();
    public void updateData();
}
