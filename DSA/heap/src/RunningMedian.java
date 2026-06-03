import java.util.Collections;
import java.util.PriorityQueue;

public class RunningMedian {
    public int[] solve(int[] A) {
        int N = A.length;
        int[] result = new int[N];
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        maxHeap.add(A[0]);
        result[0] = A[0];

        for(int i=1; i<N; i++){
            if(A[i] <= maxHeap.peek()){
                maxHeap.add(A[i]);
            }
            else{
                minHeap.add(A[i]);
            }
            if(Math.abs(maxHeap.size() - minHeap.size()) > 1){
                balance(maxHeap, minHeap);
            }

            if(maxHeap.size() >= minHeap.size()){
                result[i] = maxHeap.peek();
            }
            else{
                result[i] = minHeap.peek();
            }
        }
        return result;
    }

    public void balance(PriorityQueue<Integer> maxHeap, PriorityQueue<Integer> minHeap){
        if(maxHeap.size() > minHeap.size()){
            minHeap.add(maxHeap.remove());
        }
        else{
            maxHeap.add(minHeap.remove());
        }
    }
}
