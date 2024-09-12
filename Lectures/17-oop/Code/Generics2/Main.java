package OPP6.Generics2;

import java.util.ArrayList;

public class Main{
    public static void main ( String[] args ) {
        /*
         Printer <Integer> printer = new Printer<> (44 );
         printer.print();
         Printer <String> stringPrinter = new Printer<> ("Hello World" );
         printer.print(); those are no longer work because of bounding the Printer class.
        */

        ArrayList<Cat> cats = new ArrayList<> ();
        cats.add ( new Cat () );
        // cats.add (new Dog () );  Error

    }


}
