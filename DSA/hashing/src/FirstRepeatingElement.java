import java.util.HashSet;

public class FirstRepeatingElement {
    public int solve(int[] A) {
        int N = A.length;
        int smallestIdx = -1;
        HashSet<Integer> set = new HashSet<>();
        // initialise the hashmap
        for(int i=N-1; i>=0; i--){
            if(set.contains(A[i])){
                smallestIdx = i;
            }
            else{
                set.add(A[i]);
            }
        }
        return smallestIdx == -1 ? smallestIdx : A[smallestIdx];
    }
}