package chainOfResponsibility;

public class App {
    public static void main(String[] args) {
        Reporter innerServerReporter = new SimpleServerReporter(Priority.ROUTINE);
        Reporter emailReporter = new EmailReporter(Priority.PROBLEM);
        Reporter telegramReporter = new TelegramReporter(Priority.ALARM);

        innerServerReporter.setNextNotifier(emailReporter);
        emailReporter.setNextNotifier(telegramReporter);

        innerServerReporter.notifyManager("Обычные логи", Priority.ROUTINE);
        innerServerReporter.notifyManager("Не отвечает один из обработчиков", Priority.PROBLEM);
        innerServerReporter.notifyManager("Прод упал", Priority.ALARM);

    }
}
