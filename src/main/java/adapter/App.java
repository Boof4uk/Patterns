package adapter;

import javax.xml.crypto.Data;

public class App {
    public static void main(String[] args) {
        DataBase dataBase = new JavaDatabaseAdapter();
        dataBase.selectData();
        dataBase.saveData();
        dataBase.deleteData();
        dataBase.updateData();
    }
}
