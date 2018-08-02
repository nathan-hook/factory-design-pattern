package name.nch.factory.impl;

import name.nch.factory.Shape;
import name.nch.factory.ShapeFactory;

public class ShapeFactoryImpl implements ShapeFactory {

    public Shape createSquare() {
        return new Square();
    }

    public Shape createCircle() {
        return new Circle();
    }
}
