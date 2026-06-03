import java.util.PriorityQueue;

public class KPlacesApart {
    public int[] solve(int[] A, int B) {
        int N = A.length;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i=0; i<B+1; i++){
            pq.add(A[i]);
        }
        int[] result = new int[N];
        int idx = 0;
        for(int i = B+1; i<N; i++){
            int min = pq.remove();
            pq.add(A[i]);
            result[idx] = min;
            idx++;
        }

        while(!pq.isEmpty()){
            result[idx] = pq.remove();
            idx++;
        }
        return result;
    }
}
