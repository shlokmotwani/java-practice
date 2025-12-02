public class SumOfTwoNumbers {
    public ListNode addTwoNumbers(ListNode A, ListNode B) {
        ListNode p1 = A;
        ListNode p2 = B;
        ListNode head = null;
        ListNode tail = null;
        int carry = 0;
        while(p1 != null && p2 != null){
            int value = p1.val + p2.val + carry;
            ListNode node = new ListNode(value % 10);
            carry = value / 10;
            if(head == null){
                head = node;
            }
            else{
                tail.next = node;
            }
            tail = node;
            p1 = p1.next;
            p2 = p2.next;
        }
        if(p1 != null){
            tail.next = p1;
            tail = p1;
        }
        if(p2 != null){
            tail.next = p2;
            tail = p2;
        }
        while(carry != 0 && tail != null){
            int value = tail.val + carry;
            int rem = value % 10;
            carry = value / 10;
            tail.val = rem;
            if(tail.next == null && carry > 0){
                tail.next = new ListNode(carry);
                tail = tail.next;
                return head;
            }
            tail = tail.next;
        }

        return head;
    }
}
