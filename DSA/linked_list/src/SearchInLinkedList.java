public class SearchInLinkedList {
    public int solve(ListNode A, int B) {
        ListNode temp = A;
        while(temp != null){
            if(temp.val == B){
                return 1;
            }
            temp = temp.next;
        }
        return 0;
    }
}
