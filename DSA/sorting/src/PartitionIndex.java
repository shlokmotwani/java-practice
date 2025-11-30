class PartitionIndex {
    public int partition(int[] A) {
        // Code Here
        int N = A.length;
        int pivot = N-1;
        int i=0;
        int j = pivot-1;
        while(i <= j){
            if(A[i] < A[pivot]){
                i++;
            }
            else if(A[j] > A[pivot]){
                j--;
            }
            else{
                swap(A, i, j);
                i++;
                j--;
            }
        }
        swap(A, i, pivot);
        // System.out.println(Arrays.toString(A));
        return i;
    }

    public void swap(int[] A, int i, int j){
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }
}
