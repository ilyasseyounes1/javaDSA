package InnerClasses;

public class AnonymousInnerClass{
    static class A{
        public void print () {
            System.out.println ( "in A Print" );
        }
    }

    public static void main(String[] args) {
        A a = new A(){
            @Override
            public  void print () {
                System.out.println ("in new print");
            }
        };
        //Anonymous inner classes help simplify code by avoiding
        // the need for separate named classes for small tasks.

        a.print ();
    }
}

