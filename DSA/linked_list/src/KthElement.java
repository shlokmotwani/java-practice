public class KthElement {
    public int solve(ListNode A, int B) {
        int count = 0;
        ListNode temp = A;
        while(temp != null && count < B){
            count++;
            temp = temp.next;
        }
        return temp.val;
    }
}
