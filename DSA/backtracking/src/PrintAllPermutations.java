import java.util.ArrayList;

public class PrintAllPermutations {
    public static void fun(String str, int pos, StringBuilder current, ArrayList<String> result, boolean[] used){
        int N = str.length();
        if(pos < 0 || pos > N){
            return;
        }
        if(pos == N){
            result.add(current.toString());
            return;
        }
        for(int i=0; i<N; i++){
            if(used[i]){
                continue;
            }
            used[i] = true;
            current.append(str.charAt(i));
            fun(str, pos+1, current, result, used);
            current.deleteCharAt(current.length()-1);
            used[i] = false;
        }
    }
    public static void main(String[] args) {
        String str = "ABC";
        int N = str.length();
        boolean[] used = new boolean[N];

        StringBuilder current = new StringBuilder();
        ArrayList<String> result = new ArrayList<>();
        fun(str, 0, current, result, used);

        for(String s : result){
            System.out.print(s + " ");
        }
    }
}
