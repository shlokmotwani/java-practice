public class CountSort {
    public int[] solve(int[] A) {
        int N = A.length;
        int min = A[0];
        int max = A[0];

        // find the min and max elements to initialize freq array
        for(int i=1; i<N; i++){
            min = Math.min(min, A[i]);
            max = Math.max(max, A[i]);
        }

        // initialize frequency array
        int[] farr = new int[max-min+1];
        for(int i=0; i<N; i++){
            int currentElement = A[i];
            farr[currentElement - min]++;
        }

        int j = 0;
        for(int i=0; i<farr.length; i++){
            int currentElement = i + min;
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
