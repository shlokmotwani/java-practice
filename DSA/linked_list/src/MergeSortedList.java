public class MergeSortedList {
    public ListNode mergeTwoLists(ListNode A, ListNode B) {
        if(A == null){
            return B;
        }
        if(B == null){
            return A;
        }

        ListNode p1 = A;
        ListNode p2 = B;
        ListNode head = null;
        ListNode tail = null;
        if(A.val <= B.val){
            head = A;
            tail = A;
            p1 = p1.next;
        }
        else{
            head = B;
            tail = B;
            p2 = p2.next;
        }

        while(p1 != null && p2 != null){
            if(p1.val <= p2.val){
                tail.next = p1;
                tail = p1;
                p1 = p1.next;
            }
            else{
                tail.next = p2;
                tail = p2;
                p2 = p2.next;
            }
        }

        if(p1 != null){
            tail.next = p1;
        }

        if(p2 != null){
            tail.next = p2;
        }

        return head;
    }
}
