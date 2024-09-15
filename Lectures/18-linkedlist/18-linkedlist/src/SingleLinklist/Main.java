package SingleLinklist;
import java.util.LinkedList;
public class Main{
    public static void main ( String[] args ) {
        CustomLinklist list = new CustomLinklist();
        list.inserFirst(3);
        list.inserFirst(5);
        list.inserFirst(7);
        list.inserFirst(9);
        list.inserFirst(10);
        list.Display ();

        list.inserLast (12 );
        list.Display ();

        list.insert (100,3 );
        list.Display ();

        list.RemoveFirst ();
        list.Display ();
        System.out.println ("the removed value is : "+list.RemoveFirst ());
        list.deletLast ();
        System.out.println ("last value del : " +list.deletLast ());
        list.Display ();

        //list.delet(1);
        System.out.println ("delet : "+list.delet (1));
        list.Display ();

        System.out.println ("node find ;"+list.Find ( 1 ));
        list.Display ();
    }
}
