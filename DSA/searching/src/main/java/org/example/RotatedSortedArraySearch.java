package org.example;

public class RotatedSortedArraySearch {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int search(final int[] A, int B) {
        int N = A.length;

        if(A[0] == B){
            return 0;
        }

        int left = 0;
        int right = N-1;
        while(left <= right){
            int mid = left + (right - left) / 2;
            if(B == A[mid]){
                return mid;
            }
            else if(B > A[0] && A[mid] < A[0]){
                right = mid - 1;
            }
            else if(B < A[0] && A[mid] > A[0]){
                left = mid + 1;
            }
            else{
                if(B > A[mid]){
                    left = mid + 1;
                }
                else{
                    right = mid - 1;
                }
            }

        }
        return -1;
    }
}
