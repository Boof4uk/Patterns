package observer;

public class App {
    public static void main(String[] args) {
        MetioStation metioStation = new MetioStation();
        metioStation.addObserver(new ConsoleObserver());
        metioStation.setTempPressure(-19, 678);
    }
}
