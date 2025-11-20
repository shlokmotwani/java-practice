import java.util.HashMap;
public class LongestSubArrayZeroSum {
    public int solve(int[] A) {
        int N = A.length;
        long[] pSum = new long[N];
        int maxLength = 0;

        // initialize prefix sum array
        pSum[0] = A[0];
        for(int i = 1; i<N; i++){
            pSum[i] = pSum[i-1] + A[i];
        }

        // use an index hashmap
        HashMap<Long, Integer> map = new HashMap<>();
        map.put(0l, -1);

        for(int i=0; i<N; i++){
            long current = pSum[i];
            if(map.containsKey(current)){
                int smallestIdx = map.get(current)+1;
                maxLength = Math.max(maxLength, i-smallestIdx+1);
            }
            else{
                map.put(current, i);
            }
        }

        return maxLength;
    }
}
