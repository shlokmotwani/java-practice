import java.util.ArrayList;

public class RowWithMaxOnes {
    public int solve(ArrayList<ArrayList<Integer>> A) {
        int N = A.size();

        int i = 0;
        int j = N-1;
        int minRow = 0;

        while(i < N && j >= 0){
            if(A.get(i).get(j) == 1){
                minRow = i;
                j--;
            }
            else{
                i++;
            }
        }
        return minRow;
    }
}
