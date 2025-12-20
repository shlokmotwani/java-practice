import java.util.*;

public class SlidingMaximum {
    public static int[] slidingMaximum(final int[] A, int B) {
        if(B == 1){
            return A;
        }

        int N = A.length;
        Deque<Integer> dq = new ArrayDeque<>();
        List<Integer> result = new ArrayList<>();

        for(int i=0; i<N; i++){
            // remove elements that appear before the window
            if(!dq.isEmpty() && dq.peekFirst() <= i-B){
                dq.pollFirst();
            }

            // remove all elements <= A[i]
            while(!dq.isEmpty() && A[dq.peekLast()] <= A[i]){
                dq.pollLast();
            }

            dq.offerLast(i);

            if(i >= B-1){
                result.add(A[dq.peekFirst()]);
            }
        }

        return result.stream().mapToInt(x -> x).toArray();
    }

    public static void main(String[] args) {
        int[] A = {1, 3, -1, -3, 5, 3, 6, 7};
        int[] result = slidingMaximum(A, 3);
        System.out.println(Arrays.toString(result));
    }
}
