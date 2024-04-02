package FactoryMethod;

import FactoryMethod.developerFactories.DeveloperFactory;
import FactoryMethod.developerFactories.JavaDeveloperFactory;
import FactoryMethod.developerFactories.KotlinDeveloperFactory;
import FactoryMethod.developerFactories.PhpDeveloperFactory;
import FactoryMethod.developers.Developer;

public class Program {
    private static DeveloperFactory developerFactory;

    public static void main(String[] args) {
        developerFactory = Program.createDeveloperFactoryBySpeciality("php");
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
