import java.util.HashMap;

public class SubArrayWithGivenSum {
    public int[] solve(int[] A, int B) {
        int N = A.length;
        long[] pSum = new long[N];

        // initialize prefix sum array
        pSum[0] = A[0];
        for(int i=1; i<N; i++){
            pSum[i] = pSum[i-1] + A[i];
        }

        // maps pSum element with its index
        HashMap<Long, Integer> map = new HashMap<>();
        map.put(0l, -1);
        int si = -1;
        int ei = -1;

        for(int i=0; i<N; i++){
            long current = pSum[i];
            long target = current - B;
            if(map.containsKey(target)){
                si = map.get(target) + 1;
                ei = i;
                break;
            }

            if(!map.containsKey(current)){
                map.put(current, i);
            }
        }

        if(si >= 0){
            int subArrayLength = ei - si + 1;
            int[] result = new int[subArrayLength];
            for(int i = 0; i < subArrayLength; i++){
                result[i] = A[si];
                si++;
            }
            return result;
        }

        int[] result = new int[1];
        result[0] = -1;
        return result;
    }
}
