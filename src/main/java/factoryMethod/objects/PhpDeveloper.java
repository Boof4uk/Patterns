package factoryMethod.objects;

public class PhpDeveloper implements Developer{
    @Override
    public void writeCode() {
        System.out.println("PhpDev writes PhpCode");
    }
}
