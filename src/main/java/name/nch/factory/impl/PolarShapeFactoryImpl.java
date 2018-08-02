package name.nch.factory.impl;

import name.nch.factory.Shape;
import name.nch.factory.ShapeFactory;

public class PolarShapeFactoryImpl implements ShapeFactory {
    public Shape createSquare() {
        return new PolarSquare();
    }

    public Shape createCircle() {
        return new PolarCircle();
    }
}
