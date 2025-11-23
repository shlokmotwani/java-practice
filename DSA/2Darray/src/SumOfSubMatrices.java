import java.util.ArrayList;

public class SumOfSubMatrices {
    public int solve(ArrayList<ArrayList<Integer>> A) {
        int sum = 0;
        int N = A.size();
        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                sum += (i+1) * (j+1) * (N-i) * (N-j) * A.get(i).get(j);
            }
        }
        return sum;
    }
}
