public class RemoveLoop {
    public ListNode solve(ListNode A) {
        ListNode slow = A;
        ListNode fast = A;
        if(A.next == null){
            return A;
        }

        // detect if a cycle exists
        while(fast!= null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){ // true if the cycle exists
                break;
            }
        }
        if(fast == null || fast.next == null){
            // no cycle exists
            return A;
        }

        // code reaches here only when a cycle exists
        if(fast == A){ // EDGE CASE: check if it is a circular linked list
            while(fast.next != A){
                fast = fast.next;
            }
            fast.next = null;
            return A;
        }

        // remaining cases
        slow = A;
        ListNode prev = null;
        while(slow != fast){
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }
        prev.next = null;
        return A;
    }
}
