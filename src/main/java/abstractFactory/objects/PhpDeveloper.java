package abstractFactory.objects;

public class PhpDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Writing website code");
    }
}
