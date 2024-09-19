package InterviewQuestions; public class insertRec{
    private Node head;
    private Node  tail;
    private int size;

    public void Display  (){
        Node temp = head;
        while (temp != null){
            System.out.print (temp.val +"->");
            temp = temp.next;
        }
        System.out.println ("END");
    }
    public void insertFist (int val){
        Node node = new Node(val);
        node.next = head;
        head = node;
        if (tail == null){
            tail = node;
        }
        size++;
    }

    public void insertLast (int val){
        if (tail == null){
            insertFist(val);
        }
        Node node = new Node(val);
        tail.next = node;
        node.next = null;
        tail = node;
    }


    public void insertRec (int val, int index){
        head = insertRec (val,index,head);

    }
    private Node insertRec (int val,int index , Node node ){

        if (index == 0){
            Node temp = new Node ( val,node );
            size++;
            return temp;
        }
        node.next  = insertRec(val,index-1 ,node.next);
        return node;
    }
    public void removeDuplicated (){
       Node node = head;
       while (node.next != null){
           if (node.val == node.next.val){
               node.next = node.next.next;
               size--;
           }else {
               node = node.next;
           }
       }
       tail = node ;
       tail.next = null;
    }
    public static insertRec merge  (insertRec list1 , insertRec list2 ){
        Node l1 = list1.head;
        Node l2 = list2.head;
        insertRec ans = new insertRec();

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
        int val ;
        Node next;

        public Node (int val) {
            this.val = val;
        }
        public Node (int val, Node next) {
            this.val = val;
            this.next = next;
        }

    }
}
