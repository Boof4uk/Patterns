package facade;

/**
 * Данный класс инкапсулирует в себе несколько сложных систем, скрывая
 * детали реализации от клиентского кода.
 * -Внедряем все сложный объекты
 * -Делаем общий метод, который будет запускать все нужные методы на данных объектах
 */
public class FacadeComputer {
    private Power power;
    private DvdRom dvdRom;
    private Hdd hdd;

    FacadeComputer() {
        power = new Power();
        dvdRom = new DvdRom();
        hdd = new Hdd();
    }

    void copyDataFromDvdToHdd() {
        power.turnOnElectric();
        dvdRom.loadData();
        hdd.copyDataFromDvd(dvdRom);
        dvdRom.unLoadData();
        power.turnOffElectric();
    }

}
