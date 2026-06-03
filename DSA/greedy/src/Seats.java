import java.util.ArrayList;

public class Seats {
    public int seats(String A) {
        int N = A.length();
        int MOD = 10000003;
        ArrayList<Integer> indices = new ArrayList<>();
        for(int i=0; i<N; i++){
            if(A.charAt(i) == 'x'){
                indices.add(i);
            }
        }

        int M = indices.size();
        if(M == 0){
            return 0;
        }
        int mid = M/2;
        int median = indices.get(mid);
        int moves = 0;
        for(int i=0; i<M; i++){
            int target = median - mid + i;
            moves += Math.abs(target - indices.get(i)) % MOD;
            moves %= MOD;
        }
        return moves;
    }
}
