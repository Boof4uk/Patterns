package chainOfResponsibility;

public abstract class Reporter {
    private int priority;
    private Reporter nextReporter; //

    Reporter(int priority) {
        this.priority = priority;
    }

    Reporter(int priority, Reporter nextReporter) {
        this.nextReporter = nextReporter;
        this.priority = priority;
    }

    public void setNextNotifier(Reporter reporter) {
        this.nextReporter = reporter;
    }

    //
    public void notifyManager(String status, int reportLevel) {
        if (reportLevel >= priority ) {
            sendStatus(status);
        }
        if (nextReporter != null) {
            nextReporter.notifyManager(status, reportLevel);
        }
    }

    public abstract void sendStatus(String status);

}
