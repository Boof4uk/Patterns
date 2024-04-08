package command;

public class App {
    public static void main(String[] args) {
        Computer pc = new Computer();
        SysAdmin sysAdmin = new SysAdmin(
                new TurnONCommand(pc),
                new TurnOFFCommand(pc));
        sysAdmin.turnOnPc();
        sysAdmin.turnOffPc();
    }
}
