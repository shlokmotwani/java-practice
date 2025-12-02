public class ReverseInSinglePass {
    public ListNode reverseList(ListNode A) {
        ListNode prev = null;
        ListNode curr = A;
        if(curr.next == null){
            return curr;
        }
        ListNode nextNode = curr;
        while(curr != null){
            nextNode = nextNode.next;
            curr.next = prev;
            prev = curr;
            curr = nextNode;
        }
        return prev;
    }
}
