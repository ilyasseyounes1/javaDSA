package CollectionFrameWork;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Collection{
    public static void main ( String[] args ) {
        List<Integer> list = new ArrayList<Integer> ();
        List<Integer> list2 = new LinkedList<> ();
        list2.add ( 3 );
        list.isEmpty ();
        list2.add ( 4 );
        list2.add ( 5 );
        list2.add ( 6 );
        list2.add ( 7 );

        System.out.println (list2);

        List<Integer> vector = new Vector<> ();
        vector.add ( 1 );
        vector.add ( 2 );
        vector.add ( 3 );
        // vectors is like ArrayList but Asynchronous which means you can access it by multiple threads
        // while you can access ArrayList .(ArrayList fast then vectors).

    }
}
