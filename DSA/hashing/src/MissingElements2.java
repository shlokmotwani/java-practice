import java.util.HashSet;

public class MissingElements2 {
    public static int findCount(int[] A){
        int N = A.length;
        HashSet<Integer> set = new HashSet<>();
        int count = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i=0; i<N; i++){
            int current = A[i];
            if(current < min){
                min = current;
            }
            if(current > max){
                max = current;
            }
            set.add(current);
        }
        return (max-min+1) - set.size();
    }

    public static void main(String[] args) {
        System.out.println(findCount(new int[]{4, 5, 3, 8, 6}));
        System.out.println(findCount(new int[]{1, 2, 3, 4}));
        System.out.println(findCount(new int[]{1, 2, 3, 4, 10}));
    }
}
