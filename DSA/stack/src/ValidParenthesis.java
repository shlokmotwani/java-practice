import java.util.Stack;

public class ValidParenthesis {
    public int solve(String A) {
        int N = A.length();
        Stack<Character> stack = new Stack<>();
        for(int i=0; i<N; i++){
            char ch = A.charAt(i);
            if(ch == '(' || ch == '{' || ch == '['){
                stack.push(ch);
            }
            else{
                if(stack.empty()){
                    return 0;
                }
                char top = stack.peek();
                if((top == '(' && ch == ')') || (top == '{' && ch == '}') || (top == '[' && ch == ']')){
                    stack.pop();
                }
                else{
                    return 0;
                }
            }
        }
        if(!stack.empty()){
            return 0;
        }

        return 1;
    }
}
