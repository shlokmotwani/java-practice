package org.example;

public class PeakElement {
    public int solve(int[] A) {
        int N = A.length;
        if(N == 1 || A[0] > A[1]){
            return A[0];
        }
        if(A[N-1] > A[N-2]){
            return A[N-1];
        }
        int left = 1;
        int right = N-2;
        while(left <= right){
            int mid = left + (right - left) / 2;
            if((A[mid-1] <= A[mid]) && (A[mid+1] <= A[mid])){
                return A[mid];
            }
            else if(A[mid+1] > A[mid]){
                left = mid+1;
            }
            else{
                right = mid-1;
            }
        }
        return -1;
    }
}
