package bridge.abstraction;

import bridge.abstraction.Program;
import bridge.implementations.Developer;

public class WebsiteProgram extends Program {
    public WebsiteProgram(Developer developer) {
        super(developer);
    }

    @Override
    public void developProgram() {
        System.out.println("Website development in progress...");
        developer.writeCode();
    }
}
