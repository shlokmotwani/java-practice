import java.util.HashMap;

public class MaxDistance {
    public static int maxDistance(int[] A){
        int N = A.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        int result = 0;
        for(int i=0; i<N; i++){
            if(map.containsKey(A[i])){
                int distance = i - map.get(A[i]);
                result = Math.max(result, distance);
            }
            else{
                map.put(A[i], i);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 2, 1};
        System.out.println(maxDistance(arr));

        arr = new int[]{3, 2, 1, 2, 1, 4, 5, 8, 6, 7, 4, 2};
        System.out.println(maxDistance(arr));

        arr = new int[]{1, 2, 3, 6, 5, 4};
        System.out.println(maxDistance(arr));
    }
}
