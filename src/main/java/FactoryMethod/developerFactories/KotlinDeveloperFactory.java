package FactoryMethod.developerFactories;

import FactoryMethod.developers.Developer;
import FactoryMethod.developers.KotlinDeveloper;

public class KotlinDeveloperFactory implements DeveloperFactory {
    @Override
    public Developer createDeveloper() {
        return new KotlinDeveloper();
    }
}
