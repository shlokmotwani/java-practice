import java.util.HashSet;

public class CheckForSubset {
    // check if B is a subset of A
    public static boolean check(int[] A, int[] B){
        int N = A.length;
        int M = B.length;
        HashSet<Integer> set = new HashSet<>();
        for(int i=0; i<N; i++){
            set.add(A[i]);
        }

        for(int i=0; i<M; i++){
            if(!set.contains(B[i])){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] a = {11, 1, 13, 21, 3, 7};
        int[] b = {11, 3, 7, 1};
        System.out.println(check(a, b));

        a = new int[]{1, 2, 3, 4, 5, 6};
        b = new int[]{1, 2, 4};
        System.out.println(check(a, b));

        a = new int[]{10, 5, 2, 23, 19};
        b = new int[]{19, 5, 3};
        System.out.println(check(a, b));
    }
}
