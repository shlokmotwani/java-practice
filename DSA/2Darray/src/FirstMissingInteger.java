import java.util.ArrayList;

public class FirstMissingInteger {
    public int firstMissingPositive(ArrayList<Integer> A) {
        int N = A.size();
        boolean found = false;

        for(int i=0; i<N; i++){
            int curr = A.get(i);
            if(curr <= 0){
                A.set(i, N+2);
            }
        }

        for(int i=0; i<N; i++){
            int curr = Math.abs(A.get(i));
            if(curr >= 1 && curr <= N){
                A.set(curr-1, Math.abs(A.get(curr-1)) * -1);
                found = true;
            }
        }

        if(!found){
            return 1;
        }

        for(int i=0; i<N; i++){
            if(A.get(i) > 0){
                return i+1;
            }
        }
        return N+1;
    }
}
