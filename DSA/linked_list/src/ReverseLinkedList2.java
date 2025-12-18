public class ReverseLinkedList2 {
    public ListNode reverseBetween(ListNode A, int B, int C) {
        if(A.next == null || B == C){
            return A;
        }

        ListNode temp = A;
        ListNode beforeStart = null;
        int count = 1;

        while(temp != null && count < B){
            beforeStart = temp;
            temp = temp.next;
            count++;
        }
        ListNode start = temp;
        ListNode prev = temp;
        ListNode nn = null;
        temp = temp.next;
        // count++;
        while(temp != null && count < C){
            nn = temp.next;
            temp.next = prev;
            prev = temp;
            temp = nn;
            count++;
        }

        start.next = nn;
        if(beforeStart == null){
            // list has been reversed up till head node
            A = prev;
        }
        else{
            beforeStart.next = prev;
        }
        return A;
    }
}
