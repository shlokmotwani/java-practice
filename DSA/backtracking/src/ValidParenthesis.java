import java.util.ArrayList;

public class ValidParenthesis {
    public static void print(int N, int open, int close, String str, ArrayList<String> list){
        if(open > N/2){
            return;
        }
        if(close > open){
            return;
        }
        if(open+close == N){
            list.add(str);
            return;
        }
        print(N, open+1, close, str+"(", list);
        print(N, open, close+1, str+")", list);
    }
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        print(6, 0, 0, "", list);
        for(String str: list){
            System.out.println(str);
        }
    }
}