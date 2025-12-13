import java.util.Stack;

public class EvaluateExpression {
    public int evalRPN(String[] A) {
        int N = A.length;
        int ans = 0;
        Stack<Integer> stack = new Stack<>();
        for(int i=0; i<N; i++){
            String ch = A[i];
            if(ch.equals("+") || ch.equals("-") || ch.equals("*") || ch.equals("/")){
                int a = stack.pop();
                int b = stack.pop();
                int result = operate(b, ch, a);
                stack.push(result);
            }
            else{
                int num = Integer.valueOf(ch);
                stack.push(num);
            }
        }
        return stack.pop();
    }

    public int operate(int a, String operator, int b){
        if(operator.equals("+")){
            return a+b;
        }
        if(operator.equals("-")){
            return a-b;
        }
        if(operator.equals("*")){
            return a*b;
        }
        if(operator.equals("/")){
            return a/b;
        }
        return -1;
    }
}

