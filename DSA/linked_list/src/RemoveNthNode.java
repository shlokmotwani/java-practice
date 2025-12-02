public class RemoveNthNode {
    public ListNode removeNthFromEnd(ListNode A, int B) {
        ListNode temp = A;
        int count = 0;
        while(temp != null){
            count++;
            temp = temp.next;
        }
        int N = count;

        int targetIdx = N - B;

        if(B <= 0 || B > N || targetIdx == 0){
            return A.next;
        }

        temp = A;
        int i = 0;
        while(temp != null && i < targetIdx-1){
            i++;
            temp = temp.next;
        }

        if(temp.next == null){
            return null;
        }

        if(temp.next.next == null){
            temp.next = null;
        }
        else{
            temp.next = temp.next.next;
        }

        return A;
    }
}
