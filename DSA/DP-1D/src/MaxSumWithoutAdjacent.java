public class MaxSumWithoutAdjacent {
    public int adjacent(int[][] A) {
        int N = A.length;
        int M = A[0].length;
        int[][] used = new int[N][M];

        return sumTill(N-1, M-1, A, used);
    }

    public int sumTill(int x, int y, int[][] A, int[][] used){
        int N = A.length;
        int M = A[0].length;
        if(x < 0 || y < 0 || x >= N || y >= M){
            return 0;
        }

        if(used[x][y] != 0){
            return 0;
        }

        int f1 = 0;
        int f2 = 0;

        if(x+1 >= N){
            f1 = sumTill(0, y+1, A, used);
        }
        else{
            f1 = sumTill(x+1, y, A, used);
        }

        if(canBeConsidered(x,y,A,used)){
            used[x][y] = 1;
            if(x+1 >= N){
                f2 = A[x][y] + sumTill(0, y+1, A, used);
            }
            else{
                f2 = A[x][y] + sumTill(x+1, y, A, used);
            }
            used[x][y] = 0;
        }
        return Math.max(f1, f2);
    }

    public boolean canBeConsidered(int x, int y, int[][] A, int[][] used){
        int N = A.length;
        int M = A[0].length;

        int up = x-1;
        int down = x+1;
        int left = y-1;
        int right = y+1;

        boolean upIsFine = false;
        boolean downIsFine = false;
        boolean leftIsFine = false;
        boolean rightIsFine = false;

        if(up < 0 || used[up][y] == 0){
            upIsFine = true;
        }

        if(down >= N || used[down][y] == 0){
            downIsFine = true;
        }

        if(left < 0 || used[x][left] == 0){
            leftIsFine = true;
        }

        if(right >= M || used[x][right] == 0){
            rightIsFine = true;
        }

        return (upIsFine && downIsFine && leftIsFine && rightIsFine);
    }
}
