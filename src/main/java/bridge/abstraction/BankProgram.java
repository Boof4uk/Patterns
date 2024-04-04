package bridge.abstraction;

import bridge.abstraction.Program;
import bridge.implementations.Developer;

public class BankProgram extends Program {
    public BankProgram(Developer developer) {
        super(developer);
    }

    @Override
    public void developProgram() {
        System.out.println("Bank system development in progress...");
        developer.writeCode();
    }
}
