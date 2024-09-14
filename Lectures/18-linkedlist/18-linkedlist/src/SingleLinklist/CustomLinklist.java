package SingleLinklist;

public class CustomLinklist{
    private Node head;
    private Node tail;
    private int size;

    public CustomLinklist (){
        this.size = 0;
    }

    public void Display (){
        Node temp = head;
        while (temp != null){
            System.out.print (temp.value + "->");
            temp = temp.next;
        }
        System.out.println ("END");
    }

    public void inserFirst (int value) {
        Node node = new Node (value);
        node.next = head;
        head = node;

        if (tail == null) {
            tail = node;
        }
        size +=1;
    }

    public void inserLast (int value) {
        if (tail == null) {
            inserFirst (value);
            return;
        }
        Node node = new Node (value);
        tail.next = node;
        tail = node;
        size++;
    }

    public void insert (int value ,int position) {
        if (position == size) {
            inserLast ( value );
            return;
        }
        if (position == 0) {
            inserFirst (value);
            return;
        }
        Node temp = head;
        for (int i = 1; i < position ; i++) {
            temp = temp.next;
        }
        Node node = new Node (value,temp.next);
        temp.next = node;
        size++;
    }

    public int RemoveFirst (){
        int value = head.value;
        head = head.next;
        if (head == null) {
            tail = null;
        }
        size --;
        return value;

    }
    public Node get (int index) {
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }
    public int deletLast () {
        if (size <= 1) {
            return RemoveFirst ();
        }
        
    }

    private class Node {


        private int value;
        private Node next;

        public Node ( int value, Node next ) {
            this.next = next;
            this.value = value;
        }

        public Node ( int value ) {
            this.value = value;
        }


    }


}
