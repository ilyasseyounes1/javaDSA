package InterviewQuestions;


public class MergeSort{
    private Node head;

    public Node sortList (Node head){
        if(head == null || head.next == null) {
            return head;
        }
        Node mid = getMid(head);
        Node left = sortList(head);
        Node right = sortList(mid);
        return merge (left, right);
    }

    Node merge (Node list1, Node list2){
        Node dummyHead = new Node();
        Node tail = dummyHead;
        while (list1 != null && list2 != null){
            if (list1.val < list2.val){
                tail.next = list1;
                list1 = list1.next;
                tail = tail.next;
            }
            else if (list1.val > list2.val){
               tail.next = list2;
               list2 = list2.next;
               tail = tail.next;
            }
        }
        tail.next = (list1 != null) ? list1 : list2;
        return dummyHead.next;
    }
    Node getMid (Node head){
        Node midPrev = null;
        while (head != null && head.next != null){
            midPrev = (midPrev == null) ? head : midPrev.next;
            head = head.next.next;
        }
        Node mid = midPrev.next;
        midPrev.next = null;
        return mid;
    }

    private class Node {
        int val;
        Node next;

        public Node ( int val , Node next ) {
            this.val = val;
            this.next = next;
        }

        public Node ( int val ) {
            this.val = val;
        }
    }
}
