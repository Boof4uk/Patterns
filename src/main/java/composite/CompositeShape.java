package composite;

import java.util.ArrayList;
import java.util.List;

public class CompositeShape implements Shape {
    private List<Shape> shapeElements = new ArrayList<>();

    void addElement(Shape shape) {
        shapeElements.add(shape);
    }

    void deleteElement(Shape shape) {
        shapeElements.remove(shape);
    }
    @Override
    public void draw() {
        for(Shape shape : shapeElements) {
            shape.draw();
        }
    }
}
