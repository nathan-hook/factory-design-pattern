package name.nch;

import name.nch.factory.Shape;
import name.nch.factory.ShapeFactory;

public class Application {

    private ShapeFactory shapeFactory;

    public Application(ShapeFactory shapeFactory) {

        this.shapeFactory = shapeFactory;
    }

    public void execute() {

        Shape circle = shapeFactory.createCircle();

        System.out.println(circle.print());

        Shape square = shapeFactory.createSquare();

        System.out.println(square.print());
    }

    public void setShapeFactory(ShapeFactory shapeFactory) {

        this.shapeFactory = shapeFactory;
    }
}
