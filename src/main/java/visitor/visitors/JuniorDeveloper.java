package visitor.visitors;

import visitor.accepters.ProjectElement;

/**
 * Конкретная реализации визитора
 * -Каждый метод принимает ассептора
 */
public class JuniorDeveloper implements Developer{
    @Override
    public void visitJavaCodeElement(ProjectElement projectElement) {
        System.out.println("Wririting poor code");
    }

    @Override
    public void visitTestCodeElement(ProjectElement projectElement) {
        System.out.println("Losting all tests");
    }

    @Override
    public void visitDatabaseElement(ProjectElement projectElement) {
        System.out.println("Dropping database");
    }
}
