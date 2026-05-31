import java.util.ArrayList;

public class Staircase {
    public static void ways(int N, ArrayList<Integer> current, ArrayList<ArrayList<Integer>> result){
        if(N < 0){
            return;
        }
        if(N == 0){
            result.add(new ArrayList<>(current));
            return;
        }

        current.add(1);
        ways(N-1, current, result);
        current.remove(current.size()-1);

        current.add(2);
        ways(N-2, current, result);
        current.remove(current.size()-1);
    }

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        ways(4, new ArrayList<>(), result);
        for(ArrayList<Integer> temp: result){
            System.out.print("[ ");
            for(int x: temp){
                System.out.print(x + " ");
            }
            System.out.print("]");
            System.out.println();
        }
    }
}
