public class PalindromeList {
    public int lPalin(ListNode A) {
        ListNode slow = A;
        ListNode fast = A;
        if(A.next == null){
            return 1;
        }

        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode p1 = A;
        ListNode p2 = slow.next;
        slow.next = null;
        p2 = reverseList(p2);
        while(p1 != null && p2 != null){
            if(p1.val != p2.val){
                return 0;
            }
            p1 = p1.next;
            p2 = p2.next;
        }
        // if(p1 != null || p2 != null){
        //     return 0;
        // }
        return 1;
    }

    public static ListNode reverseList(ListNode A){
        if(A == null){
            return null;
        }
        ListNode prev = null;
        ListNode curr = A;
        ListNode nextNode = A;
        while(curr != null){
            nextNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextNode;
        }
        return prev;
    }
}
