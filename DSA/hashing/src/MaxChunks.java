import java.util.HashSet;

public class MaxChunks {
    public static int countMaxChunks(int[] A) {
        int N = A.length;
        int max = -1;
        int count = 0;
        HashSet<Integer> set = new HashSet<>();

        for(int i=0; i<N; i++){
            if(A[i] > max){
                max = A[i];
            }
            set.add(A[i]);
            if(set.size() == max+1){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countMaxChunks(new int[]{3, 2, 0, 1, 4}));
    }
}
