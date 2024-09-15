package DoublyLL;

public class Main{
    public static void main ( String[] args ) {
   DoublyLL dll = new DoublyLL();
   dll.insertFirst ( 1 );
   dll.insertFirst ( 2 );
   dll.insertFirst ( 3 );
   dll.insertFirst ( 4 );
   dll.insertFirst ( 5 );

   dll.Display ();
   dll.insertLast ( 12 );
   dll.Display ();
   dll.insertLast ( 16 );
   dll.Display ();

   dll.insert ( 4,66 );
   dll.Display ();
    }
}
