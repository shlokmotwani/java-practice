import java.util.HashMap;

public class MinimumRemovals {
    public static int minRemovals(int[] A, int[] B){
        int N = A.length;
        int M = B.length;
        HashMap<Integer, Integer> mapA = new HashMap<>();
        HashMap<Integer, Integer> mapB = new HashMap<>();

        for(int item: A){
            mapA.put(item, mapA.getOrDefault(item, 0) + 1);
        }

        for(int item: B){
            mapB.put(item, mapB.getOrDefault(item, 0) + 1);
        }

        int count = 0;
        for(int item: mapA.keySet()){
            int freqA = mapA.get(item);
            int freqB = mapB.getOrDefault(item, 0);
            count += Math.min(freqA, freqB);
        }

        return count;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{ 1, 2, 3, 4};
        int[] arr2 = new int[]{ 2, 3, 4, 5, 8 };
        System.out.println(minRemovals(arr, arr2));

        arr = new int[]{ 4, 2, 4, 4};
        arr2 = new int[]{ 3, 4 };
        System.out.println(minRemovals(arr, arr2));

        arr = new int[]{ 1, 2, 3, 4};
        arr2 = new int[]{  5, 6, 7, 8 };
        System.out.println(minRemovals(arr, arr2));
    }
}
