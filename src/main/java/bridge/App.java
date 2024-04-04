package bridge;

import bridge.abstraction.BankProgram;
import bridge.abstraction.Program;
import bridge.abstraction.WebsiteProgram;
import bridge.implementations.JavaDeveloper;
import bridge.implementations.JavascriptDeveloper;

public class App {
    public static void main(String[] args) {
        Program[] programs = {new WebsiteProgram(new JavascriptDeveloper()),
                new BankProgram(new JavaDeveloper())};
        for(Program program : programs) {
            program.developProgram();
        }
    }
}
