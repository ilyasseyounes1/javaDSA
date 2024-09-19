package InterviewQuestions;

import java.util.LinkedList;

public class Main{
    public static void main ( String[] args ) {
        insertRec list = new insertRec();
        System.out.println ("insert using rec");
        list.insertLast ( 1 );
        list.insertLast ( 3 );
        list.insertLast ( 5 );
        list.Display ();
        insertRec list2 = new insertRec();
        list2.insertLast ( 2 );
        list2.insertLast ( 4 );
        list2.insertLast ( 6 );
        list2.Display ();

        insertRec ans = insertRec.merge ( list,list2 );
        ans.Display ();
    }

}
