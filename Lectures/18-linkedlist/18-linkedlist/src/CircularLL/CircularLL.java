package CircularLL;

public class CircularLL{
    // in null here.
    private Node head;
    private Node  tail;
    private int size;
    public void insertfirst (int val){
        Node node = new Node(val);
        node.next = head;
        if(head != null){
            head = node;
        }
        size++;

    }
    public void insertlast (int val){
        if(tail == null){
            insertfirst(val);
        }
        Node node = new Node(val);
        tail.next = node;
        node.next = head;
        size++;

    }
    public void Display (){
        if (size == 0){
            return;
        }
        Node temp = head;
        while (temp != null){
            System.out.println (temp.val+"->");
            temp = temp.next;
        }
        System.out.println ("END");
    }





    private class Node {
        int val;
        Node next;

        public Node ( int val ) {
            this.val = val;
        }

        public Node ( int val , Node next ) {
            this.val = val;
            this.next = next;
        }
    }
}
