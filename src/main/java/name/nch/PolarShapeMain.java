package name.nch;

import name.nch.factory.impl.PolarShapeFactoryImpl;

public class PolarShapeMain {

    public static void main(String... args) {

        Application application = new Application(new PolarShapeFactoryImpl());

        application.execute();
    }
}
