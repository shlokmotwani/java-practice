import java.util.Arrays;
import java.util.Comparator;

public class FactorSort {
    public int[] sort(int[] A) {
        int N = A.length;

        Integer[] B = new Integer[N];
        for(int i=0; i<N; i++){
            B[i] = A[i];
        }

        Arrays.sort(B, new Comparator<Integer>(){
            public int compare(Integer x, Integer y){
                int f1 = factorsCount(x);
                int f2 = factorsCount(y);

                if(f1 == f2){
                    return x - y;
                }
                else{
                    return f1-f2;
                }
            }
        });

        for(int i=0; i<N; i++){
            A[i] = B[i];
        }

        return A;
    }

    public int factorsCount(int N){
        if(N < 1){
            return 1;
        }
        int count = 0;
        for(int i=1; i*i <= N; i++){
            if(N%i == 0){
                if(i*i == N){
                    count++;
                }
                else{
                    count += 2;
                }
            }
        }
        return count;
    }
}
