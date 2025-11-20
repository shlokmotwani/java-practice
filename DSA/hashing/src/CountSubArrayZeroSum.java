import java.util.HashMap;

public class CountSubArrayZeroSum {
    public int solve(int[] A) {
        int N = A.length;
        long[] pSum = new long[N];
        int MOD = 1000000007;

        // initialize prefix sum array
        pSum[0] = A[0];
        for(int i = 1; i<N; i++){
            pSum[i] = pSum[i-1] + A[i];
        }

        HashMap<Long, Integer> map = new HashMap<>();
        map.put(0l, 1);
        for(int i=0; i<N; i++){
            long current = pSum[i];
            if(map.containsKey(current)){
                map.put(current, map.get(current)+1);
            }
            else{
                map.put(current, 1);
            }
        }

        int result = 0;
        for(int x: map.values()){
            result = (result + (x * (x-1) / 2)) % MOD;
        }
        return result % MOD;
    }
}
