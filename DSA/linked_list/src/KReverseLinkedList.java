public class KReverseLinkedList {
    public ListNode reverseList(ListNode A, int B) {
        if(B < 2){
            return A;
        }
        int count = 0;
        ListNode temp = A;
        ListNode nn = null;
        ListNode start = null;
        ListNode prev = null;
        boolean headChanged = false;
        while(temp != null && count < B){
            nn = temp.next;
            if(prev != null){
                temp.next = prev;
            }
            else{
                start = temp;
            }
            prev = temp;
            temp = nn;
            count = (count+1) % B;
            if(count == 0){
                ListNode dummyHead = temp;
                int newCount = 1;
                while(dummyHead != null && newCount < B){
                    dummyHead = dummyHead.next;
                    newCount++;
                }
                start.next = dummyHead;
                start = temp;
                if(!headChanged){
                    A = prev;
                    headChanged = true;
                }
            }
        }
        return A;
    }
}
