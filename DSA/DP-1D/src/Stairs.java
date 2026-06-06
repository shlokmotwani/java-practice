import java.util.Arrays;

public class Stairs {
    public int climbStairs(int A) {
        int MOD = 1000000007;
        int[] dp = new int[A+1];
        Arrays.fill(dp, -1);
        dp[0] = 1;
        dp[1] = 1;
        return ways(A, dp)%MOD;
    }

    public int ways(int A, int[] dp){
        int MOD = 1000000007;
        if(A == 0 || A == 1){
            return 1;
        }
        if(dp[A] != -1){
            return dp[A];
        }

        int steps = (int)(((long)ways(A-1, dp) + ways(A-2, dp)) % MOD);
        dp[A] = steps;
        return dp[A];
    }
}
