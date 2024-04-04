package factoryMethod.factories;

import factoryMethod.objects.Developer;
import factoryMethod.objects.PhpDeveloper;

public class PhpDeveloperFactory implements DeveloperFactory {
    @Override
    public Developer createDeveloper() {
        return new PhpDeveloper();
    }
}
