package FactoryMethod.developerFactories;

import FactoryMethod.developers.Developer;
import FactoryMethod.developers.PhpDeveloper;

public class PhpDeveloperFactory implements DeveloperFactory {
    @Override
    public Developer createDeveloper() {
        return new PhpDeveloper();
    }
}
