import java.util.Arrays;
import java.util.PriorityQueue;

public class InventoryManagement {
    public int solve(int[] A, int[] B) {
        int N = A.length;
        int time = 0;
        int maxProfit = 0;
        int MOD = 1000000007;

        Pair[] pairs = new Pair[N];
        for(int i=0; i<N; i++){
            Pair pair = new Pair(A[i], B[i]);
            pairs[i] = pair;
        }

        Arrays.sort(pairs);
        PriorityQueue<Pair> pq = new PriorityQueue<>((a, b) -> a.profit - b.profit);
        for(int i=0; i<N; i++){
            Pair curr = pairs[i];

            if(time < curr.expiry){
                pq.add(curr);
                time++;
            }
            else if(!pq.isEmpty() && curr.profit > pq.peek().profit){
                pq.remove();
                pq.add(curr);
            }
        }

        while(!pq.isEmpty()){
            Pair curr = pq.remove();
            maxProfit = (maxProfit + curr.profit) % MOD;
        }
        return maxProfit;
    }

    class Pair implements Comparable<Pair>{
        int expiry;
        int profit;

        Pair(int expiry, int profit){
            this.expiry = expiry;
            this.profit = profit;
        }

        public int compareTo(Pair a){
            return this.expiry - a.expiry;
        }
    }
}
