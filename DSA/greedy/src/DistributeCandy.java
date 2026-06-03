public class DistributeCandy {
    public int candy(int[] A) {
        int N = A.length;
        int[] result = new int[N];

        for(int i=0; i<N; i++){
            result[i] = 1;
        }

        for(int i=1; i<N; i++){
            if(A[i-1] < A[i]){
                result[i] = result[i-1] + 1;
            }
        }

        for(int i=N-2; i>=0; i--){
            if(A[i] > A[i+1] && result[i+1] >= result[i]){
                result[i] = result[i+1] + 1;
            }
        }

        int total = 0;
        for(int i=0; i<N; i++){
            total += result[i];
        }

        return total;
    }
}
