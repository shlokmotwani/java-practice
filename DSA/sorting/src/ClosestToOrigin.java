import java.util.Arrays;

public class ClosestToOrigin {
    public int[][] solve(int[][] A, int B) {
        int N = A.length;

        Arrays.sort(A, (x, y) -> {
            int x1 = x[0];
            int y1 = x[1];
            int x2 = y[0];
            int y2 = y[1];
            long dist1 = (x1*x1 + y1*y1);
            long dist2 = (x2*x2 + y2*y2);
            return (int)(dist1 - dist2);
        });

        int[][] result = new int[B][2];

        for(int i=0; i<B; i++){
            result[i] = A[i];
        }

        return result;
    }
}
