public class UniqueBST2 {
    public int numTrees(int A) {
        if(A < 2){
            return A;
        }
        int[] dp = new int[A+1];
        for(int i=0; i<=A; i++){
            dp[i] = -1;
        }

        return ways(A, dp);
    }

    int ways(int A, int[] dp){
        if(A == 0 || A == 1){
            return 1;
        }

        if(dp[A] != -1){
            return dp[A];
        }

        int ans = 0;
        for(int left=0; left<A; left++){
            int right = A - left - 1;
            int leftWays = ways(left, dp);
            int rightWays = ways(right, dp);
            ans += leftWays * rightWays;
        }
        dp[A] = ans;
        return dp[A];
    }
}
