import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class MissingElementsOfRange {
    public static int[] findMissing(int[] A, int low, int high){
        int N = A.length;
        ArrayList<Integer> result = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();

        for(int i=0; i<N; i++){
            set.add(A[i]);
        }

        int i = low;
        while(i <= high){
            if(!set.contains(i)){
                result.add(i);
            }
            i++;
        }

        return result.stream().mapToInt(num->num).toArray();
    }

    public static void main(String[] args) {
        int[] arr = new int[]{10, 12, 11, 15};
        int low = 10, high = 15;
        System.out.println(Arrays.toString(findMissing(arr, low, high)));

        arr = new int[]{1, 14, 11, 51, 15};
        low = 50;
        high = 55;
        System.out.println(Arrays.toString(findMissing(arr, low, high)));
    }
}
