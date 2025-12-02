public class ReverseLinkedLists2 {
    public ListNode reverseBetween(ListNode A, int B, int C) {
        if(B == C){
            return A;
        }

        int startIdx = B-1;
        int endIdx = C-1;

        ListNode prev = null;
        ListNode curr = A;

        int count = 0;
        while(count < startIdx){
            prev = curr;
            curr = curr.next;
            count++;
        }
        ListNode startNode = prev;

        if(startIdx == 0){
            startNode = curr;
        }

        ListNode firstNode = curr;
        ListNode nextNode = null;
        while(count <= endIdx){
            nextNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextNode;
            count++;
        }
        startNode.next = prev;
        firstNode.next = curr;
        return A;
    }
}
