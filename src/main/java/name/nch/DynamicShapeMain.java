package name.nch;

import name.nch.factory.impl.PolarShapeFactoryImpl;
import name.nch.factory.impl.ShapeFactoryImpl;

public class DynamicShapeMain {

    public static void main(String... args) {

        Application application = new Application(new ShapeFactoryImpl());

        application.execute();

        application.setShapeFactory(new PolarShapeFactoryImpl());

        application.execute();
    }
}
