import java.util.Arrays;
import java.util.Stack;

public class NearestSmallerElementOnRight {
    public static int[] nsr(int[] A){
        int N = A.length;
        int[] result = new int[N];
        Stack<Integer> stack = new Stack<>();
        for(int i=N-1; i>=0; i--){
            int current = A[i];
            while(!stack.empty() && A[stack.peek()] >= current){
                stack.pop();
            }
            if(stack.empty()){
                result[i] = -1;
            }
            else{
                result[i] = stack.peek();
            }
            stack.push(i);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] A = new int[]{8,2,4,9,7,5,3,10};
        System.out.println(Arrays.toString(nsr(A)));
    }
}
