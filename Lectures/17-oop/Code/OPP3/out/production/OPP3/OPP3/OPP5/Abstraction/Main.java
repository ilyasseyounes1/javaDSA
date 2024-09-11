package OPP5.Abstraction;

public class Main{
    public static void main ( String[] args ) {

        Son son = new Son ( 22 );
        son.Career ();
        son.Partner ();

        Daughter daughter = new Daughter ( 33 );
        daughter.Career ();
        daughter.Partner ();

        System.out.println ( son.age );
        System.out.println ( daughter.age );

        // Parent mom = new Parent (); u cant creat an obj of an abstract class.
        // u cant also create abstract constractors.

    }
}