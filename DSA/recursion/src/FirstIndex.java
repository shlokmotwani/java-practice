public class FirstIndex {
    public int FirstIndex(int[] A, int B) {
        if(A.length == 0){
            return -1;
        }
        return findIndex(A, B, 0);

    }

    public int findIndex(int[] A, int target, int idx){
        if(idx >= A.length){
            return -1;
        }

        if(A[idx] == target){
            return idx;
        }
        return findIndex(A, target, idx+1);
    }
}
