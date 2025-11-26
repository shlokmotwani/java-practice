import java.util.HashMap;

public class MostFrequentElement {
    public static int mostFrequent(int[] A){
        int N = A.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        int maxElement = A[0];
        int maxFrequency = 1;

        // initialize a frequency hashmap
        for(int i=0; i<N; i++){
            if(map.containsKey(A[i])){
                map.put(A[i], map.get(A[i]) + 1);
                if(map.get(A[i]) > maxFrequency){
                    maxFrequency = map.get(A[i]);
                    maxElement = A[i];
                }
            }
            else{
                map.put(A[i], 1);
            }
        }

        return maxElement;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 1, 4, 1};
        System.out.println(mostFrequent(arr));

        arr = new int[]{10, 20, 10, 20, 30, 20, 20};
        System.out.println(mostFrequent(arr));

        arr = new int[]{1, 2, 2, 4, 1};
        System.out.println(mostFrequent(arr));
    }
}
