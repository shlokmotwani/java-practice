//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class UniquePaths {
    public int uniquePathsWithObstacles(int[][] A) {
        int N = A.length;
        int M = A[0].length;

        if(A[0][0] == 1){
            return 0;
        }

        if(N == 1 && M == 1){
            return 1;
        }

        int[][] dp = new int[N][M];
        for(int i=0; i<N; i++){
            for(int j=0; j<M; j++){
                dp[i][j] = -1;
            }
        }

        doTheMagic(A, 0, 0, dp);
        return dp[0][0] == -1 ? 0 : dp[0][0];
    }

    public void doTheMagic(int[][] A, int x, int y, int[][] dp){
        int N = A.length;
        int M = A[0].length;

        if(x >= N || y >= M){
            return;
        }

        if(A[x][y] == 1){
            dp[x][y] = 0;
            return;
        }

        if(x == N-1 && y == M-1){
            dp[x][y] = 1;
            return;
        }

        if(x+1 < N && dp[x+1][y] != -1){
            dp[x][y] += dp[x+1][y];
        }
        else{
            doTheMagic(A, x+1, y, dp);
        }

        if(y+1 < M && dp[x][y+1] != -1){
            dp[x][y] += dp[x][y+1];
        }
        else{
            doTheMagic(A, x, y+1, dp);
        }
    }
}