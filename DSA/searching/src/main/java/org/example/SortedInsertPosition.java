package org.example;
public class SortedInsertPosition {
    public int searchInsert(int[] A, int B) {
        int N = A.length;
        int left = 0;
        int right = N-1;
        int result = N;
        while(left <= right){
            int mid = left + (right - left) / 2;
            if(A[mid] == B){
                return mid;
            }
            else if(A[mid] >= B){
                result = mid;
                right = mid-1;
            }
            else{
                left = mid+1;
            }
        }
        return result;
    }
}
