package org.example;

public class SingleElementInSortedArray {
    public int solve(int[] A) {
        int N = A.length;

        if(N == 1 || A[0] != A[1]){
            return A[0];
        }

        if(A[N-1] != A[N-2]){
            return A[N-1];
        }

        int left = 1;
        int right = N-2;
        int mid = -1;

        while(left <= right){
            mid = left + (right - left) / 2;

            if(A[mid] != A[mid-1] && A[mid] != A[mid+1]){
                break;
            }

            int fo = mid;
            if(A[mid] == A[mid-1]){
                fo = mid-1;
            }

            if(fo % 2 == 0){
                left = mid + 1;
            }
            else{
                right = mid - 1;
            }
        }
        return A[mid];
    }
}
