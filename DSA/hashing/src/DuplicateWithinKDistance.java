import java.util.HashMap;

public class DuplicateWithinKDistance {
    public static boolean duplicateWithinKDistance(int[] A, int K){
        int N = A.length;
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<N; i++){
            if(map.containsKey(A[i])) {
                int distance = i - map.get(A[i]);
                if (distance <= K) {
                    return true;
                }
            }
            map.put(A[i], i);
        }

        return false;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 1, 2, 3, 4};
        System.out.println(duplicateWithinKDistance(arr, 3));

        arr = new int[]{1, 2, 3, 1, 4, 5};
        System.out.println(duplicateWithinKDistance(arr, 3));

        arr = new int[]{1, 2, 3, 4, 5};
        System.out.println(duplicateWithinKDistance(arr, 3));
    }
}
