package InnerClasses;

abstract class AbstractAndAnonyInnerClass {
    public abstract void show();
}

class Demo {
    public static void main ( String[] args ) {
        AbstractAndAnonyInnerClass obj = new AbstractAndAnonyInnerClass() {
            @Override
            public void show() {
                System.out.println ("in a show ");
            }
        };
        obj.show();
    }
}