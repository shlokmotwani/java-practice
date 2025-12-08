package org.example;

import java.util.Arrays;

public class BooksAllocation {
    public static int books(int[] A, int B) {
        int N = A.length;
        Arrays.sort(A);
        int left = A[0];
        int right = 0;
        for(int i=0; i<N; i++){
            right += A[i];
        }

        int result = -1;
        while(left <= right){
            int mid = left + (right - left)/2;
            if(canAllocate(A, B, mid)){
                result = mid;
                right = mid-1;
            }
            else{
                left = mid + 1;
            }
        }
        return result;
    }

    public static boolean canAllocate(int[] A, int B, int mid){
        int N = A.length;
        int pagesLeft = mid;
        int count = 1;

        for(int i=0; i<N; i++){
            if(pagesLeft - A[i] >= 0){
                pagesLeft -= A[i];
            }
            else{
                count++;
                pagesLeft = mid - A[i];
            }

            if(count == B){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] A = {12, 34, 67, 90};
        System.out.println(books(A, 2));
    }
}

