import java.util.HashMap;

public class TwoSumCountPairs {
    public static int count(int[] A, int sum){
        int N = A.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;

        for(int i=0; i<N; i++){
            int current = A[i];
            int target = sum - current;
            if(map.containsKey(target)) {
                count += map.get(target);
            }
            map.put(current, map.getOrDefault(current, 0) + 1);
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 5, 7, -1, 5};
        int sum = 6;
        System.out.println(count(arr, sum));

        arr = new int[]{1, 1, 1, 1};
        sum = 2;
        System.out.println(count(arr, sum));

        arr = new int[]{10, 12, 10, 15, -1};
        sum = 125;
        System.out.println(count(arr, sum));
    }
}
