package facade;

public class Hdd {
    public void copyDataFromDvd(DvdRom dvdRom) {
        if(dvdRom.hasData()) {
            System.out.println("Происходит копирование данных...");
        }
    }
}
