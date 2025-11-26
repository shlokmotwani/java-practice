public class PickFromBothSides {
    public static int pickFromBothSides(int[] A, int B) {
        int N = A.length;
        int maxSum = Integer.MIN_VALUE;
        int[] pSumFront = new int[N];
        int[] pSumBack = new int[N];
        pSumFront[0] = A[0];
        pSumBack[N-1] = A[N-1];

        for(int i=1; i<N; i++){
            pSumFront[i] = pSumFront[i-1] + A[i];
        }

        for(int i = N-2; i>=0; i--){
            pSumBack[i] = pSumBack[i+1] + A[i];
        }

        for(int front = 0; front<=B; front++){
            int back = B - front;
            int sum = 0;
            if(front == 0){
                sum = pSumBack[N-back];
            }
            else if(front == B){
                sum = pSumFront[front-1];
            }
            else{
                sum = pSumFront[front-1] + pSumBack[N-back];
            }
            maxSum = Math.max(maxSum, sum);
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int[] A = new int[]{5, -2, 3 , 1, 2};
        int B = 3;
        System.out.println(pickFromBothSides(A, B));
    }
}
