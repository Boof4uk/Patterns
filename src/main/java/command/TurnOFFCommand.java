package command;

/**
 * Конкретная реализация интерфейса команда.
 * -Определяем поле-объект со сложной логикой.
 * -Внедряем его через конструктор
 * -Реализуем МЕТОД ОБЕРТКУ, НАД ОДНИМ МЕТОДОМ объекта, которым требуется управлять.
 */
public class TurnOFFCommand implements Command {
    private Computer computer;
    TurnOFFCommand(Computer computer) {
        this.computer = computer;
    }
    @Override
    public void execute() {
        computer.turnOff();
    }
}
