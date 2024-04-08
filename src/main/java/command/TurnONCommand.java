package command;

public class TurnONCommand implements Command{
    private Computer computer;
    TurnONCommand(Computer computer) {
        this.computer = computer;
    }
    @Override
    public void execute() {
        computer.turnON();
    }
}
