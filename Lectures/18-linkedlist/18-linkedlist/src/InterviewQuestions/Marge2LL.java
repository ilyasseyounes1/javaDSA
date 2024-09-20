package InterviewQuestions;

public class Marge2LL{
    private Node head = null;
    private Node tail = null;
    private int size = 0;
    public void insertLast (int val){
        if (tail == null){
            insertFist(val);
        }
        Marge2LL.Node node = new Marge2LL.Node (val);
        tail.next = node;
        node.next = null;
        tail = node;
    }

    public void insertFist (int val){
        Marge2LL.Node node = new Marge2LL.Node (val);
        node.next = head;
        head = node;
        if (tail == null){
            tail = node;
        }
        size++;
    }
    public void Display  (){
        Marge2LL.Node temp = head;
        while (temp != null){
            System.out.print (temp.val +"->");
            temp = temp.next;
        }
        System.out.println ("END");
    }

    public static Marge2LL merge  (Marge2LL list1 , Marge2LL list2 ){
        Marge2LL.Node l1 = list1.head;
        Marge2LL.Node l2 = list2.head;
        Marge2LL ans = new Marge2LL ();

        while (l1 != null && l2 != null){
            if (l1.val < l2.val){
                ans.insertLast ( l1.val );
                l1 = l1.next;
            }else {
                ans.insertLast ( l2.val );
                l2 = l2.next;
            }
        }
        while (l1 != null){
            ans.insertLast ( l1.val );
            l1 = l1.next;
        }
        while (l2 != null){
            ans.insertLast ( l2.val );
            l2 = l2.next;
        }
        return ans;


    }


    private class Node {
        int val;
        Node next;

        public Node ( int val ) {
            this.val = val;
        }

        public Node ( Node next , int val ) {
            this.next = next;
            this.val = val;
        }
    }
}
