package factoryMethod.factories;

import factoryMethod.objects.Developer;
import factoryMethod.objects.KotlinDeveloper;

public class KotlinDeveloperFactory implements DeveloperFactory {
    @Override
    public Developer createDeveloper() {
        return new KotlinDeveloper();
    }
}
