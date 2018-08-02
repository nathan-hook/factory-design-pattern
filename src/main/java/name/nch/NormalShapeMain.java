package name.nch;

import name.nch.factory.impl.ShapeFactoryImpl;

public class NormalShapeMain {

    public static void main(String... args) {

        Application application = new Application(new ShapeFactoryImpl());

        application.execute();
    }
}
