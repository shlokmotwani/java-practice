public class InsertInLinkedList {
    public ListNode solve(ListNode A, int B, int pos) {
        ListNode temp = A;
        ListNode newNode = new ListNode(B);
        if(A == null){
            A = newNode;
            return A;
        }
        if(pos == 0){
            newNode.next = A;
            A = newNode;
            return A;
        }
        int count = 0;
        while(temp.next != null && count < pos-1){
            temp = temp.next;
            count++;
        }
        if(temp.next == null){
            temp.next = newNode;
        }
        else{
            newNode.next = temp.next;
            temp.next = newNode;
        }
        return A;
    }
}
