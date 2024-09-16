package CircularLL;

public class Main{
    public static void main ( String[] args ) {
        CircularLL cll = new CircularLL();
        cll.insertfirst ( 2 );
        cll.insertfirst ( 3 );
        cll.insertlast ( 5 );
        cll.insertlast ( 3 );
        cll.Display ();
        cll.insertfirst ( 34 );
    }
}
