import java.util.Arrays;

public class CountSortAgain {
    public static int[] sort(int[] A){
        int N = A.length;
        int max = A[0];
        int min = A[0];

        // finds the max and min element in the array
        for(int i=1; i<N; i++){
            if(A[i] < min){
                min = A[i];
            }

            if(A[i] > max){
                max = A[i];
            }
        }

        // initialize frequency array
        int[] farr = new int[max-min+1];
        for(int i=0; i<N; i++){
            int current = A[i];
            farr[current-min]++;
        }

        // initialize the result array
        int[] result = new int[N];
        int idx = 0;
        for(int i=0; i<farr.length; i++){
            for(int k=1; k<= farr[i]; k++){
                result[idx] = i+min;
                idx++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] A = new int[]{-100, 30, 56, -20, 35, -9, 10, -40};
        System.out.println(Arrays.toString(sort(A)));
    }
}
