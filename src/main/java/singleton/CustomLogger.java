package singleton;

public class CustomLogger {
    private static CustomLogger customLogger;
    private static StringBuilder loggFile;

    private CustomLogger() {
        loggFile = new StringBuilder();
    }

    public static CustomLogger getInstance() {
        if (customLogger == null) {
            customLogger = new CustomLogger();

        }
        return customLogger;
    }

    /**
     * Этот инстанс может использоваться в многопоточной среде
     * Если синглтон еще не инициализирован, то метод будет выполняться синхронизовано,
     * но как только  он будет ининциализирован, то потоки просто не будут заходить в
     * синхронизированный блок
     */

    public static CustomLogger getSinchInstance() {
        if (customLogger == null) {
            synchronized (CustomLogger.class) {
                if (customLogger == null) {
                    customLogger = new CustomLogger();
                }
            }
        }
        return customLogger;
    }

    public void addLogg(String s) {
        loggFile.append(s + "\n");
    }

    public void showLoggFile() {
        System.out.println(loggFile);
    }
}
