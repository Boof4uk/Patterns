package chainOfResponsibility;

public class TelegramReporter extends Reporter{

    TelegramReporter(int priority) {
        super(priority);
    }
    TelegramReporter(int priority, Reporter nextReporter) {
        super(priority, nextReporter);
    }
    @Override
    public void sendStatus(String status) {
        System.out.println("Отправка статуса в телеграм: " + status);
    }
}
