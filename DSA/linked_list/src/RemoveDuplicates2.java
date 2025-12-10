public class RemoveDuplicates2 {
    public ListNode deleteDuplicates(ListNode A) {
        ListNode curr = A;
        while(curr != null && curr.next != null){
            if(curr.val == curr.next.val){
                curr.next = curr.next.next;
            }
            else{
                curr = curr.next;
            }
        }
        return A;
    }
}