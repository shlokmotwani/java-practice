import java.util.Stack;

public class NearestSmallerElement {
    public int[] prevSmaller(int[] A) {
        int N = A.length;
        Stack<Integer> stack = new Stack<>();
        int[] result = new int[N];
        result[0] = -1;
        stack.push(0);

        for(int i=1; i<N; i++){
            int current = A[i];
            while(!stack.empty()){
                if(A[stack.peek()] < current){
                    break;
                }
                else{
                    stack.pop();
                }
            }
            if(stack.empty()){
                result[i] = -1;
            }
            else{
                int top = stack.peek();
                result[i] = A[top];
            }
            stack.push(i);
        }
        return result;
    }
}

