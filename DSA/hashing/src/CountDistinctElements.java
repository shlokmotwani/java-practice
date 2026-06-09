import java.util.HashSet;
import java.util.Set;

public class CountDistinctElements {
    public int solve(int[] A) {
        int N = A.length;
        Set<Integer> set = new HashSet<>();

        for(int i=0; i<N; i++){
            set.add(A[i]);
        }

        return set.size();
    }
}
