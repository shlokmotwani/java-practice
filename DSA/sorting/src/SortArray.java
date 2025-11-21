public class SortArray {
    public int[] smallestNumber(int[] A) {
        int N = A.length;
        int[] farr = new int[10];

        for(int i=0; i<N; i++){
            farr[A[i]]++;
        }

        int j = 0;
        for(int i=0; i<farr.length; i++){
            int currentElement = i;
            int total = farr[i];
            int count = 1;
            while(count <= total){
                A[j] = currentElement;
                count++;
                j++;
            }
        }
        return A;
    }
}
