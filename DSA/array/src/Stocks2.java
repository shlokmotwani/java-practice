public class Stocks2 {
    public int maxProfit(final int[] A) {
        int profit = 0;
        int N = A.length;

        if(N < 2){
            return 0;
        }

        int prev = Integer.MIN_VALUE;
        for(int i=0; i<N-1; i++){
            if(A[i+1] < A[i] && prev != Integer.MIN_VALUE){
                profit += A[i] - prev;
                prev = Integer.MIN_VALUE;
            }
            if(A[i+1] > A[i] && prev == Integer.MIN_VALUE){
                prev = A[i];
            }
        }
        if(A[N-1] > A[N-2] && prev != Integer.MIN_VALUE){
            profit += A[N-1] - prev;
            prev = Integer.MIN_VALUE;
        }
        return profit;
    }
}
