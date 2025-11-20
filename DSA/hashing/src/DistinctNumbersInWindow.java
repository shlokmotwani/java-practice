import java.util.HashMap;

public class DistinctNumbersInWindow {
    public int[] dNums(int[] A, int B) {
        int N = A.length;
        if(B > N){
            return new int[0];
        }

        int[] result = new int[N - B + 1];
        HashMap<Integer, Integer> freqMap = new HashMap<>();

        // create a window of size B and keep a track of the elements' frequency
        for(int i=0; i<B; i++){
            int current = A[i];
            if(freqMap.containsKey(current)){
                freqMap.put(current, freqMap.get(current)+1);
            }
            else{
                freqMap.put(current, 1);
            }
        }

        // slide the window and adjust the freqMap accordingly
        int si = 0;
        int ei = B-1;
        int ri = 0;
        while(ei < N){
            int distinct = freqMap.keySet().size();
            result[ri] = distinct;
            ri++;

            if(ei == N-1){
                break;
            }

            freqMap.put(A[si], freqMap.get(A[si]) - 1);
            if(freqMap.get(A[si]) == 0){
                freqMap.remove(A[si]);
            }

            if(freqMap.containsKey(A[ei + 1])){
                freqMap.put(A[ei + 1], freqMap.get(A[ei + 1]) + 1);
            }
            else{
                freqMap.put(A[ei + 1], 1);
            }

            si++;
            ei++;
        }
        return result;
    }
}
