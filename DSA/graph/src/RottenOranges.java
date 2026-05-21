import java.util.ArrayDeque;
import java.util.Deque;

public class RottenOranges {
    public int solve(int[][] A) {
        int N = A.length;
        int M = A[0].length;

        Deque<Cell> q = new ArrayDeque<>();
        int time = 0;

        // intialize queue
        for(int i=0; i<N; i++){
            for(int j=0; j<M; j++){
                if(A[i][j] == 2){
                    q.add(new Cell(i,j));
                }
            }
        }

        while(!q.isEmpty()){
            int size = q.size();
            for(int k=0; k < size; k++){
                Cell removed = q.remove();
                int i = removed.x;
                int j = removed.y;
                if(i-1 >= 0 && A[i-1][j] == 1){
                    A[i-1][j] = 2;
                    q.add(new Cell(i-1, j));
                }
                if(j+1 < M && A[i][j+1] == 1){
                    A[i][j+1] = 2;
                    q.add(new Cell(i, j+1));
                }
                if(i+1 < N && A[i+1][j] == 1){
                    A[i+1][j] = 2;
                    q.add(new Cell(i+1, j));
                }
                if(j-1 >= 0 && A[i][j-1] == 1){
                    A[i][j-1] = 2;
                    q.add(new Cell(i, j-1));
                }
            }
            time++;
        }

        for(int i=0; i<N; i++){
            for(int j=0; j<M; j++){
                if(A[i][j] == 1){
                    return -1;
                }
            }
        }
        return time-1;
    }

    class Cell {
        int x;
        int y;

        Cell(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
