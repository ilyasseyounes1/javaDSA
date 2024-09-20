package InterviewQuestions;

import java.util.LinkedList;

public class Main{
    public static void main ( String[] args ) {
        Marge2LL list = new Marge2LL ();
        System.out.println ("insert using rec");
        list.insertLast ( 1 );
        list.insertLast ( 3 );
        list.insertLast ( 5 );
        list.Display ();
        Marge2LL list2 = new Marge2LL ();
        list2.insertLast ( 2 );
        list2.insertLast ( 4 );
        list2.insertLast ( 6 );
        list2.Display ();

        Marge2LL ans = Marge2LL.merge ( list,list2 );
        ans.Display ();
        CycleDetection cll = new CycleDetection();
    }

}
