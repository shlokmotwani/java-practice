import java.util.HashSet;

public class UnionOfArrays {
    public static int[] union(int[] A, int[] B){
        int N = A.length;
        int M = B.length;

        HashSet<Integer> setA = new HashSet<>();
        for(int num: A){
            setA.add(num);
        }

        for(int num: B){
            setA.add(num);
        }

        int[] result = new int[setA.size()];
        int i = 0;
        for(int num: setA){
            result[i] = num;
            i++;
        }

        return result;
    }

    public static void main(String[] args) {
        int[] a = new int[]{1, 2, 3, 2, 1};
        int[] b = new int[]{3, 2, 2, 3, 3, 2};
        int[] result = union(a, b);

        for(int num: result){
            System.out.print(num + " ");
        }
        System.out.println();

        a = new int[]{1, 2, 3};
        b = new int[]{4, 5, 6};
        result = union(a, b);

        for(int num: result){
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
