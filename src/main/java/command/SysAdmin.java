package command;

/**
 * Класс хранящий все команды, которые будет вызывать клиентский код
 * -Каждое поле - это конкретный экземпляр каждой команды
 * -Внедряем их через конструктор
 * -Делаем ВСЕ МЕТОДЫ ОБЕРТКИ, НАД МЕТОДАМИ КОМАНДАМИ
 * Эти методы уже будет использовать клиентский код
 */
public class SysAdmin {
    private Command turnOn;
    private Command turnOff;

    SysAdmin(TurnONCommand turnOn, TurnOFFCommand turnOff) {
        this.turnOff = turnOff;
        this.turnOn = turnOn;
    }

    public void turnOffPc() {
        turnOff.execute();
    }
    public void turnOnPc() {
        turnOn.execute();
    }

}
