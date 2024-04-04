package decorator.base;

/** Реализация самого базового класса нашего интерфейса
 * Данная реализация необходима, чтобы был базовый объект определенного типа,
 * над которым мы будем иметь возможность сделать доп функциональность
 */
public class JavaDeveloper implements Developer{
    @Override
    public void writeCode() {
        System.out.println("Writing java code...");
    }
}
