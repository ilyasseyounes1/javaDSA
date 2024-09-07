package OPP3.Polymorphism;

public class Main {
    public static void main ( String[] args ) {
        Shapes shape = new Shapes ();
        Circle circle = new Circle ();
        Square square = new Square ();
        Shapes square2 = new Square ();

        shape.area();
        square2.area ();
        /* *****************************************************
        Types of polymorphism:
        ---> 1 compile time / Static Polymorphism;
        this can be achieved via method overloading.
        methode overloading means: same name but types, arguments, return type ordering and be different.
         i.e   A a = new A();
               A a = new A (3,4);
              ********************************************************* */
        /* ---> 2 Runtime /Dynamic Polymorphism
        Overriding by method overriding
        so, how it works:
        parent obj = new child ();
        here, which method will be called depend on child
        this is known as UPcasting
       + child def which to run
       + parent def which to access
          -->"parent : u can access an Area fun but which one ??? that is defined by the obj (child in this case) "
          ---> how java determines which version of that method to call: dynamic method dispatch
         */
    }
}
