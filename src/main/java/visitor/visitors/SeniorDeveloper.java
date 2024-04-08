package visitor.visitors;

import visitor.accepters.ProjectElement;

public class SeniorDeveloper implements Developer{
    @Override
    public void visitJavaCodeElement(ProjectElement projectElement) {
        System.out.println("Fixing bugs after junior");
    }

    @Override
    public void visitTestCodeElement(ProjectElement projectElement) {
        System.out.println("Looking for junior");
    }

    @Override
    public void visitDatabaseElement(ProjectElement projectElement) {
        System.out.println("Refactoring database");
    }
}
