public class RemoveDuplicates {
    public ListNode deleteDuplicates(ListNode A) {
        ListNode temp = A;
        if(temp == null || temp.next == null){
            return A;
        }
        ListNode nextNode = temp.next;
        while(temp != null && nextNode != null){
            if(nextNode.val == temp.val){
                nextNode = nextNode.next;
            }
            else{
                temp.next = nextNode;
                temp = nextNode;
                if(nextNode != null){
                    nextNode = nextNode.next;
                }
            }
        }
        if(nextNode == null){
            temp.next = null;
        }
        return A;
    }
}
