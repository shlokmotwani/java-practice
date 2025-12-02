public class CompareLinkedLists {
    public int solve(ListNode A, ListNode B) {
        ListNode tempA = A;
        ListNode tempB = B;
        while(tempA != null && tempB != null){
            if(tempA.val != tempB.val){
                return 0;
            }
            tempA = tempA.next;
            tempB = tempB.next;
        }
        if(tempA == null && tempB == null){
            return 1;
        }
        return 0;
    }
}
