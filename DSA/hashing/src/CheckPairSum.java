import java.util.HashSet;
import java.util.Set;

public class CheckPairSum {
    public int solve(int A, int[] B) {
        int N = B.length;
        Set<Integer> set = new HashSet<>();

        for(int i=0; i<N; i++){
            int other = A - B[i];
            if(set.contains(other)){
                return 1;
            }
            else{
                set.add(B[i]);
            }
        }
        return 0;
    }
}
