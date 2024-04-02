package FactoryMethod.developerFactories;

import FactoryMethod.developers.Developer;
import FactoryMethod.developers.JavaDeveloper;

public class JavaDeveloperFactory implements DeveloperFactory {

    @Override
    public Developer createDeveloper() {
        return new JavaDeveloper();
    }
}
