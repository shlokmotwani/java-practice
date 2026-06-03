import java.util.ArrayList;
import java.util.PriorityQueue;

public class MergeKSortedLists {
    public ListNode mergeKLists(ArrayList<ListNode> A) {
        int N = A.size();
        ListNode result = null;
        ListNode temp = null;

        PriorityQueue<ListNode> pq = new PriorityQueue<>((a, b) -> a.val - b.val);

        for(int i=0; i<N; i++){
            pq.add(A.get(i));
        }

        while(pq.size() != 0){
            ListNode min = pq.peek();
            if(result == null){
                result = min;
                temp = min;
            }
            else{
                temp.next = min;
                temp = temp.next;
            }
            pq.remove();
            if(min.next != null){
                pq.add(min.next);
            }
        }

        return result;
    }
}
