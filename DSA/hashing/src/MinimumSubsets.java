import java.util.HashMap;

public class MinimumSubsets {
    public static int count(int[] A){
        int N = A.length;
        int maxFreq = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<N; i++){
            map.put(A[i], map.getOrDefault(A[i], 0) + 1);
            maxFreq = Math.max(maxFreq, map.get(A[i]));
        }
        return maxFreq;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4};
        System.out.println(count(arr));

        arr = new int[]{1, 2, 3, 3};
        System.out.println(count(arr));
    }
}
