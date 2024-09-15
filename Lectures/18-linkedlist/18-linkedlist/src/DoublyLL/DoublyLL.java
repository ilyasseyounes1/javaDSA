package DoublyLL;

public class DoublyLL{
    private Node head;
    private Node tail;
    private int size;

    public void insertFirst ( int val ) {
        Node node = new Node ( val );
        node.next = head;
        node.prev = null;
        if ( head != null ) {
            head.prev = node;
        }
        head = node;
    }

    public void Display () {
        Node node = head;
        Node last = null;
        while ( node != null ) {
            System.out.print ( node.val + "->" );
            last = node;
            node = node.next;
        }
        System.out.println ( "End" );
        System.out.println ( "print in reverse" );
        while ( last != null ) {
            System.out.print ( last.val + "->" );
            last = last.prev;
        }
        System.out.println ( "Start" );
    }
/*
    public void insertLast(int val) {
        Node node = new Node(val);
        Node last = head;

        node.next = null;

        if (head == null) {
            node.prev = null;
            head = node;
            return;
        }

        while (last.next != null) {
            last = last.next;
        }

        last.next = node;
        node.prev = last;
    }
*/

    public void insertLast ( int val ) {
        Node last = new Node ( val );
        if ( tail == null ) {
            insertFirst ( val );
            return;
        }
        tail.next = last;
        last.next = null;
        last.prev = tail;
        tail = last;
        size++;
    }

    public Node find ( int val ) {
        Node node = head;
        while ( node != null ) {
            if ( node.val == val ) {
                return node;
            }
            node = node.next;
        }
        return null;
    }

    public void insert ( int after , int val ) {
        Node Prev = find ( after );
        if ( Prev != null ) {
            System.out.println ( "prev dose not exist" );
            return;
        }
        Node node = new Node ( val );
        node.next = Prev.next;
        node.prev = Prev;
        if ( Prev == null ) {
            node.next.prev = node;
        }


    }


    private class Node{
        int val;
        Node next;
        Node prev;

        public Node ( int val , Node next , Node prev ) {
            this.val = val;
            this.next = next;
            this.prev = prev;
        }

        public Node ( int val ) {
            this.val = val;
        }
    }
}
