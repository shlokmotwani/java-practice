import java.util.ArrayList;

public class PrintAllMazePaths {
    public static void paths(int x, int y, int A, int B, StringBuilder current, ArrayList<String> result){
        // sanity check
        if(x < 0 || x >= A || y < 0 || y >= B){
            return;
        }

        // base case
        if(x == A-1 && y == B-1){
            result.add(current.toString());
            return;
        }

        // go down
        current.append("D");
        paths(x+1, y, A, B, current, result);
        current.deleteCharAt(current.length()-1);

        // go right
        current.append("R");
        paths(x, y+1, A, B, current, result);
        current.deleteCharAt(current.length()-1);
    }

    public static void main(String[] args) {
        ArrayList<String> result = new ArrayList<>();
        paths(0, 0, 3, 2, new StringBuilder(), result);
        for(String str: result){
            System.out.print(str + " ");
        }
    }
}
