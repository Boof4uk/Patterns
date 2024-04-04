package factoryMethod;


import factoryMethod.factories.DeveloperFactory;
import factoryMethod.factories.JavaDeveloperFactory;
import factoryMethod.factories.KotlinDeveloperFactory;
import factoryMethod.factories.PhpDeveloperFactory;
import factoryMethod.objects.Developer;

/**
 * Клиентский код.
 * Для того чтобы получать конкретный объекты, не зная реализации
 * нам нужно знать конкретную фабрику, которая производит эти объекты
 */
class Application {
    private static DeveloperFactory developerFactory;

    public static void main(String[] args) {
        developerFactory = Application.createDeveloperFactoryBySpeciality("php");
        Developer developer = developerFactory.createDeveloper();
        developer.writeCode();
    }

    public static DeveloperFactory createDeveloperFactoryBySpeciality(String speciality) {
        return switch (speciality) {
            case "java" -> new JavaDeveloperFactory();
            case "php" -> new PhpDeveloperFactory();
            case "kotlin" -> new KotlinDeveloperFactory();
            default -> throw new RuntimeException("Фабрики для данной специальности не найдено");
        };


    }


}
