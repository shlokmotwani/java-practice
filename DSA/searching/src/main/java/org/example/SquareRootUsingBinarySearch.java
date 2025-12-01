package org.example;
public class SquareRootUsingBinarySearch {
    public int sqrt(int A) {
        int left = 0;
        int right = A;
        int ans = -1;
        while(left <= right){
            int mid = left + (right - left) / 2;
            long square = (long)mid*mid;
            if(square <= A){
                ans = mid;
                left = mid + 1;
            }
            else{
                right = mid - 1;
            }
        }
        return ans;
    }
}
