import java.util.Arrays;
import java.util.Stack;

public class NearestSmallerElementAgain {
    public static int[] nse(int[] A){
        int N = A.length;
        Stack<Integer> stack = new Stack<>();
        int[] result = new int[N];
        for(int i=0; i<N; i++){
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
        System.out.println(Arrays.toString(nse(A)));
    }
}
