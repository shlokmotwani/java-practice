import java.util.HashSet;

public class IntersectionOfArrays {
    public static int[] intersection(int[] A, int[] B){
        int N = A.length;
        int M = B.length;
        HashSet<Integer> setA = new HashSet<>();
        for(int x: A){
            setA.add(x);
        }

        HashSet<Integer> intersectionSet = new HashSet<>();
        for(int x: B){
            if(setA.contains(x)){
                intersectionSet.add(x);
            }
        }

        int[] result = new int[intersectionSet.size()];
        int i = 0;
        for(int x: intersectionSet){
            result[i] = x;
            i++;
        }

        return result;
    }

    public static void main(String[] args) {
        int[] a = new int[]{1, 2, 1, 3, 1};
        int[] b = new int[]{3, 1, 3, 4, 1};
        int[] result = intersection(a, b);

        for(int x: result){
            System.out.print(x + " ");
        }
        System.out.println();

        a = new int[]{1, 1, 1};
        b = new int[]{1, 1, 1, 1, 1};
        result = intersection(a, b);

        for(int x: result){
            System.out.print(x + " ");
        }
        System.out.println();

        a = new int[]{1, 2, 3};
        b = new int[]{4, 5, 6};
        result = intersection(a, b);

        for(int x: result){
            System.out.print(x + " ");
        }
    }
}
