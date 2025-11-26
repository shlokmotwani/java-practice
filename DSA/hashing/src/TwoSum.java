import java.util.HashSet;

public class TwoSum {
    public static boolean twoSum(int[] A, int sum){
        int N = A.length;
        HashSet<Integer> set = new HashSet<>();
        for(int i=0; i<N; i++){
            int current = A[i];
            int target = sum - current;
            if(set.contains(target)){
                return true;
            }
            set.add(current);
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{0, -1, 2, -3, 1};
        int sum = -2;
        System.out.println(twoSum(arr, sum));

        arr = new int[]{1, -2, 1, 0, 5};
        sum = 0;
        System.out.println(twoSum(arr, sum));
    }
}
