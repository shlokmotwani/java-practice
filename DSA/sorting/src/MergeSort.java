public class MergeSort {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int[] solve(final int[] A, final int[] B) {
        int N = A.length;
        int M = B.length;
        int[] result = new int[N+M];

        int i = 0;
        int j = 0;
        int k = 0;

        while(i<N && j<M){
            if(A[i] <= B[j]){
                result[k] = A[i];
                i++;
            }
            else{
                result[k] = B[j];
                j++;
            }
            k++;
        }

        while(i<N){
            result[k] = A[i];
            i++;
            k++;
        }

        while(j<M){
            result[k] = B[j];
            j++;
            k++;
        }
        return result;
    }
}
