package Interfacees;
@java.lang.FunctionalInterface
// Functional interface which is an interface with one method in it.
interface A2{
    void show ();
}
public class FunctionalInterface{
    public static void main ( String[] args ) {
     /*   A2 obj = new A2 (){
            public void show () {
                System.out.println ( "in show" );
            }
        }; */

        A2 obj = () -> System.out.println ("in show");
        // this is called lambda Expression
        // even if u have a value to past : show (int i){..}
        // A2 obj = (5) -> sout ("in show ")
        // also if u the lambda exp has a return in it :
        // A obj = (i,j) -> i+j; " i+j is return value"

    }
}

