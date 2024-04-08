package visitor.visitors;

import visitor.accepters.ProjectElement;

/**
 * Интерфейс описывает визитора
 * -Каждый метод существует для обработки каждой отдельной реализации ассептера

 *Визитора мы кладем в коде, в котором создаем ассептора
 */
public interface Developer {
    public void visitJavaCodeElement(ProjectElement projectElement);
    public void visitTestCodeElement(ProjectElement projectElement);
    public void visitDatabaseElement(ProjectElement projectElement);
}
