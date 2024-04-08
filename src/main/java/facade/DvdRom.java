package facade;

import javax.xml.crypto.Data;

/**
 * Один из необходимых элементов, для выполнения задачи
 */
public class DvdRom {
    private boolean data = false;

    public boolean hasData() {
        return data;
    }

    public void loadData() {
        System.out.println("Data inside dvd rom");
        data = true;
    }

    public void unLoadData() {
        System.out.println("No data");
        data = false;
    }

}
