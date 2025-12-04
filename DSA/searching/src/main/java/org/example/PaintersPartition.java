package org.example;

import java.util.Arrays;

public class PaintersPartition {
    public static int paint(int A, int B, int[] C) {
        int N = C.length;
        int MOD = 10000003;

        long[] D = new long[N];
        for(int i=0; i<N; i++){
            D[i] = (long)C[i]*B;
        }
        System.out.println(Arrays.toString(D));

        long maxLength = 0;
        long sum = 0;
        for(int i=0; i<N; i++){
            maxLength = Math.max(D[i], maxLength);
            sum += D[i];
        }

        System.out.println(String.format("maxLength = %s", maxLength));
        System.out.println(String.format("sum = %s", sum));

        long left = maxLength;
        long right = sum;
        long result = -1;
        while(left <= right){
            long mid = left + (right - left) / 2;
            System.out.println(String.format("left: %s, mid: %s, right: %s", left, mid, right));
            if(isPossible(A, B, D, mid)){
                result = mid;
                right = mid-1;
                System.out.println(String.format("result = %s", result));

            }
            else{
                left = mid+1;
            }
        }
        return (int)(result % MOD);
    }

    public static boolean isPossible(int A, int B, long[] D, long mid){
        int N = D.length;
        long timeLeft = mid;
        int i = 0;
        int painters = 1;
        while(i < N){
            if(D[i] > timeLeft){
                painters++;
                timeLeft = mid - D[i];
            }
            else{
                timeLeft -= D[i];
            }
            i++;
        }
        if(painters > A){
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int[] C = new int[]{640, 435, 647, 352, 8, 90, 960, 329, 859};
        System.out.println(paint(3, 10, C));
    }
}
