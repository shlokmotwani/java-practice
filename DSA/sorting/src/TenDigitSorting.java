import java.util.Arrays;
import java.util.Comparator;

public class TenDigitSorting {
    public int[] solve(int[] A) {
        int N = A.length;
        Integer[] X = new Integer[N];

        for(int i=0; i<N; i++){
            X[i] = A[i];
        }

        Arrays.sort(X, new Comparator<Integer>(){
            public int compare(Integer a, Integer b){
                int t1 = (a/10)%10;
                int t2 = (b/10)%10;
                if(t1 == t2){
                    return b - a;
                }
                return t1 - t2;
            }
        });

        for(int i=0; i<N; i++){
            A[i] = X[i];
        }

        return A;
    }
}
