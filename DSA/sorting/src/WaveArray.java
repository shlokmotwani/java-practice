import java.util.Arrays;
import java.util.Comparator;

public class WaveArray {
    public int[] wave(int[] A) {
        int N = A.length;
        Integer[] B = new Integer[N];

        for(int i=0; i<N; i++){
            B[i] = A[i];
        }

        Arrays.sort(B, new Comparator<Integer>(){
            public int compare(Integer x, Integer y){
                return x - y;
            }
        });

        for(int i=0; i<N; i++){
            A[i] = B[i];
        }

        for(int i=0; i <= N-2; i+=2){
            swap(A, i, i+1);
        }

        return A;
    }

    public void swap(int[] A, int i, int j){
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }
}
