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
