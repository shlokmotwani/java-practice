import java.util.Arrays;
import java.util.Comparator;

public class Sort01 {
    public int[] sort01(int[] A) {
        int N = A.length;
        Integer[] X = new Integer[N];

        for(int i=0; i<N; i++){
            X[i] = A[i];
        }

        Arrays.sort(X, new Comparator<Integer>(){
            public int compare(Integer a, Integer b){
                return a - b;
            }
        });

        for(int i=0; i<N; i++){
            A[i] = X[i];
        }

        return A;
    }
}
