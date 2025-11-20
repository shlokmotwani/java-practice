import java.util.Arrays;

public class MinXOR {
    public int findMinXor(int[] A) {
        int N = A.length;
        int result = Integer.MAX_VALUE;
        Arrays.sort(A);
        for(int i=0; i<N-1; i++){
            result = Math.min(result, A[i] ^ A[i+1]);
        }
        return result;
    }
}