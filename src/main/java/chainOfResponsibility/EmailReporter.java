package chainOfResponsibility;

public class EmailReporter extends Reporter{

    EmailReporter(int priority) {
        super(priority);
    }
    EmailReporter(int priority, Reporter nextReporter) {
        super(priority, nextReporter);
    }
    @Override
    public void sendStatus(String status) {
        System.out.println("Отправка статус на email: " + status);
    }
}
