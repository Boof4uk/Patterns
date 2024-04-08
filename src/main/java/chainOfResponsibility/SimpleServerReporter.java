package chainOfResponsibility;

public class SimpleServerReporter extends Reporter {
    public SimpleServerReporter(int priority) {
        super(priority);
    }

    SimpleServerReporter(int priority, Reporter nextReporter) {
        super(priority, nextReporter);
    }
    @Override
    public void sendStatus(String status) {
        System.out.println("Серверный лог: " + status);
    }
}
