package factoryMethod.objects;

/**
 * Конкретная реализация общего интерфейса
 */
public class JavaDeveloper implements Developer {

    @Override
    public void writeCode() {
        System.out.println("JavaDev write Java code");
    }
}
