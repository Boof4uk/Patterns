package command;

/**
 * Класс, описывающий логику, которой клиент должен управлять, не зная ее детали
 */
public class Computer {

    public void turnOff() {
        System.out.println("PC is turning OFF, pls wait...");
    }

    public void turnON() {
        System.out.println("PC is turning ON, be happy!");
    }
}
