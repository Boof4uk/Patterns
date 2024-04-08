package composite;

public class App {
    public static void main(String[] args) {
        Shape shape0 = new Circle();
        Shape shape1 = new Circle();
        Shape shape2 = new Square();
        Shape shape3 = new Circle();
        CompositeShape compositeShape1 = new CompositeShape();
        CompositeShape compositeShape2 = new CompositeShape();
        CompositeShape compositeShape3 = new CompositeShape();

        compositeShape1.addElement(shape0);
        compositeShape1.addElement(shape2);
        compositeShape1.addElement(shape3);
        compositeShape2.addElement(compositeShape1);
        compositeShape3.addElement(compositeShape2);


        compositeShape1.draw();
        compositeShape2.draw();
        compositeShape3.draw();

    }
}
