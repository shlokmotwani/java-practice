import java.util.HashSet;

public class SubArrayWithZeroSum {
    public int solve(int[] A) {
        int N = A.length;
        HashSet<Long> setOfSums = new HashSet<>();

        // add zero initially to the setOfSums
        setOfSums.add(0l);
        long currentSum = 0;
        for(int i=0; i<N; i++){
            currentSum += A[i];
            if(setOfSums.contains(currentSum)){
                return 1;
            }
            setOfSums.add(currentSum);
        }
        return 0;
    }
}
