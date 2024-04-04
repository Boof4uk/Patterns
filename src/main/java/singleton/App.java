package singleton;

public class App {
    public static void main(String[] args) {
        CustomLogger customLogger1 = CustomLogger.getInstance();
        CustomLogger customLogger2 = CustomLogger.getInstance();
        CustomLogger customLogger3 = CustomLogger.getInstance();
        customLogger1.addLogg("1 logg" + customLogger1.toString());
        customLogger2.addLogg("1 logg" + customLogger2.toString());
        customLogger3.addLogg("1 logg" + customLogger3.toString());

        System.out.println("__________________");
        customLogger1.showLoggFile();
    }
}
