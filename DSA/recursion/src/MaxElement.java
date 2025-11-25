public class MaxElement {
    public int getMax(int[] A) {
        if(A.length == 0){
            return 0;
        }
        if(A.length == 1){
            return A[0];
        }
        return maxOfArray(A, 1, A[0]);
    }

    public int maxOfArray(int[] A, int idx, int max){
        if(idx >= A.length){
            return max;
        }

        max = Math.max(max, A[idx]);
        return maxOfArray(A, idx+1, max);
    }
}
