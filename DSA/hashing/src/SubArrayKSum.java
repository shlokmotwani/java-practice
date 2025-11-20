import java.util.HashMap;

public class SubArrayKSum {
    public int solve(int[] A, int B) {
        int N = A.length;
        int[] pSum = new int[N];

        // initialize prefix sum array
        pSum[0] = A[0];
        for(int i=1; i<N; i++){
            pSum[i] = pSum[i-1] + A[i];
        }

        int result = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        for(int i=0; i<N; i++){
            int current = pSum[i];
            int target = current - B;
            if(map.containsKey(target)){
                int freq = map.get(target);
                result += freq;
            }
            if(map.containsKey(current)){
                map.put(current, map.get(current)+1);
            }
            else{
                map.put(current, 1);
            }
        }
        return result;
    }
}
