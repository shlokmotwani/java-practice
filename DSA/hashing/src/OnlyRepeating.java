import java.util.HashSet;

public class OnlyRepeating {
    public static int find(int[] A){
        int N = A.length;
        HashSet<Integer> set = new HashSet<>();
        int i = 0;
        for(; i<N; i++){
            if(set.contains(A[i])){
                break;
            }
            set.add(A[i]);
        }
        return A[i];
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 3, 2, 3, 4};
        System.out.println(find(arr));

        arr = new int[]{1, 5, 1, 2, 3, 4};
        System.out.println(find(arr));
    }
}

