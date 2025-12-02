public class DeleteInLinkedList {
    public ListNode solve(ListNode A, int B) {
        int count = 0;
        ListNode temp = A;
        while(temp!=null){
            count++;
            temp = temp.next;
        }
        int N = count;
        if(B >= N){
            return A;
        }

        if(B == 0){
            A = A.next;
            return A;
        }

        count = 0;
        ListNode prev = null;
        ListNode curr = A;
        ListNode nextNode = curr.next;
        while(count < B){
            nextNode = nextNode.next;
            prev = curr;
            curr = curr.next;
            count++;
        }
        prev.next = nextNode;
        return A;
    }
}
