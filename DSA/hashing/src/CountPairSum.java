import java.util.HashMap;
import java.util.Map;

public class CountPairSum {
    public int solve(int[] A, int B) {
        int N = A.length;
        int MOD = 1000000007;
        long count = 0;
        Map<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<N; i++){
            int other = B - A[i];
            if(map.get(other) != null){
                count = (count + map.get(other)) % MOD;
            }

            if(map.get(A[i]) != null){
                map.put(A[i], map.get(A[i])+1);
            }
            else{
                map.put(A[i], 1);
            }
        }
        return (int)(count % MOD);
    }
}
