import java.util.HashMap;
import java.util.Map;

public class FrequencyOfElementQuery {
    public int[] solve(int[] A, int[] B) {
        int N = A.length;
        int Q = B.length;

        Map<Integer, Integer> freqMap = new HashMap<>();

        // initialize the frequency map
        for(int i=0; i<N; i++){
            if(freqMap.containsKey(A[i])){
                freqMap.put(A[i], freqMap.get(A[i]) + 1);
            }
            else{
                freqMap.put(A[i], 1);
            }
        }

        int[] result = new int[Q];
        for(int i=0; i<Q; i++){
            if(freqMap.get(B[i]) == null){
                result[i] = 0;
            }
            else{
                result[i] = freqMap.get(B[i]);
            }
        }

        return result;
    }
}
