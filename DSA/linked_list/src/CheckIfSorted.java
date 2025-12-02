public class CheckIfSorted {
    public int solve(ListNode A) {
        ListNode temp = A;
        int prev = temp.val;
        while(temp != null){
            if(temp.val < prev){
                return 0;
            }
            prev = temp.val;
            temp = temp.next;
        }
        return 1;
    }
}
