import java.util.ArrayList;

public class TowerOfHanoi {
    public int[][] towerOfHanoi(int A) {
        ArrayList<int[]> list = new ArrayList<int[]>();
        toh(A, 1, 3, 2, list);
        return list.toArray(new int[list.size()][3]);

    }

    public void toh(int N, int src, int dest, int helper, ArrayList<int[]> result){
        if(N == 0){
            return;
        }
        toh(N-1, src, helper, dest, result);
        result.add(new int[]{N, src, dest});
        toh(N-1, helper, dest, src, result);
    }
}
