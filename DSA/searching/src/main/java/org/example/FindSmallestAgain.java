package org.example;

import java.util.Arrays;

public class FindSmallestAgain {
    public int solve(int[] A, int B) {
        int N = A.length;
        Arrays.sort(A);

        long left = A[0] + A[1] + A[2];
        long right = A[N-1] + A[N-2] + A[N-3];
        long ans = 0;

        while(left <= right){
            long mid = left + (right - left) / 2;
            long countTriplets = countTripletsLessEqual(A, mid);
            if(countTriplets >= B){
                ans = mid;
                right = mid - 1;
            }
            else{
                left = mid + 1;
            }
        }
        return (int) ans;
    }

    public long countTripletsLessEqual(int[] A, long target){
        int N = A.length;
        long count = 0;
        for(int i=0; i<N; i++){
            int j = i+1;
            int k = N-1;
            while(j < k){
                if(A[i] + A[j] + A[k] > target){
                    k--;
                }
                else{
                    count += (k-j);
                    j++;
                }
            }
        }
        return count;
    }
}
