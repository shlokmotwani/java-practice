import java.util.Stack;

public class MaxRectangleInBinaryMatrix {
    public int maximalRectangle(int[][] A) {
        int N = A.length;
        int M = A[0].length;

        // intitialize height matrix
        int[][] height = new int[N][M];
        for(int i=0; i<N; i++){
            for(int j=0; j<M; j++){
                if(i == 0){
                    height[i][j] = A[i][j];
                }
                else{
                    if(A[i][j] == 0){
                        height[i][j] = 0;
                    }
                    else{
                        height[i][j] = height[i-1][j] + A[i][j];
                    }
                }
            }
        }

        // initialize nearest shorter element on left matrix
        int[][] nsl = new int[N][M];
        for(int i=0; i<N; i++){
            nsl[i] = findNSL(height[i]);
        }

        // initialize nearest shorter element on right matrix
        int[][] nsr = new int[N][M];
        for(int i=0; i<N; i++){
            nsr[i] = findNSR(height[i]);
        }

        // System.out.println("Printing height array");
        // for(int i=0; i<N; i++){
        //     int[] row = height[i];
        //     System.out.println(Arrays.toString(row));
        // }

        // System.out.println("Printing NSL array");
        // for(int i=0; i<N; i++){
        //     int[] row = nsl[i];
        //     System.out.println(Arrays.toString(row));
        // }

        // System.out.println("Printing NSR array");
        // for(int i=0; i<N; i++){
        //     int[] row = nsr[i];
        //     System.out.println(Arrays.toString(row));
        // }

        int maxAns = 0;
        for(int i=0; i<N; i++){
            for(int j=0; j<M; j++){
                int currentArea = (nsr[i][j] - nsl[i][j] - 1) * height[i][j];
                maxAns = Math.max(maxAns, currentArea);
            }
        }
        return maxAns;
    }

    public int[] findNSL(int[] A){
        int N = A.length;
        int[] result = new int[N];
        Stack<Integer> stack = new Stack<>();
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

    public int[] findNSR(int[] A){
        int N = A.length;
        int[] result = new int[N];
        Stack<Integer> stack = new Stack<>();
        for(int i=N-1; i>=0; i--){
            int current = A[i];
            while(!stack.empty() && A[stack.peek()] >= current){
                stack.pop();
            }

            if(stack.empty()){
                result[i] = N;
            }
            else{
                result[i] = stack.peek();
            }
            stack.push(i);
        }
        return result;
    }
}
