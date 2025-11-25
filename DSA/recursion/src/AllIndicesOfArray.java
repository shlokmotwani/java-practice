public class AllIndicesOfArray {
    public int[] allIndices(int[] A, int B) {
        return rec(A, 0, B, 0);
    }

    public int[] rec(int[] A, int i, int target, int count){
        if(i >= A.length){
            return new int[count];
        }

        if(A[i] == target){
            count++;
        }

        int[] res = rec(A, i+1, target, count);

        if(A[i] == target){
            res[count-1] = i;
        }

        return res;
    }
}
