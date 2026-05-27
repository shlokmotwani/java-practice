import java.util.PriorityQueue;

public class HeapQueries {
    public int[] solve(int[][] A) {
        int N = A.length;
        int count = 0;
        for(int i=0; i<N; i++){
            if(A[i][0] == 1){
                count++;
            }
        }
        int[] result = new int[count];
        int k = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i=0; i<N; i++){
            int op = A[i][0];
            int val = A[i][1];
            if(op == 1){
                int num = -1;
                if(pq.size() > 0){
                    num = pq.remove();
                }
                result[k] = num;
                k++;
            }
            else{
                pq.add(val);
            }
        }
        return result;
    }
}
