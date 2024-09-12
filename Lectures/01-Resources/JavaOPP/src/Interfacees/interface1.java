package Interfacees;

interface A {
    // var is by default final and static:
    int age = 21;
    String Area = "marrakech" ;
    void show();
    void config(); // its public and abstract by default.
}
interface X {
    void run();
}

class  B implements A , X {
    @Override
    public void show (){
        System.out.println ("in show");
    }
    @Override
    public void config (){
        System.out.println ("in config");
    }

    @Override
    public void run () {
        System.out.println ("in run");
    }
}

public class interface1{
    public static void main ( String[] args ) {
        // A obj = new A(); u cant creat obj for interfaces.
       A obj = new B ();
       obj.show ();
       X obj2 = new B ();
       obj2.run ();

    }
}
