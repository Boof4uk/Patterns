package visitor.accepters;

import visitor.visitors.Developer;

import java.util.ArrayList;
import java.util.List;

/**
 * Данный класс хранит в себе список всех ассепторов (ТОЖЕ РЕАЛИЗУЕТ ИНТЕРФЕЙС АССЕПТОРА)
 * -Поле список ассепторов
 * -метод ассепт осуществяет перебор всех ассепторов в своем списке и вызывает на каждом ассепт
 */
public class FullProject implements ProjectElement{
    private List<ProjectElement> projectElements;

    public FullProject() {
        projectElements = new ArrayList<>();
        projectElements.add(new DatabaseElement());
        projectElements.add(new TestElemente());
        projectElements.add(new JavaCodeElement());
    }
    @Override
    public void acceptDeveloper(Developer developer) {
        for(ProjectElement projectElement : projectElements) {
            projectElement.acceptDeveloper(developer);
        }
    }
}
