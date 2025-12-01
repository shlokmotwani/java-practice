package org.example;

public class SearchForARange {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int[] searchRange(final int[] A, int B) {
        int N = A.length;
        int si = -1;
        int ei = -1;
        int left = 0;
        int right = N-1;

        // find the leftmost occurrence
        while(left <= right){
            int mid = left + (right - left)/2;
            if(A[mid] == B){
                si = mid;
                right = mid-1;
            }
            else if(A[mid] > B){
                right = mid-1;
            }
            else{
                left = mid+1;
            }
        }

        left = 0;
        right = N-1;
        // find the rightmost occurrence
        while(left <= right){
            int mid = left + (right - left)/2;
            if(A[mid] == B){
                ei = mid;
                left = mid+1;
            }
            else if(A[mid] > B){
                right = mid-1;
            }
            else{
                left = mid+1;
            }
        }

        return new int[]{si, ei};
    }
}
