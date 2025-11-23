import java.util.ArrayList;

public class MinimumSwaps {
    public int solve(ArrayList<Integer> A, int B) {
        int N = A.size();
        // find the number of elements <= B
        int smallerCount = 0;
        for(int i=0; i<N; i++){
            if(A.get(i) <= B){
                smallerCount++;
            }
        }

        // create a window that contains smaller elements count for the first "smallerCount" number of elements
        int window = 0;
        for(int i=0; i<smallerCount; i++){
            if(A.get(i) <= B){
                window++;
            }
        }

        int start = 1;
        int end = smallerCount;
        int minSwapCount = Integer.MAX_VALUE;
        while(end < N){
            if(A.get(start - 1) <= B){
                window--;
            }

            if(A.get(end) <= B){
                window++;
            }
            minSwapCount = Math.min(minSwapCount, smallerCount - window);

            start++;
            end++;
        }

        minSwapCount = Math.min(minSwapCount, smallerCount - window);
        return minSwapCount;
    }
}
