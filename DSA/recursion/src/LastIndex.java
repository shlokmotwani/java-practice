public class LastIndex {
    public int LastIndex(int[] A, int B) {
        if(A.length == 0){
            return -1;
        }
        return findIndex(A, B, A.length-1);
    }

    public int findIndex(int A[], int target, int idx){
        if(idx < 0){
            return -1;
        }

        if(A[idx] == target){
            return idx;
        }

        return findIndex(A, target, idx-1);
    }

}
