import java.util.ArrayList;

public class LeadersInArray {
    public static ArrayList<Integer> countLeaders(int[] A){
        int N = A.length;
        ArrayList<Integer> list = new ArrayList<>();
        list.add(A[N-1]);
        int max = A[N-1];

        for(int i=N-2; i>=0; i--){
            if(A[i] > max){
                max = A[i];
                list.add(max);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        int[] arr = {16, 17, 4, 3, 5, 2};
        int[] arr2 = {1, 2, 3, 4, 5, 2};
        ArrayList<Integer> list = countLeaders(arr);
        for(int item: list){
            System.out.print(item + " ");

        }
        System.out.println();
        list = countLeaders(arr2);
        for(int item: list){
            System.out.print(item + " ");
        }
    }
}
