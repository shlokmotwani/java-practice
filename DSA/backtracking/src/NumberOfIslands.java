public class NumberOfIslands {
    public int solve(int[][] A) {
        int N = A.length;
        int M = A[0].length;
        int islands = 0;

        for(int i=0; i<N; i++){
            for(int j=0; j<M; j++){
                if(A[i][j] == 1){
                    dfs(A, i, j);
                    islands++;
                }
            }
        }
        return islands;
    }

    public void dfs(int[][] A, int i, int j){
        int N = A.length;
        int M = A[0].length;
        if(i < 0 || j < 0 || i >= N || j >= M || A[i][j] == 0 || A[i][j] == 2){
            return;
        }
        A[i][j] = 2;
        dfs(A, i-1, j-1);
        dfs(A, i-1, j);
        dfs(A, i-1, j+1);
        dfs(A, i, j-1);
        dfs(A, i, j+1);
        dfs(A, i+1, j-1);
        dfs(A, i+1, j);
        dfs(A, i+1, j+1);
    }
}
