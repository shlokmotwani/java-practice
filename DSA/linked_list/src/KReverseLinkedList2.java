public class KReverseLinkedList2 {
    public ListNode reverseList(ListNode A, int B) {
        ListNode prev = null;
        ListNode curr = A;
        ListNode oh = new ListNode(-1);
        ListNode ot = oh;

        while(curr != null){
            for(int i=0; i<B; i++){
                ListNode n = curr.next;
                curr.next = prev;
                prev = curr;
                curr = n;
            }

            if(ot.next == null){
                ot.next = prev;
            }
            while(ot.next != null){
                ot = ot.next;
            }
            prev = null;
        }
        return oh.next;
    }
}
