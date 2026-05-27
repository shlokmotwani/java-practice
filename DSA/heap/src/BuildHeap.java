public class BuildHeap {
    public int[] buildHeap(int[] A) {
        int N = A.length;
        int pi = (N-2)/2;
        while(pi >= 0){
            heapify(pi, A);
            pi--;
        }
        return A;
    }

    public void heapify(int i, int[] A){
        int N = A.length;
        while(i < N){
            int min_idx = i;
            int lci = 2*i+1;
            int rci = 2*i+2;
            if(lci < N && A[lci] < A[min_idx]){
                min_idx = lci;
            }
            if(rci < N && A[rci] < A[min_idx]){
                min_idx = rci;
            }
            if(min_idx == i){
                break;
            }
            else{
                int temp = A[i];
                A[i] = A[min_idx];
                A[min_idx] = temp;
                i = min_idx;
            }
        }
    }
}
