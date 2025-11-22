import java.util.HashSet;

public class DuplicateWithinDistance {
    public static boolean duplicate(int[] A, int K){
        int N = A.length;
        HashSet<Integer> set = new HashSet<>();
        for(int i=0; i<=K; i++){
            if(set.contains(A[i])){
                return true;
            }
            set.add(A[i]);
        }

        int si = 1;
        int ei = K+1;
        while(ei < N){
            set.remove(A[si-1]);
            if(set.contains(A[ei])){
                return true;
            }
            set.add(A[ei]);
            si++;
            ei++;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(duplicate(new int[]{1, 2, 3, 4, 1, 2, 3, 4}, 3));
        System.out.println(duplicate(new int[]{1, 2, 3, 1, 4, 5}, 3));
        System.out.println(duplicate(new int[]{1, 2, 3, 4, 5}, 3));
    }
}
