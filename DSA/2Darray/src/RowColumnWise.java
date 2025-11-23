import java.util.ArrayList;

public class RowColumnWise {
    public int solve(ArrayList<ArrayList<Integer>> A, int B) {
        int N = A.size();
        int M = A.get(0).size();

        int trs = 0;
        int tre = M-1;
        int trSum = Integer.MAX_VALUE;
        boolean found = false;
        // traverse from top-right
        while(trs < N && tre >= 0){
            if(A.get(trs).get(tre) < B){
                trs++;
            }
            else if(A.get(trs).get(tre) > B){
                tre--;
            }
            else{
                trSum =  Math.min(((trs + 1) * 1009) + (tre + 1), trSum);
                found = true;
                tre--;
            }
        }

        if(!found){
            return -1;
        }

        int bls = N-1;
        int ble = 0;
        int blSum = Integer.MAX_VALUE;
        // traverse from bottom-left
        while(bls >=0 && ble < M){
            if(A.get(bls).get(ble) < B){
                ble++;
            }
            else if(A.get(bls).get(ble) > B){
                bls--;
            }
            else{
                blSum =  Math.min(((bls + 1) * 1009) + (ble + 1), blSum);
                bls--;
            }
        }
        return Math.min(trSum, blSum);
    }
}
