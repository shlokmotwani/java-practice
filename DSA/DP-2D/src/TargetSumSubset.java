public class TargetSumSubset {
    // using memoization
    public static void main(String[] args) {
        int[] input = {3, 34, 4, 12, 5, 2};
        int N = input.length;
        int target = 9;
        boolean[][] dp = new boolean[N+1][target+1];

        for(int i=0; i<=N; i++){
            for(int j = 0; j<=target; j++){
                if(j == 0){
                    dp[i][j] = true;
                }
                else if(i == 0){
                    dp[i][j] = false;
                }
                else {
                    boolean f1 = dp[i-1][j];
                    boolean f2 = false;
                    if(j-input[i-1] >= 0){
                        f2 = dp[i-1][j - input[i-1]];
                    }
                    dp[i][j] = f1 || f2;
                }
            }
        }
        System.out.println(dp[N][target]);
    }
}
