import java.util.ArrayList;

public class Subsets {
    public static void subsets(int[] A, int idx, ArrayList<Integer> current, ArrayList<ArrayList<Integer>> result){
        int N = A.length;
        if(idx < 0 || idx > N){
            return;
        }
        if(idx == N){
            ArrayList<Integer> temp = new ArrayList<>();
            for(int i=0; i<current.size(); i++){
                temp.add(current.get(i));
            }
            result.add(temp);
            return;
        }
        // option 1 : choose element at index idx
        current.add(A[idx]);
        subsets(A, idx+1, current, result);
        // undo
        current.remove(current.size()-1);

        // option 2 :  not choose element at index idx
        subsets(A, idx+1, current, result);
    }
    public static void main(String[] args) {
        int[] A = {5, 2, 7};
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        ArrayList<Integer> current = new ArrayList<>();
        subsets(A, 0, current, result);

        for(int i=0; i<result.size(); i++){
            ArrayList<Integer> temp = result.get(i);
            System.out.print("[");
            for(int j=0; j<temp.size(); j++){
                System.out.print(temp.get(j));
            }
            System.out.print("]");
            System.out.println();
        }
    }
}
