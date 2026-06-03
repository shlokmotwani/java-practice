public class MinNumberOfSquares {
    public int countMinSquares(int A) {
        int[] dp = new int[A+1];
        for(int i=0; i<=A; i++){
            dp[i] = -1;
        }
        count(A, dp);
        return dp[A];
    }

    public int count(int A, int[] dp){
        if(A == 0){
            return 0;
        }
        if(dp[A] != -1){
            return dp[A];
        }
        int ans = Integer.MAX_VALUE;
        for(int i=1; i*i <= A; i++){
            ans = Math.min(ans, count(A - i*i, dp) + 1);
        }
        dp[A] = ans;
        return dp[A];
    }
}
