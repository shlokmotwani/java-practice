public class MaximumHappiness {
    public static void main(String[] args) {
        int[] happiness = {12, 20, 15, 6, 10};
        int[] weights = {3, 6, 5, 2, 4};
        int N = happiness.length;
        int W = 8;
        int[][] dp = new int[N+1][W+1];
        for(int i=0; i<=N; i++){
            for(int j=0; j<=W; j++){
                if(i == 0 || j == 0){
                    dp[i][j] = 0;
                }
                else {
                    dp[i][j] = -1;
                }
            }
        }

        int maxHappiness = topDown(happiness, weights, N, W, dp);

        for(int i=0; i<=N; i++){
            for(int j=0; j<=W; j++){
                System.out.print(dp[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Maximum happiness: " + maxHappiness);
    }

    public static int topDown(int[] happiness, int[] weights, int idx, int W, int[][] dp){
        if(idx <= 0 || W <= 0){
            return 0;
        }
        if(dp[idx][W] != -1){
            return dp[idx][W];
        }
        int f1 = topDown(happiness, weights, idx-1, W, dp);
        int f2 = 0;
        if(weights[idx-1] <= W){
            f2 = happiness[idx-1] + topDown(happiness, weights, idx-1, W-weights[idx-1], dp);
        }
        dp[idx][W] = Math.max(f1, f2);
        return dp[idx][W];
    }

//    public static int[][] bottomUp(int[] happiness, int[] weights, int N, int W){
//       int[][] dp = new int[N+1][W+1];
//       for(int i=0; i<=N; i++){
//           for(int j=0; j<=W; j++){
//               if(i == 0 || j == 0){
//                   dp[i][j] = 0;
//               }
//               else{
//                   int f1 =
//               }
//           }
//       }
//    }
}
