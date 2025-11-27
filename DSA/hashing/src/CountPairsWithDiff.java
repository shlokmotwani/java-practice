import java.util.HashMap;

public class CountPairsWithDiff {
    public static int diff(int[] A, int sum){
        int N = A.length;
        HashMap<Integer, Integer> freq = new HashMap<>();
        int result = 0;
        for(int i=0; i<N; i++){
            int target1 = A[i] - sum;
            if(freq.containsKey(target1)){
                result += freq.get(target1);
            }

            int target2 = A[i] + sum;
            if(freq.containsKey(target2)){
                result += freq.get(target2);
            }

            freq.put(A[i], freq.getOrDefault(A[i], 0) + 1);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 4, 1, 4, 5};
        int sum = 3;
        System.out.println(diff(arr, sum));

        arr = new int[]{8, 16, 12, 16, 4, 0};
        sum = 4;
        System.out.println(diff(arr, sum));


    }
}
