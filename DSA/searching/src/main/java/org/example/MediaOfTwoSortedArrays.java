package org.example;

public class MediaOfTwoSortedArrays {
    public int solve(int[] A, int[] B) {
        // the first array should always be smaller in length to avoid IndexOutOfBoundsException
        if(A.length > B.length){
            return median(B, A);
        }
        return median(A, B);
    }

    public static int median(int[] A, int[] B){
        int N = A.length;
        int M = B.length;
        int balance = (N+M+1)/2;

        int left = 0;
        int right = Math.min(N, balance);

        while(left <= right){
            int mid = left + (right - left) / 2;
            int rem = balance - mid;

            int l1 = mid > 0 ? A[mid-1] : Integer.MIN_VALUE;
            int r1 = mid < N ? A[mid] : Integer.MAX_VALUE;
            int l2 = rem > 0 ? B[rem-1] : Integer.MIN_VALUE;
            int r2 = rem < M ? B[rem] : Integer.MAX_VALUE;

            if(l1 > r2){
                right = mid - 1;
            }
            else if(l2 > r1){
                left = mid + 1;
            }
            else{
                if((N+M) % 2 == 0){
                    int a = Math.max(l1, l2);
                    int b = Math.min(r1, r2);
                    return (a+b)/2;
                }
                else{
                    return Math.max(l1, l2);
                }
            }
        }
        return -1;
    }
}
