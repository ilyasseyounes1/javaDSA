package InterviewQuestions;

public class CycleDetection{

    // Cycle detection : Fast & Slow pointer method.
    public boolean hasCycle ( Node head ) {
        Node slow = head;
        Node fast = head;
        while ( fast != null && fast.next != null ) {
            slow = slow.next;
            fast = fast.next.next;
            if ( slow == fast ) {
                return true;
            }
        }
        return false;
    }

    public int lengthCyle ( Node head ) {
        Node slow = head;
        Node fast = head;
        while ( fast != null && fast.next != null ) {
            slow = slow.next;
            fast = fast.next.next;
            if( fast == slow ) {
                Node temp = slow;
                int lenght = 0;
                do {
                temp = temp.next;
                lenght++;
                }while ( temp != slow );
                    return lenght;
            }
        }
        return 0;
    }
    // find Start of a Cycle;
    public Node detectCycle ( Node head ) {
        int lenght = 0;
        Node slow = head;
        Node fast = head;
        while ( fast != null && fast.next != null ) {
            slow = slow.next;
            fast = fast.next.next;
            if ( slow == fast ) {
                lenght = lengthCyle (slow);
                break;
            }

            }
        if (lenght == 0 ){
            return null;
        }
        // find the start:
        Node f = head;
        Node s = head;
        while ( lenght > 0 ){
            s = s.next;
            lenght--;
        }
        // keep moving both forward they will meet at the start.
        while (f != s ){
            f = f.next;
            s = s.next;
        }
        return s;
    }
    public boolean HappyNumber ( int n ) {
        int slow = n;
        int fast = n;
        do {
            slow = findSquare ( slow );
            fast = findSquare ( findSquare ( fast ) );
        }while ( slow != fast );
        if (slow == 1){
            return true;
        }
        return false;
    }
        private int findSquare (int number ){
            int ans = 0;
            while ( number != 0 ){
                int rem = number % 10;
                ans += rem * rem;
                number /= 10;
            }
            return ans;
        }

    public Node MiddleOfLL ( Node head ) {
        Node fast = head;
        Node slow = head;
        while (fast != null && fast.next != null ) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }







    private class Node {
        int val;
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
